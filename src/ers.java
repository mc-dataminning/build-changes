import com.google.gson.JsonObject;

public class ers extends erw {
   public String a;
   public long b;
   public long c;

   public static ers a(JsonObject $$0) {
      ers $$1 = new ers();

      try {
         $$1.a = ett.b("profileUuid", $$0, null);
         $$1.b = ett.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = ett.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
