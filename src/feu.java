import com.google.gson.JsonObject;

public class feu extends fey {
   public String a;
   public long b;
   public long c;

   public static feu a(JsonObject $$0) {
      feu $$1 = new feu();

      try {
         $$1.a = fgv.b("profileUuid", $$0, null);
         $$1.b = fgv.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fgv.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
