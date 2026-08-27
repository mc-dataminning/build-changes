import com.google.gson.annotations.SerializedName;

public class epf extends epx implements epr {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public epf(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
