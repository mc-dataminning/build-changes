import com.google.gson.JsonObject;

public class eyj extends eyn {
   public String a;
   public long b;
   public long c;

   public static eyj a(JsonObject $$0) {
      eyj $$1 = new eyj();

      try {
         $$1.a = fak.b("profileUuid", $$0, null);
         $$1.b = fak.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fak.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
