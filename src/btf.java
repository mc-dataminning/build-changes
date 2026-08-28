import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record btf(ale<eqp> c, Map<btd, Float> d) {
   public static final Codec<Map<btd, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(btd.h, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(btf::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(btd.values()));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<btf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ale.a(lq.aU).fieldOf("loot_table").forGetter(btf::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(btf::b))
            .apply($$0, btf::new)
   );

   private static Map<btd, Float> a(float $$0) {
      return a(List.of(btd.values()), $$0);
   }

   private static Map<btd, Float> a(List<btd> $$0, float $$1) {
      Map<btd, Float> $$2 = Maps.newHashMap();

      for (btd $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public ale<eqp> a() {
      return this.c;
   }

   public Map<btd, Float> b() {
      return this.d;
   }
}
