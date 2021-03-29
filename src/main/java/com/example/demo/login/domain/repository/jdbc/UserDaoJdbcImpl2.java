package com.example.demo.login.domain.repository.jdbc;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import com.example.demo.login.domain.model.User;

@Repository("UserDaoJdbcImpl2")
public class UserDaoJdbcImpl2 extends UserDaoJdbcImpl {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public User selectOne(String userName) {
		String sql = "SELECT * FROM m_user WHERE user_name = ?";

		UserRowMapper rowMapper = new UserRowMapper();

		return jdbc.queryForObject(sql, rowMapper, userName);
	}

}
