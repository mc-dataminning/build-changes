import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fia extends fhy {
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
   public fia.a i = fia.a.a;

   public static fia a(JsonObject $$0) {
      fia $$1 = new fia();

      try {
         $$1.a = fju.b("id", $$0, "");
         $$1.b = fju.b("name", $$0, "");
         $$1.c = fju.b("version", $$0, "");
         $$1.d = fju.b("author", $$0, "");
         $$1.e = fju.b("link", $$0, "");
         $$1.f = fju.b("image", $$0, null);
         $$1.g = fju.b("trailer", $$0, "");
         $$1.h = fju.b("recommendedPlayers", $$0, "");
         $$1.i = fia.a.valueOf(fju.b("type", $$0, fia.a.a.name()));
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
