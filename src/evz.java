import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class evz extends evx {
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
   public evz.a i = evz.a.a;

   public static evz a(JsonObject $$0) {
      evz $$1 = new evz();

      try {
         $$1.a = exu.b("id", $$0, "");
         $$1.b = exu.b("name", $$0, "");
         $$1.c = exu.b("version", $$0, "");
         $$1.d = exu.b("author", $$0, "");
         $$1.e = exu.b("link", $$0, "");
         $$1.f = exu.b("image", $$0, null);
         $$1.g = exu.b("trailer", $$0, "");
         $$1.h = exu.b("recommendedPlayers", $$0, "");
         $$1.i = evz.a.valueOf(exu.b("type", $$0, evz.a.a.name()));
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
