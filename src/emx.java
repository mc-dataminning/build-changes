import com.google.gson.JsonObject;

public class emx extends enb {
   public String a;
   public long b;
   public long c;

   public static emx a(JsonObject $$0) {
      emx $$1 = new emx();

      try {
         $$1.a = eoy.a("profileUuid", $$0, null);
         $$1.b = eoy.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = eoy.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
