import com.google.gson.JsonObject;

public class fek extends feo {
   public String a;
   public long b;
   public long c;

   public static fek a(JsonObject $$0) {
      fek $$1 = new fek();

      try {
         $$1.a = fgl.b("profileUuid", $$0, null);
         $$1.b = fgl.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fgl.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
