package jp.co.sample.emp_management.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message = "値を入力してください")
	@Size(min = 1, max = 50, message = "1〜127文字以内で入力して下さい")
	private String name;
	/** メールアドレス */
	@Size(min = 1, max = 127, message = "1〜127文字以内で入力して下さい")
	@NotBlank(message = "値を入力してください")
	@Email(message = "メールアドレスの形式が不正です")
	private String mailAddress;
	/** パスワード */
	@NotBlank(message = "値を入力してください")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ "]";
	}

}
