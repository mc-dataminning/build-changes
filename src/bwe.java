import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bwe(alc<exq> c, Map<bwc, Float> d) {
   public static final Codec<Map<bwc, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bwc.l, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bwe::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(bwc.j);
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bwe> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(alc.a(me.bn).fieldOf("loot_table").forGetter(bwe::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bwe::b))
            .apply($$0, bwe::new)
   );

   public bwe(alc<exq> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<bwc, Float> a(float $$0) {
      return a(List.of(bwc.values()), $$0);
   }

   private static Map<bwc, Float> a(List<bwc> $$0, float $$1) {
      Map<bwc, Float> $$2 = Maps.newHashMap();

      for (bwc $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public alc<exq> a() {
      return this.c;
   }

   public Map<bwc, Float> b() {
      return this.d;
   }
}
