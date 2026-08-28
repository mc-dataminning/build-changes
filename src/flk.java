import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class flk extends flo {
   @Nullable
   public String a;
   public long b;
   public long c;

   public static flk a(JsonObject $$0) {
      flk $$1 = new flk();

      try {
         $$1.a = fnk.b("profileUuid", $$0, null);
         $$1.b = fnk.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fnk.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
