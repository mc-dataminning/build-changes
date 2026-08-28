import com.google.gson.annotations.SerializedName;
import java.util.Locale;

public class fex extends ffc implements few {
   @SerializedName("regionName")
   private final String a;
   @SerializedName("ping")
   private final int b;

   public fex(String $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.b;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "%s --> %.2f ms", this.a, (float)this.b);
   }
}
