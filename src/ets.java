import com.google.gson.JsonObject;

public class ets extends etw {
   public String a;
   public long b;
   public long c;

   public static ets a(JsonObject $$0) {
      ets $$1 = new ets();

      try {
         $$1.a = evt.b("profileUuid", $$0, null);
         $$1.b = evt.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = evt.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
