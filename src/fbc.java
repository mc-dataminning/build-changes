import com.google.gson.annotations.SerializedName;

public class fbc extends fbu implements fbo {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public fbc(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
