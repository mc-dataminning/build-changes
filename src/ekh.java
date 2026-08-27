import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ekh extends ekf {
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
   public ekh.a i = ekh.a.a;

   public static ekh a(JsonObject $$0) {
      ekh $$1 = new ekh();

      try {
         $$1.a = emb.a("id", $$0, "");
         $$1.b = emb.a("name", $$0, "");
         $$1.c = emb.a("version", $$0, "");
         $$1.d = emb.a("author", $$0, "");
         $$1.e = emb.a("link", $$0, "");
         $$1.f = emb.a("image", $$0, null);
         $$1.g = emb.a("trailer", $$0, "");
         $$1.h = emb.a("recommendedPlayers", $$0, "");
         $$1.i = ekh.a.valueOf(emb.a("type", $$0, ekh.a.a.name()));
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
