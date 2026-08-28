import com.google.gson.annotations.SerializedName;

public class fke extends fkv implements fkp {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public fke(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
