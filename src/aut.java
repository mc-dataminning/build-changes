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

public abstract class aut<T> extends auu<Map<akv, T>> {
   private static final Logger a = LogUtils.getLogger();
   private final DynamicOps<JsonElement> b;
   private final Codec<T> c;
   private final ako d;

   protected aut(jt.a $$0, Codec<T> $$1, aku<? extends ke<T>> $$2) {
      this($$0.a(JsonOps.INSTANCE), $$1, ako.a($$2));
   }

   protected aut(Codec<T> $$0, ako $$1) {
      this(JsonOps.INSTANCE, $$0, $$1);
   }

   private aut(DynamicOps<JsonElement> $$0, Codec<T> $$1, ako $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   protected Map<akv, T> a(aup $$0, bou $$1) {
      Map<akv, T> $$2 = new HashMap<>();
      a($$0, this.d, this.b, this.c, $$2);
      return $$2;
   }

   public static <T> void a(aup $$0, aku<? extends ke<T>> $$1, DynamicOps<JsonElement> $$2, Codec<T> $$3, Map<akv, T> $$4) {
      a($$0, ako.a($$1), $$2, $$3, $$4);
   }

   public static <T> void a(aup $$0, ako $$1, DynamicOps<JsonElement> $$2, Codec<T> $$3, Map<akv, T> $$4) {
      for (Entry<akv, aun> $$5 : $$1.a($$0).entrySet()) {
         akv $$6 = $$5.getKey();
         akv $$7 = $$1.b($$6);

         try (Reader $$8 = $$5.getValue().e()) {
            $$3.parse($$2, JsonParser.parseReader($$8)).ifSuccess($$2x -> {
               if ($$4.putIfAbsent($$7, (T)$$2x) != null) {
                  throw new IllegalStateException("Duplicate data file ignored with ID " + $$7);
               }
            }).ifError($$2x -> a.error("Couldn't parse data file '{}' from '{}': {}", new Object[]{$$7, $$6, $$2x}));
         } catch (IllegalArgumentException | IOException | JsonParseException var14) {
            a.error("Couldn't parse data file '{}' from '{}'", new Object[]{$$7, $$6, var14});
         }
      }
   }
}
