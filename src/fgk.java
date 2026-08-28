import com.google.gson.JsonObject;

public class fgk extends fgo {
   public String a;
   public long b;
   public long c;

   public static fgk a(JsonObject $$0) {
      fgk $$1 = new fgk();

      try {
         $$1.a = fik.b("profileUuid", $$0, null);
         $$1.b = fik.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fik.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
