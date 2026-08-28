import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.slf4j.Logger;

public abstract class ave<T> extends avf<Map<alh, T>> {
   private static final Logger a = LogUtils.getLogger();
   private final DynamicOps<JsonElement> b;
   private final Codec<T> c;
   private final String d;

   protected ave(jr.a $$0, Codec<T> $$1, String $$2) {
      this($$0.a(JsonOps.INSTANCE), $$1, $$2);
   }

   protected ave(Codec<T> $$0, String $$1) {
      this(JsonOps.INSTANCE, $$0, $$1);
   }

   private ave(DynamicOps<JsonElement> $$0, Codec<T> $$1, String $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   protected Map<alh, T> a(ava $$0, bok $$1) {
      Map<alh, T> $$2 = new HashMap<>();
      a($$0, this.d, this.b, this.c, $$2);
      return $$2;
   }

   public static <T> void a(ava $$0, String $$1, DynamicOps<JsonElement> $$2, Codec<T> $$3, Map<alh, T> $$4) {
      ala $$5 = ala.a($$1);

      for (Entry<alh, auy> $$6 : $$5.a($$0).entrySet()) {
         alh $$7 = $$6.getKey();
         alh $$8 = $$5.b($$7);

         try (Reader $$9 = $$6.getValue().e()) {
            $$3.parse($$2, JsonParser.parseReader($$9)).ifSuccess($$2x -> {
               if ($$4.putIfAbsent($$8, (T)$$2x) != null) {
                  throw new IllegalStateException("Duplicate data file ignored with ID " + $$8);
               }
            }).ifError($$2x -> a.error("Couldn't parse data file '{}' from '{}': {}", new Object[]{$$8, $$7, $$2x}));
         } catch (IllegalArgumentException | IOException | JsonParseException var15) {
            a.error("Couldn't parse data file '{}' from '{}'", new Object[]{$$8, $$7, var15});
         }
      }
   }
}
