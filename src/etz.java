import com.google.gson.JsonObject;

public class etz extends eud {
   public String a;
   public long b;
   public long c;

   public static etz a(JsonObject $$0) {
      etz $$1 = new etz();

      try {
         $$1.a = ewa.b("profileUuid", $$0, null);
         $$1.b = ewa.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = ewa.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
