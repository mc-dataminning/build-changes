import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bwp(alf<eze> c, Map<bwn, Float> d) {
   public static final Codec<Map<bwn, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bwn.l, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bwp::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(bwn.j);
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bwp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(alf.a(mg.bp).fieldOf("loot_table").forGetter(bwp::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bwp::b))
            .apply($$0, bwp::new)
   );

   public bwp(alf<eze> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<bwn, Float> a(float $$0) {
      return a(List.of(bwn.values()), $$0);
   }

   private static Map<bwn, Float> a(List<bwn> $$0, float $$1) {
      Map<bwn, Float> $$2 = Maps.newHashMap();

      for (bwn $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public alf<eze> a() {
      return this.c;
   }

   public Map<bwn, Float> b() {
      return this.d;
   }
}
