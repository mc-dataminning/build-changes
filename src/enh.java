import com.google.gson.JsonObject;

public class enh extends enl {
   public String a;
   public long b;
   public long c;

   public static enh a(JsonObject $$0) {
      enh $$1 = new enh();

      try {
         $$1.a = epi.a("profileUuid", $$0, null);
         $$1.b = epi.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = epi.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
