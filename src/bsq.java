import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bsq(akj<erb> c, Map<bso, Float> d) {
   public static final Codec<Map<bso, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bso.i, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bsq::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(bso.values()));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bsq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(akj.a(lr.bb).fieldOf("loot_table").forGetter(bsq::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bsq::b))
            .apply($$0, bsq::new)
   );

   private static Map<bso, Float> a(float $$0) {
      return a(List.of(bso.values()), $$0);
   }

   private static Map<bso, Float> a(List<bso> $$0, float $$1) {
      Map<bso, Float> $$2 = Maps.newHashMap();

      for (bso $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public akj<erb> a() {
      return this.c;
   }

   public Map<bso, Float> b() {
      return this.d;
   }
}
