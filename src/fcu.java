import com.google.gson.JsonObject;

public class fcu extends fcy {
   public String a;
   public long b;
   public long c;

   public static fcu a(JsonObject $$0) {
      fcu $$1 = new fcu();

      try {
         $$1.a = fev.b("profileUuid", $$0, null);
         $$1.b = fev.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fev.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
