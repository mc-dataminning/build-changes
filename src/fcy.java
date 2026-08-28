import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcy extends fcw {
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
   public fcy.a i = fcy.a.a;

   public static fcy a(JsonObject $$0) {
      fcy $$1 = new fcy();

      try {
         $$1.a = fet.b("id", $$0, "");
         $$1.b = fet.b("name", $$0, "");
         $$1.c = fet.b("version", $$0, "");
         $$1.d = fet.b("author", $$0, "");
         $$1.e = fet.b("link", $$0, "");
         $$1.f = fet.b("image", $$0, null);
         $$1.g = fet.b("trailer", $$0, "");
         $$1.h = fet.b("recommendedPlayers", $$0, "");
         $$1.i = fcy.a.valueOf(fet.b("type", $$0, fcy.a.a.name()));
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
