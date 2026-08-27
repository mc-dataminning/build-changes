import com.google.gson.JsonObject;

public class enc extends eng {
   public String a;
   public long b;
   public long c;

   public static enc a(JsonObject $$0) {
      enc $$1 = new enc();

      try {
         $$1.a = epd.a("profileUuid", $$0, null);
         $$1.b = epd.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = epd.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
