import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bty(alb<etm> c, Map<btw, Float> d) {
   public static final Codec<Map<btw, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(btw.i, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bty::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(btw.values()));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bty> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(alb.a(lv.bd).fieldOf("loot_table").forGetter(bty::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bty::b))
            .apply($$0, bty::new)
   );

   private static Map<btw, Float> a(float $$0) {
      return a(List.of(btw.values()), $$0);
   }

   private static Map<btw, Float> a(List<btw> $$0, float $$1) {
      Map<btw, Float> $$2 = Maps.newHashMap();

      for (btw $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public alb<etm> a() {
      return this.c;
   }

   public Map<btw, Float> b() {
      return this.d;
   }
}
