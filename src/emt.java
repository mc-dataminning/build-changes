import com.google.gson.annotations.SerializedName;

public class emt extends enl implements enf {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public emt(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
