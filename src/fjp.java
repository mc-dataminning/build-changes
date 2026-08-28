import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class fjp extends fjt {
   @Nullable
   public String a;
   public long b;
   public long c;

   public static fjp a(JsonObject $$0) {
      fjp $$1 = new fjp();

      try {
         $$1.a = flp.b("profileUuid", $$0, null);
         $$1.b = flp.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = flp.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
