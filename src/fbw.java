import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbw extends fbu {
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
   public fbw.a i = fbw.a.a;

   public static fbw a(JsonObject $$0) {
      fbw $$1 = new fbw();

      try {
         $$1.a = fdr.b("id", $$0, "");
         $$1.b = fdr.b("name", $$0, "");
         $$1.c = fdr.b("version", $$0, "");
         $$1.d = fdr.b("author", $$0, "");
         $$1.e = fdr.b("link", $$0, "");
         $$1.f = fdr.b("image", $$0, null);
         $$1.g = fdr.b("trailer", $$0, "");
         $$1.h = fdr.b("recommendedPlayers", $$0, "");
         $$1.i = fbw.a.valueOf(fdr.b("type", $$0, fbw.a.a.name()));
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
