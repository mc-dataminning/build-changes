import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bvu(aly<ewu> c, Map<bvs, Float> d) {
   public static final Codec<Map<bvs, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bvs.k, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bvu::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(bvs.i);
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bvu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aly.a(mb.bg).fieldOf("loot_table").forGetter(bvu::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bvu::b))
            .apply($$0, bvu::new)
   );

   public bvu(aly<ewu> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<bvs, Float> a(float $$0) {
      return a(List.of(bvs.values()), $$0);
   }

   private static Map<bvs, Float> a(List<bvs> $$0, float $$1) {
      Map<bvs, Float> $$2 = Maps.newHashMap();

      for (bvs $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public aly<ewu> a() {
      return this.c;
   }

   public Map<bvs, Float> b() {
      return this.d;
   }
}
