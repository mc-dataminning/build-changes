import com.google.gson.JsonObject;

public class ezf extends ezj {
   public String a;
   public long b;
   public long c;

   public static ezf a(JsonObject $$0) {
      ezf $$1 = new ezf();

      try {
         $$1.a = fbg.b("profileUuid", $$0, null);
         $$1.b = fbg.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fbg.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
