import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbv extends fbt {
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
   public fbv.a i = fbv.a.a;

   public static fbv a(JsonObject $$0) {
      fbv $$1 = new fbv();

      try {
         $$1.a = fdq.b("id", $$0, "");
         $$1.b = fdq.b("name", $$0, "");
         $$1.c = fdq.b("version", $$0, "");
         $$1.d = fdq.b("author", $$0, "");
         $$1.e = fdq.b("link", $$0, "");
         $$1.f = fdq.b("image", $$0, null);
         $$1.g = fdq.b("trailer", $$0, "");
         $$1.h = fdq.b("recommendedPlayers", $$0, "");
         $$1.i = fbv.a.valueOf(fdq.b("type", $$0, fbv.a.a.name()));
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
