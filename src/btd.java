import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record btd(ale<eqn> c, Map<btb, Float> d) {
   public static final Codec<Map<btb, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(btb.h, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(btd::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(btb.values()));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<btd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ale.a(lq.aU).fieldOf("loot_table").forGetter(btd::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(btd::b))
            .apply($$0, btd::new)
   );

   private static Map<btb, Float> a(float $$0) {
      return a(List.of(btb.values()), $$0);
   }

   private static Map<btb, Float> a(List<btb> $$0, float $$1) {
      Map<btb, Float> $$2 = Maps.newHashMap();

      for (btb $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public ale<eqn> a() {
      return this.c;
   }

   public Map<btb, Float> b() {
      return this.d;
   }
}
