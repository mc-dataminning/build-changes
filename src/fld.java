import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class fld extends flh {
   @Nullable
   public String a;
   public long b;
   public long c;

   public static fld a(JsonObject $$0) {
      fld $$1 = new fld();

      try {
         $$1.a = fnd.b("profileUuid", $$0, null);
         $$1.b = fnd.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fnd.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
