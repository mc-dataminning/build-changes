import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.slf4j.Logger;

public abstract class aqn extends aqo<Map<ahh, JsonElement>> {
   private static final Logger a = LogUtils.getLogger();
   private final Gson b;
   private final String c;

   public aqn(Gson $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   protected Map<ahh, JsonElement> a(aqj $$0, bgt $$1) {
      Map<ahh, JsonElement> $$2 = new HashMap<>();
      a($$0, this.c, this.b, $$2);
      return $$2;
   }

   public static void a(aqj $$0, String $$1, Gson $$2, Map<ahh, JsonElement> $$3) {
      aha $$4 = aha.a($$1);

      for (Entry<ahh, aqh> $$5 : $$4.a($$0).entrySet()) {
         ahh $$6 = $$5.getKey();
         ahh $$7 = $$4.b($$6);

         try (Reader $$8 = $$5.getValue().e()) {
            JsonElement $$9 = auf.a($$2, $$8, JsonElement.class);
            JsonElement $$10 = $$3.put($$7, $$9);
            if ($$10 != null) {
               throw new IllegalStateException("Duplicate data file ignored with ID " + $$7);
            }
         } catch (IllegalArgumentException | IOException | JsonParseException var14) {
            a.error("Couldn't parse data file {} from {}", new Object[]{$$7, $$6, var14});
         }
      }
   }
}
