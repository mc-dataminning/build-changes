import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class fme extends fmi {
   @Nullable
   public String a;
   public long b;
   public long c;

   public static fme a(JsonObject $$0) {
      fme $$1 = new fme();

      try {
         $$1.a = foe.b("profileUuid", $$0, null);
         $$1.b = foe.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = foe.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
