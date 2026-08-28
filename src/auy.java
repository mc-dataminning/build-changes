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

public abstract class auy extends auz<Map<alc, JsonElement>> {
   private static final Logger a = LogUtils.getLogger();
   private final Gson b;
   private final String c;

   public auy(Gson $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   protected Map<alc, JsonElement> a(aut $$0, bod $$1) {
      Map<alc, JsonElement> $$2 = new HashMap<>();
      a($$0, this.c, this.b, $$2);
      return $$2;
   }

   public static void a(aut $$0, String $$1, Gson $$2, Map<alc, JsonElement> $$3) {
      akv $$4 = akv.a($$1);

      for (Entry<alc, aur> $$5 : $$4.a($$0).entrySet()) {
         alc $$6 = $$5.getKey();
         alc $$7 = $$4.b($$6);

         try (Reader $$8 = $$5.getValue().e()) {
            JsonElement $$9 = ayt.a($$2, $$8, JsonElement.class);
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
