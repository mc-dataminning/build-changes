import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class evx extends evv {
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
   public evx.a i = evx.a.a;

   public static evx a(JsonObject $$0) {
      evx $$1 = new evx();

      try {
         $$1.a = exs.b("id", $$0, "");
         $$1.b = exs.b("name", $$0, "");
         $$1.c = exs.b("version", $$0, "");
         $$1.d = exs.b("author", $$0, "");
         $$1.e = exs.b("link", $$0, "");
         $$1.f = exs.b("image", $$0, null);
         $$1.g = exs.b("trailer", $$0, "");
         $$1.h = exs.b("recommendedPlayers", $$0, "");
         $$1.i = evx.a.valueOf(exs.b("type", $$0, evx.a.a.name()));
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
