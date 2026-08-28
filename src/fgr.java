import com.google.gson.JsonObject;

public class fgr extends fgv {
   public String a;
   public long b;
   public long c;

   public static fgr a(JsonObject $$0) {
      fgr $$1 = new fgr();

      try {
         $$1.a = fir.b("profileUuid", $$0, null);
         $$1.b = fir.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fir.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
