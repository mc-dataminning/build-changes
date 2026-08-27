import com.google.gson.JsonObject;

public class ert extends erx {
   public String a;
   public long b;
   public long c;

   public static ert a(JsonObject $$0) {
      ert $$1 = new ert();

      try {
         $$1.a = etu.b("profileUuid", $$0, null);
         $$1.b = etu.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = etu.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
