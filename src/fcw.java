import com.google.gson.JsonObject;

public class fcw extends fda {
   public String a;
   public long b;
   public long c;

   public static fcw a(JsonObject $$0) {
      fcw $$1 = new fcw();

      try {
         $$1.a = fex.b("profileUuid", $$0, null);
         $$1.b = fex.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fex.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
