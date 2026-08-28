import com.google.gson.annotations.SerializedName;

public class fbd extends fbv implements fbp {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public fbd(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
