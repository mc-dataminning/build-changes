import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bub(ald<etq> c, Map<btz, Float> d) {
   public static final Codec<Map<btz, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(btz.i, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bub::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(btz.values()));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bub> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ald.a(lw.be).fieldOf("loot_table").forGetter(bub::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bub::b))
            .apply($$0, bub::new)
   );

   public bub(ald<etq> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<btz, Float> a(float $$0) {
      return a(List.of(btz.values()), $$0);
   }

   private static Map<btz, Float> a(List<btz> $$0, float $$1) {
      Map<btz, Float> $$2 = Maps.newHashMap();

      for (btz $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public ald<etq> a() {
      return this.c;
   }

   public Map<btz, Float> b() {
      return this.d;
   }
}
