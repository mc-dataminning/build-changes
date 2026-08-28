import com.google.gson.JsonObject;

public class fbs extends fbw {
   public String a;
   public long b;
   public long c;

   public static fbs a(JsonObject $$0) {
      fbs $$1 = new fbs();

      try {
         $$1.a = fdt.b("profileUuid", $$0, null);
         $$1.b = fdt.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fdt.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
