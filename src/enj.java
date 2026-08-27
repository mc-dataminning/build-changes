import com.google.gson.JsonObject;

public class enj extends enn {
   public String a;
   public long b;
   public long c;

   public static enj a(JsonObject $$0) {
      enj $$1 = new enj();

      try {
         $$1.a = epk.a("profileUuid", $$0, null);
         $$1.b = epk.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = epk.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
