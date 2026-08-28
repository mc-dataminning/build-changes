import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class fno extends fns {
   @Nullable
   public String a;
   public long b;
   public long c;

   public static fno a(JsonObject $$0) {
      fno $$1 = new fno();

      try {
         $$1.a = fpp.b("profileUuid", $$0, null);
         $$1.b = fpp.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fpp.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
