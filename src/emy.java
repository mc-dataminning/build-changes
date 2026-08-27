import com.google.gson.JsonObject;

public class emy extends enc {
   public String a;
   public long b;
   public long c;

   public static emy a(JsonObject $$0) {
      emy $$1 = new emy();

      try {
         $$1.a = eoz.a("profileUuid", $$0, null);
         $$1.b = eoz.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = eoz.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
