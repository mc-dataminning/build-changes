import com.google.gson.annotations.SerializedName;

public class fig extends fix implements fir {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public fig(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
