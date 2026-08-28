import com.google.gson.JsonObject;

public class fcy extends fdc {
   public String a;
   public long b;
   public long c;

   public static fcy a(JsonObject $$0) {
      fcy $$1 = new fcy();

      try {
         $$1.a = fez.b("profileUuid", $$0, null);
         $$1.b = fez.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fez.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
