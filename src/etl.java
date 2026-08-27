import com.google.gson.annotations.SerializedName;

public class etl extends eud implements etx {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public etl(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
