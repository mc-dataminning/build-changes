import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record btt(ala<esy> c, Map<btr, Float> d) {
   public static final Codec<Map<btr, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(btr.i, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(btt::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(btr.values()));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<btt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ala.a(lv.bc).fieldOf("loot_table").forGetter(btt::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(btt::b))
            .apply($$0, btt::new)
   );

   private static Map<btr, Float> a(float $$0) {
      return a(List.of(btr.values()), $$0);
   }

   private static Map<btr, Float> a(List<btr> $$0, float $$1) {
      Map<btr, Float> $$2 = Maps.newHashMap();

      for (btr $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public ala<esy> a() {
      return this.c;
   }

   public Map<btr, Float> b() {
      return this.d;
   }
}
