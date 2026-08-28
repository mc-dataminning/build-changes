import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnw extends fnu {
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
   public fnw.a i = fnw.a.a;

   public static fnw a(JsonObject $$0) {
      fnw $$1 = new fnw();

      try {
         $$1.a = fpr.b("id", $$0, "");
         $$1.b = fpr.b("name", $$0, "");
         $$1.c = fpr.b("version", $$0, "");
         $$1.d = fpr.b("author", $$0, "");
         $$1.e = fpr.b("link", $$0, "");
         $$1.f = fpr.b("image", $$0, null);
         $$1.g = fpr.b("trailer", $$0, "");
         $$1.h = fpr.b("recommendedPlayers", $$0, "");
         $$1.i = fnw.a.valueOf(fpr.b("type", $$0, fnw.a.a.name()));
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
