import com.google.gson.annotations.SerializedName;

public class fbe extends fbw implements fbq {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public fbe(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
