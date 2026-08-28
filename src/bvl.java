import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bvl(alo<ewn> c, Map<bvj, Float> d) {
   public static final Codec<Map<bvj, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bvj.k, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bvl::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(bvj.i);
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bvl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(alo.a(mb.bg).fieldOf("loot_table").forGetter(bvl::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bvl::b))
            .apply($$0, bvl::new)
   );

   public bvl(alo<ewn> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<bvj, Float> a(float $$0) {
      return a(List.of(bvj.values()), $$0);
   }

   private static Map<bvj, Float> a(List<bvj> $$0, float $$1) {
      Map<bvj, Float> $$2 = Maps.newHashMap();

      for (bvj $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public alo<ewn> a() {
      return this.c;
   }

   public Map<bvj, Float> b() {
      return this.d;
   }
}
