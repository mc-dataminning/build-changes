import com.google.gson.annotations.SerializedName;

public class enl extends eod implements enx {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public enl(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
