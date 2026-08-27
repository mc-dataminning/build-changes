import com.google.gson.JsonObject;

public class evt extends evx {
   public String a;
   public long b;
   public long c;

   public static evt a(JsonObject $$0) {
      evt $$1 = new evt();

      try {
         $$1.a = exu.b("profileUuid", $$0, null);
         $$1.b = exu.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = exu.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
