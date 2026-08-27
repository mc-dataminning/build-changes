import com.google.gson.annotations.SerializedName;

public class evd extends evv implements evp {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public evd(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
