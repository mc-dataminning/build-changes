import com.google.gson.annotations.SerializedName;

public class ete extends etw implements etq {
   @SerializedName("name")
   public String a;
   @SerializedName("description")
   public String b;

   public ete(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }
}
