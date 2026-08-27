import com.google.gson.JsonObject;

public class enz extends eod {
   public String a;
   public long b;
   public long c;

   public static enz a(JsonObject $$0) {
      enz $$1 = new enz();

      try {
         $$1.a = eqa.a("profileUuid", $$0, null);
         $$1.b = eqa.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = eqa.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
