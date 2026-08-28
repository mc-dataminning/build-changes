import com.google.gson.JsonObject;

public class fbl extends fbp {
   public String a;
   public long b;
   public long c;

   public static fbl a(JsonObject $$0) {
      fbl $$1 = new fbl();

      try {
         $$1.a = fdm.b("profileUuid", $$0, null);
         $$1.b = fdm.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fdm.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
