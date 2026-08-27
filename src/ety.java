import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ety extends etw {
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
   public ety.a i = ety.a.a;

   public static ety a(JsonObject $$0) {
      ety $$1 = new ety();

      try {
         $$1.a = evt.b("id", $$0, "");
         $$1.b = evt.b("name", $$0, "");
         $$1.c = evt.b("version", $$0, "");
         $$1.d = evt.b("author", $$0, "");
         $$1.e = evt.b("link", $$0, "");
         $$1.f = evt.b("image", $$0, null);
         $$1.g = evt.b("trailer", $$0, "");
         $$1.h = evt.b("recommendedPlayers", $$0, "");
         $$1.i = ety.a.valueOf(evt.b("type", $$0, ety.a.a.name()));
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
