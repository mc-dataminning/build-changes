import com.google.gson.annotations.SerializedName;

public class flm extends fmd implements flx {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public flm(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
