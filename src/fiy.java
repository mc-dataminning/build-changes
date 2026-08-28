import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fiy extends fiw {
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
   public fiy.a i = fiy.a.a;

   public static fiy a(JsonObject $$0) {
      fiy $$1 = new fiy();

      try {
         $$1.a = fks.b("id", $$0, "");
         $$1.b = fks.b("name", $$0, "");
         $$1.c = fks.b("version", $$0, "");
         $$1.d = fks.b("author", $$0, "");
         $$1.e = fks.b("link", $$0, "");
         $$1.f = fks.b("image", $$0, null);
         $$1.g = fks.b("trailer", $$0, "");
         $$1.h = fks.b("recommendedPlayers", $$0, "");
         $$1.i = fiy.a.valueOf(fks.b("type", $$0, fiy.a.a.name()));
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
