import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epz extends epx {
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
   public epz.a i = epz.a.a;

   public static epz a(JsonObject $$0) {
      epz $$1 = new epz();

      try {
         $$1.a = eru.b("id", $$0, "");
         $$1.b = eru.b("name", $$0, "");
         $$1.c = eru.b("version", $$0, "");
         $$1.d = eru.b("author", $$0, "");
         $$1.e = eru.b("link", $$0, "");
         $$1.f = eru.b("image", $$0, null);
         $$1.g = eru.b("trailer", $$0, "");
         $$1.h = eru.b("recommendedPlayers", $$0, "");
         $$1.i = epz.a.valueOf(eru.b("type", $$0, epz.a.a.name()));
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
