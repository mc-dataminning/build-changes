import com.google.gson.JsonObject;

public class epo extends eps {
   public String a;
   public long b;
   public long c;

   public static epo a(JsonObject $$0) {
      epo $$1 = new epo();

      try {
         $$1.a = erp.b("profileUuid", $$0, null);
         $$1.b = erp.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = erp.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
