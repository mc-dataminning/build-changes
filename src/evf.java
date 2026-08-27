import com.google.gson.annotations.SerializedName;

public class evf extends evx implements evr {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public evf(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
