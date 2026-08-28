import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bte(ale<eqo> c, Map<btc, Float> d) {
   public static final Codec<Map<btc, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(btc.h, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bte::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(btc.values()));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bte> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ale.a(lq.aU).fieldOf("loot_table").forGetter(bte::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bte::b))
            .apply($$0, bte::new)
   );

   private static Map<btc, Float> a(float $$0) {
      return a(List.of(btc.values()), $$0);
   }

   private static Map<btc, Float> a(List<btc> $$0, float $$1) {
      Map<btc, Float> $$2 = Maps.newHashMap();

      for (btc $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public ale<eqo> a() {
      return this.c;
   }

   public Map<btc, Float> b() {
      return this.d;
   }
}
