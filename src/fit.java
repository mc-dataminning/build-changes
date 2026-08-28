import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class fit extends fix {
   @Nullable
   public String a;
   public long b;
   public long c;

   public static fit a(JsonObject $$0) {
      fit $$1 = new fit();

      try {
         $$1.a = fkt.b("profileUuid", $$0, null);
         $$1.b = fkt.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fkt.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
