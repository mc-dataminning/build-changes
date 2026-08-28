import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bsp(akj<eqz> c, Map<bsn, Float> d) {
   public static final Codec<Map<bsn, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bsn.h, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bsp::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(bsn.values()));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bsp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(akj.a(lr.bb).fieldOf("loot_table").forGetter(bsp::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bsp::b))
            .apply($$0, bsp::new)
   );

   private static Map<bsn, Float> a(float $$0) {
      return a(List.of(bsn.values()), $$0);
   }

   private static Map<bsn, Float> a(List<bsn> $$0, float $$1) {
      Map<bsn, Float> $$2 = Maps.newHashMap();

      for (bsn $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public akj<eqz> a() {
      return this.c;
   }

   public Map<bsn, Float> b() {
      return this.d;
   }
}
