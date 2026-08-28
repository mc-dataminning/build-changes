import com.google.gson.annotations.SerializedName;

public class fbq extends fci implements fcc {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public fbq(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
