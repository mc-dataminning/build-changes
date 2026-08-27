import com.google.gson.JsonObject;

public class euv extends euz {
   public String a;
   public long b;
   public long c;

   public static euv a(JsonObject $$0) {
      euv $$1 = new euv();

      try {
         $$1.a = eww.b("profileUuid", $$0, null);
         $$1.b = eww.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = eww.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
