import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bta(akq<eru> c, Map<bsy, Float> d) {
   public static final Codec<Map<bsy, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bsy.i, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bta::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(bsy.values()));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bta> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(akq.a(lu.bc).fieldOf("loot_table").forGetter(bta::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bta::b))
            .apply($$0, bta::new)
   );

   private static Map<bsy, Float> a(float $$0) {
      return a(List.of(bsy.values()), $$0);
   }

   private static Map<bsy, Float> a(List<bsy> $$0, float $$1) {
      Map<bsy, Float> $$2 = Maps.newHashMap();

      for (bsy $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public akq<eru> a() {
      return this.c;
   }

   public Map<bsy, Float> b() {
      return this.d;
   }
}
