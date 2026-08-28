import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class fhu extends fhy {
   @Nullable
   public String a;
   public long b;
   public long c;

   public static fhu a(JsonObject $$0) {
      fhu $$1 = new fhu();

      try {
         $$1.a = fju.b("profileUuid", $$0, null);
         $$1.b = fju.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fju.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
