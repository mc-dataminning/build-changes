import com.google.gson.annotations.SerializedName;

public class fba extends fbs implements fbm {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public fba(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
