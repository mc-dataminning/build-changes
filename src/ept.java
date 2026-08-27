import com.google.gson.JsonObject;

public class ept extends epx {
   public String a;
   public long b;
   public long c;

   public static ept a(JsonObject $$0) {
      ept $$1 = new ept();

      try {
         $$1.a = eru.b("profileUuid", $$0, null);
         $$1.b = eru.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = eru.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
