import com.google.gson.annotations.SerializedName;

public class fbs extends fck implements fce {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public fbs(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
