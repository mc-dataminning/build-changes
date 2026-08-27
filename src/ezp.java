import com.google.gson.JsonObject;

public class ezp extends ezt {
   public String a;
   public long b;
   public long c;

   public static ezp a(JsonObject $$0) {
      ezp $$1 = new ezp();

      try {
         $$1.a = fbq.b("profileUuid", $$0, null);
         $$1.b = fbq.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fbq.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
