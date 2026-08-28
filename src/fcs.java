import com.google.gson.JsonObject;

public class fcs extends fcw {
   public String a;
   public long b;
   public long c;

   public static fcs a(JsonObject $$0) {
      fcs $$1 = new fcs();

      try {
         $$1.a = fet.b("profileUuid", $$0, null);
         $$1.b = fet.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fet.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
