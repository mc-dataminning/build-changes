import com.google.gson.JsonObject;

public class fir extends fiv {
   public String a;
   public long b;
   public long c;

   public static fir a(JsonObject $$0) {
      fir $$1 = new fir();

      try {
         $$1.a = fkr.b("profileUuid", $$0, null);
         $$1.b = fkr.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fkr.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
