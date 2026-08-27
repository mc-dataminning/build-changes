import com.google.gson.JsonObject;

public class epc extends epg {
   public String a;
   public long b;
   public long c;

   public static epc a(JsonObject $$0) {
      epc $$1 = new epc();

      try {
         $$1.a = erd.b("profileUuid", $$0, null);
         $$1.b = erd.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = erd.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
