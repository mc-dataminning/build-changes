import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class flz extends fmd {
   @Nullable
   public String a;
   public long b;
   public long c;

   public static flz a(JsonObject $$0) {
      flz $$1 = new flz();

      try {
         $$1.a = fnz.b("profileUuid", $$0, null);
         $$1.b = fnz.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fnz.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
