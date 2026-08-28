import com.google.gson.annotations.SerializedName;

public class fbb extends fbt implements fbn {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public fbb(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
