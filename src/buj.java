import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record buj(alg<eub> c, Map<buh, Float> d) {
   public static final Codec<Map<buh, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(buh.k, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(buj::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(buh.i));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<buj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(alg.a(ly.bd).fieldOf("loot_table").forGetter(buj::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(buj::b))
            .apply($$0, buj::new)
   );

   public buj(alg<eub> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<buh, Float> a(float $$0) {
      return a(List.of(buh.values()), $$0);
   }

   private static Map<buh, Float> a(List<buh> $$0, float $$1) {
      Map<buh, Float> $$2 = Maps.newHashMap();

      for (buh $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public alg<eub> a() {
      return this.c;
   }

   public Map<buh, Float> b() {
      return this.d;
   }
}
