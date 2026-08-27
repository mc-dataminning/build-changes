import com.google.gson.JsonObject;

public class eya extends eye {
   public String a;
   public long b;
   public long c;

   public static eya a(JsonObject $$0) {
      eya $$1 = new eya();

      try {
         $$1.a = fab.b("profileUuid", $$0, null);
         $$1.b = fab.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fab.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
