import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class fnq extends fnu {
   @Nullable
   public String a;
   public long b;
   public long c;

   public static fnq a(JsonObject $$0) {
      fnq $$1 = new fnq();

      try {
         $$1.a = fpr.b("profileUuid", $$0, null);
         $$1.b = fpr.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fpr.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
