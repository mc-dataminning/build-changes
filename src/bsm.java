import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bsm(akj<eqt> c, Map<bsk, Float> d) {
   public static final Codec<Map<bsk, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bsk.h, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bsm::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(bsk.values()));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bsm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(akj.a(lr.bb).fieldOf("loot_table").forGetter(bsm::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bsm::b))
            .apply($$0, bsm::new)
   );

   private static Map<bsk, Float> a(float $$0) {
      return a(List.of(bsk.values()), $$0);
   }

   private static Map<bsk, Float> a(List<bsk> $$0, float $$1) {
      Map<bsk, Float> $$2 = Maps.newHashMap();

      for (bsk $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public akj<eqt> a() {
      return this.c;
   }

   public Map<bsk, Float> b() {
      return this.d;
   }
}
