import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bsz(akp<erq> c, Map<bsx, Float> d) {
   public static final Codec<Map<bsx, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bsx.i, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bsz::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(bsx.values()));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bsz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(akp.a(lu.bc).fieldOf("loot_table").forGetter(bsz::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bsz::b))
            .apply($$0, bsz::new)
   );

   private static Map<bsx, Float> a(float $$0) {
      return a(List.of(bsx.values()), $$0);
   }

   private static Map<bsx, Float> a(List<bsx> $$0, float $$1) {
      Map<bsx, Float> $$2 = Maps.newHashMap();

      for (bsx $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public akp<erq> a() {
      return this.c;
   }

   public Map<bsx, Float> b() {
      return this.d;
   }
}
