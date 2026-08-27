import com.google.gson.JsonObject;

public class eqv extends eqz {
   public String a;
   public long b;
   public long c;

   public static eqv a(JsonObject $$0) {
      eqv $$1 = new eqv();

      try {
         $$1.a = esw.b("profileUuid", $$0, null);
         $$1.b = esw.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = esw.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
