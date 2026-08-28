import com.google.gson.JsonObject;

public class fby extends fcc {
   public String a;
   public long b;
   public long c;

   public static fby a(JsonObject $$0) {
      fby $$1 = new fby();

      try {
         $$1.a = fdz.b("profileUuid", $$0, null);
         $$1.b = fdz.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fdz.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
