import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fib extends fhz {
   private static final Logger j = LogUtils.getLogger();
   public String a = "";
   public String b = "";
   public String c = "";
   public String d = "";
   public String e = "";
   @Nullable
   public String f;
   public String g = "";
   public String h = "";
   public fib.a i = fib.a.a;

   public static fib a(JsonObject $$0) {
      fib $$1 = new fib();

      try {
         $$1.a = fjv.b("id", $$0, "");
         $$1.b = fjv.b("name", $$0, "");
         $$1.c = fjv.b("version", $$0, "");
         $$1.d = fjv.b("author", $$0, "");
         $$1.e = fjv.b("link", $$0, "");
         $$1.f = fjv.b("image", $$0, null);
         $$1.g = fjv.b("trailer", $$0, "");
         $$1.h = fjv.b("recommendedPlayers", $$0, "");
         $$1.i = fib.a.valueOf(fjv.b("type", $$0, fib.a.a.name()));
      } catch (Exception var3) {
         j.error("Could not parse WorldTemplate: {}", var3.getMessage());
      }

      return $$1;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
