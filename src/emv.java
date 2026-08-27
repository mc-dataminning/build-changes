import com.google.gson.annotations.SerializedName;

public class emv extends enn implements enh {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public emv(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
