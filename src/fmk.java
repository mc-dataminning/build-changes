import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmk extends fmi {
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
   public fmk.a i = fmk.a.a;

   public static fmk a(JsonObject $$0) {
      fmk $$1 = new fmk();

      try {
         $$1.a = foe.b("id", $$0, "");
         $$1.b = foe.b("name", $$0, "");
         $$1.c = foe.b("version", $$0, "");
         $$1.d = foe.b("author", $$0, "");
         $$1.e = foe.b("link", $$0, "");
         $$1.f = foe.b("image", $$0, null);
         $$1.g = foe.b("trailer", $$0, "");
         $$1.h = foe.b("recommendedPlayers", $$0, "");
         $$1.i = fmk.a.valueOf(foe.b("type", $$0, fmk.a.a.name()));
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
