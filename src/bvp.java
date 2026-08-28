import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bvp(aly<ewm> c, Map<bvn, Float> d) {
   public static final Codec<Map<bvn, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bvn.k, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bvp::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(bvn.i);
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bvp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aly.a(mb.bf).fieldOf("loot_table").forGetter(bvp::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bvp::b))
            .apply($$0, bvp::new)
   );

   public bvp(aly<ewm> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<bvn, Float> a(float $$0) {
      return a(List.of(bvn.values()), $$0);
   }

   private static Map<bvn, Float> a(List<bvn> $$0, float $$1) {
      Map<bvn, Float> $$2 = Maps.newHashMap();

      for (bvn $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public aly<ewm> a() {
      return this.c;
   }

   public Map<bvn, Float> b() {
      return this.d;
   }
}
