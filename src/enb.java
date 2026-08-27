import com.google.gson.JsonObject;

public class enb extends enf {
   public String a;
   public long b;
   public long c;

   public static enb a(JsonObject $$0) {
      enb $$1 = new enb();

      try {
         $$1.a = epc.a("profileUuid", $$0, null);
         $$1.b = epc.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = epc.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
