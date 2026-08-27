import com.google.gson.JsonObject;

public class fam extends faq {
   public String a;
   public long b;
   public long c;

   public static fam a(JsonObject $$0) {
      fam $$1 = new fam();

      try {
         $$1.a = fcn.b("profileUuid", $$0, null);
         $$1.b = fcn.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fcn.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
