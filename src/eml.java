import com.google.gson.annotations.SerializedName;

public class eml extends end implements emx {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public eml(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
