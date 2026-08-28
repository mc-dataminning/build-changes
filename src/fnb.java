import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class fnb extends fnf {
   @Nullable
   public String a;
   public long b;
   public long c;

   public static fnb a(JsonObject $$0) {
      fnb $$1 = new fnb();

      try {
         $$1.a = fpc.b("profileUuid", $$0, null);
         $$1.b = fpc.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fpc.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
