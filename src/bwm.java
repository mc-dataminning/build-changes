import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bwm(ald<eys> c, Map<bwk, Float> d) {
   public static final Codec<Map<bwk, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bwk.l, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bwm::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(bwk.j);
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bwm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ald.a(mg.bo).fieldOf("loot_table").forGetter(bwm::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bwm::b))
            .apply($$0, bwm::new)
   );

   public bwm(ald<eys> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<bwk, Float> a(float $$0) {
      return a(List.of(bwk.values()), $$0);
   }

   private static Map<bwk, Float> a(List<bwk> $$0, float $$1) {
      Map<bwk, Float> $$2 = Maps.newHashMap();

      for (bwk $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public ald<eys> a() {
      return this.c;
   }

   public Map<bwk, Float> b() {
      return this.d;
   }
}
