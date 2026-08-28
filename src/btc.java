import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record btc(ald<eqm> c, Map<bta, Float> d) {
   public static final Codec<Map<bta, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bta.h, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(btc::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(bta.values()));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<btc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ald.a(lq.aU).fieldOf("loot_table").forGetter(btc::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(btc::b))
            .apply($$0, btc::new)
   );

   private static Map<bta, Float> a(float $$0) {
      return a(List.of(bta.values()), $$0);
   }

   private static Map<bta, Float> a(List<bta> $$0, float $$1) {
      Map<bta, Float> $$2 = Maps.newHashMap();

      for (bta $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public ald<eqm> a() {
      return this.c;
   }

   public Map<bta, Float> b() {
      return this.d;
   }
}
