import com.google.gson.JsonObject;

public class ffr extends ffv {
   public String a;
   public long b;
   public long c;

   public static ffr a(JsonObject $$0) {
      ffr $$1 = new ffr();

      try {
         $$1.a = fhs.b("profileUuid", $$0, null);
         $$1.b = fhs.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fhs.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
