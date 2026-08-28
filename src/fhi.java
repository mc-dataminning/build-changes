import com.google.gson.annotations.SerializedName;

public class fhi extends fhz implements fht {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public fhi(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
