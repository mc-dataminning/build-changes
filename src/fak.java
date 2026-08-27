import com.google.gson.JsonObject;

public class fak extends fao {
   public String a;
   public long b;
   public long c;

   public static fak a(JsonObject $$0) {
      fak $$1 = new fak();

      try {
         $$1.a = fcl.b("profileUuid", $$0, null);
         $$1.b = fcl.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fcl.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
