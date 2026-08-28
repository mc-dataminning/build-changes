import com.google.gson.JsonObject;

public class fey extends ffc {
   public String a;
   public long b;
   public long c;

   public static fey a(JsonObject $$0) {
      fey $$1 = new fey();

      try {
         $$1.a = fgz.b("profileUuid", $$0, null);
         $$1.b = fgz.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fgz.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
