import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record btb(ald<eql> c, Map<bsz, Float> d) {
   public static final Codec<Map<bsz, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bsz.h, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(btb::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(bsz.values()));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<btb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ald.a(lq.aU).fieldOf("loot_table").forGetter(btb::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(btb::b))
            .apply($$0, btb::new)
   );

   private static Map<bsz, Float> a(float $$0) {
      return a(List.of(bsz.values()), $$0);
   }

   private static Map<bsz, Float> a(List<bsz> $$0, float $$1) {
      Map<bsz, Float> $$2 = Maps.newHashMap();

      for (bsz $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public ald<eql> a() {
      return this.c;
   }

   public Map<bsz, Float> b() {
      return this.d;
   }
}
