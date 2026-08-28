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

public abstract class ave<T> extends avf<Map<ald, T>> {
   private static final Logger a = LogUtils.getLogger();
   private final DynamicOps<JsonElement> b;
   private final Codec<T> c;
   private final akw d;

   protected ave(ju.a $$0, Codec<T> $$1, alc<? extends kf<T>> $$2) {
      this($$0.a(JsonOps.INSTANCE), $$1, akw.a($$2));
   }

   protected ave(Codec<T> $$0, akw $$1) {
      this(JsonOps.INSTANCE, $$0, $$1);
   }

   private ave(DynamicOps<JsonElement> $$0, Codec<T> $$1, akw $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   protected Map<ald, T> a(ava $$0, bqb $$1) {
      Map<ald, T> $$2 = new HashMap<>();
      a($$0, this.d, this.b, this.c, $$2);
      return $$2;
   }

   public static <T> void a(ava $$0, alc<? extends kf<T>> $$1, DynamicOps<JsonElement> $$2, Codec<T> $$3, Map<ald, T> $$4) {
      a($$0, akw.a($$1), $$2, $$3, $$4);
   }

   public static <T> void a(ava $$0, akw $$1, DynamicOps<JsonElement> $$2, Codec<T> $$3, Map<ald, T> $$4) {
      for (Entry<ald, auy> $$5 : $$1.a($$0).entrySet()) {
         ald $$6 = $$5.getKey();
         ald $$7 = $$1.b($$6);

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
