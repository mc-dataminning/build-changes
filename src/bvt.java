import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bvt(aly<ewt> c, Map<bvr, Float> d) {
   public static final Codec<Map<bvr, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bvr.k, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bvt::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(bvr.i);
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bvt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aly.a(mb.bg).fieldOf("loot_table").forGetter(bvt::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bvt::b))
            .apply($$0, bvt::new)
   );

   public bvt(aly<ewt> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<bvr, Float> a(float $$0) {
      return a(List.of(bvr.values()), $$0);
   }

   private static Map<bvr, Float> a(List<bvr> $$0, float $$1) {
      Map<bvr, Float> $$2 = Maps.newHashMap();

      for (bvr $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public aly<ewt> a() {
      return this.c;
   }

   public Map<bvr, Float> b() {
      return this.d;
   }
}
