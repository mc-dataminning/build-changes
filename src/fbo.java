import com.google.gson.JsonObject;

public class fbo extends fbs {
   public String a;
   public long b;
   public long c;

   public static fbo a(JsonObject $$0) {
      fbo $$1 = new fbo();

      try {
         $$1.a = fdp.b("profileUuid", $$0, null);
         $$1.b = fdp.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fdp.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
