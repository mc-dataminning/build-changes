import com.google.gson.JsonObject;

public class fcg extends fck {
   public String a;
   public long b;
   public long c;

   public static fcg a(JsonObject $$0) {
      fcg $$1 = new fcg();

      try {
         $$1.a = feh.b("profileUuid", $$0, null);
         $$1.b = feh.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = feh.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
