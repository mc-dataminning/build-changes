import com.google.gson.annotations.SerializedName;

public class fcm extends fdc implements fcw {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public fcm(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
