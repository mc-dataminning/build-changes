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

public abstract class avp<T> extends avq<Map<alp, T>> {
   private static final Logger a = LogUtils.getLogger();
   private final DynamicOps<JsonElement> b;
   private final Codec<T> c;
   private final String d;

   protected avp(js.a $$0, Codec<T> $$1, String $$2) {
      this($$0.a(JsonOps.INSTANCE), $$1, $$2);
   }

   protected avp(Codec<T> $$0, String $$1) {
      this(JsonOps.INSTANCE, $$0, $$1);
   }

   private avp(DynamicOps<JsonElement> $$0, Codec<T> $$1, String $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   protected Map<alp, T> a(avl $$0, bpj $$1) {
      Map<alp, T> $$2 = new HashMap<>();
      a($$0, this.d, this.b, this.c, $$2);
      return $$2;
   }

   public static <T> void a(avl $$0, String $$1, DynamicOps<JsonElement> $$2, Codec<T> $$3, Map<alp, T> $$4) {
      ali $$5 = ali.a($$1);

      for (Entry<alp, avj> $$6 : $$5.a($$0).entrySet()) {
         alp $$7 = $$6.getKey();
         alp $$8 = $$5.b($$7);

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
