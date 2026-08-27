import com.google.gson.annotations.SerializedName;

public class eoo extends epg implements epa {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public eoo(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
