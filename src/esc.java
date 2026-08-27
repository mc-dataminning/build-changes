import com.google.gson.JsonObject;

public class esc extends esg {
   public String a;
   public long b;
   public long c;

   public static esc a(JsonObject $$0) {
      esc $$1 = new esc();

      try {
         $$1.a = eud.b("profileUuid", $$0, null);
         $$1.b = eud.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = eud.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
