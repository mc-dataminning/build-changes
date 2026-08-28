import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class fhw extends fia {
   @Nullable
   public String a;
   public long b;
   public long c;

   public static fhw a(JsonObject $$0) {
      fhw $$1 = new fhw();

      try {
         $$1.a = fjw.b("profileUuid", $$0, null);
         $$1.b = fjw.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fjw.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
