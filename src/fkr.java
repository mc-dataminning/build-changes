import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class fkr extends fkv {
   @Nullable
   public String a;
   public long b;
   public long c;

   public static fkr a(JsonObject $$0) {
      fkr $$1 = new fkr();

      try {
         $$1.a = fmr.b("profileUuid", $$0, null);
         $$1.b = fmr.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fmr.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
