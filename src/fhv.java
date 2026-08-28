import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class fhv extends fhz {
   @Nullable
   public String a;
   public long b;
   public long c;

   public static fhv a(JsonObject $$0) {
      fhv $$1 = new fhv();

      try {
         $$1.a = fjv.b("profileUuid", $$0, null);
         $$1.b = fjv.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fjv.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
