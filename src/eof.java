import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eof extends eod {
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
   public eof.a i = eof.a.a;

   public static eof a(JsonObject $$0) {
      eof $$1 = new eof();

      try {
         $$1.a = eqa.a("id", $$0, "");
         $$1.b = eqa.a("name", $$0, "");
         $$1.c = eqa.a("version", $$0, "");
         $$1.d = eqa.a("author", $$0, "");
         $$1.e = eqa.a("link", $$0, "");
         $$1.f = eqa.a("image", $$0, null);
         $$1.g = eqa.a("trailer", $$0, "");
         $$1.h = eqa.a("recommendedPlayers", $$0, "");
         $$1.i = eof.a.valueOf(eqa.a("type", $$0, eof.a.a.name()));
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
