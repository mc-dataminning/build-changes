import com.google.gson.JsonObject;

public class fce extends fci {
   public String a;
   public long b;
   public long c;

   public static fce a(JsonObject $$0) {
      fce $$1 = new fce();

      try {
         $$1.a = fef.b("profileUuid", $$0, null);
         $$1.b = fef.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fef.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
