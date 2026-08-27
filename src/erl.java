import com.google.gson.JsonObject;

public class erl extends erp {
   public String a;
   public long b;
   public long c;

   public static erl a(JsonObject $$0) {
      erl $$1 = new erl();

      try {
         $$1.a = etm.b("profileUuid", $$0, null);
         $$1.b = etm.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = etm.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
