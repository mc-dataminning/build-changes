import com.google.gson.JsonObject;

public class err extends erv {
   public String a;
   public long b;
   public long c;

   public static err a(JsonObject $$0) {
      err $$1 = new err();

      try {
         $$1.a = ets.b("profileUuid", $$0, null);
         $$1.b = ets.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = ets.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
