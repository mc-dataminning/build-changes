import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class fis extends fiw {
   @Nullable
   public String a;
   public long b;
   public long c;

   public static fis a(JsonObject $$0) {
      fis $$1 = new fis();

      try {
         $$1.a = fks.b("profileUuid", $$0, null);
         $$1.b = fks.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fks.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
