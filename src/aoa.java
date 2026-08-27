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

public abstract class aoa extends aob<Map<aez, JsonElement>> {
   private static final Logger a = LogUtils.getLogger();
   private final Gson b;
   private final String c;

   public aoa(Gson $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   protected Map<aez, JsonElement> a(anw $$0, bdv $$1) {
      Map<aez, JsonElement> $$2 = new HashMap<>();
      a($$0, this.c, this.b, $$2);
      return $$2;
   }

   public static void a(anw $$0, String $$1, Gson $$2, Map<aez, JsonElement> $$3) {
      aes $$4 = aes.a($$1);

      for (Entry<aez, anu> $$5 : $$4.a($$0).entrySet()) {
         aez $$6 = $$5.getKey();
         aez $$7 = $$4.b($$6);

         try (Reader $$8 = $$5.getValue().e()) {
            JsonElement $$9 = arr.a($$2, $$8, JsonElement.class);
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
