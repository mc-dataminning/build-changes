import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class erz extends erx {
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
   public erz.a i = erz.a.a;

   public static erz a(JsonObject $$0) {
      erz $$1 = new erz();

      try {
         $$1.a = etu.b("id", $$0, "");
         $$1.b = etu.b("name", $$0, "");
         $$1.c = etu.b("version", $$0, "");
         $$1.d = etu.b("author", $$0, "");
         $$1.e = etu.b("link", $$0, "");
         $$1.f = etu.b("image", $$0, null);
         $$1.g = etu.b("trailer", $$0, "");
         $$1.h = etu.b("recommendedPlayers", $$0, "");
         $$1.i = erz.a.valueOf(etu.b("type", $$0, erz.a.a.name()));
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
