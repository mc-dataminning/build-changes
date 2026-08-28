import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class fht extends fhx {
   @Nullable
   public String a;
   public long b;
   public long c;

   public static fht a(JsonObject $$0) {
      fht $$1 = new fht();

      try {
         $$1.a = fjt.b("profileUuid", $$0, null);
         $$1.b = fjt.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fjt.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
