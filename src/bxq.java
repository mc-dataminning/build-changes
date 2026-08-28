import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bxq(alq<fay> c, Map<bxo, Float> d) {
   public static final Codec<Map<bxo, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bxo.l, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bxq::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(bxo.j);
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bxq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(fay.a.fieldOf("loot_table").forGetter(bxq::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bxq::b)).apply($$0, bxq::new)
   );

   public bxq(alq<fay> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<bxo, Float> a(float $$0) {
      return a(List.of(bxo.values()), $$0);
   }

   private static Map<bxo, Float> a(List<bxo> $$0, float $$1) {
      Map<bxo, Float> $$2 = Maps.newHashMap();

      for (bxo $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public alq<fay> a() {
      return this.c;
   }

   public Map<bxo, Float> b() {
      return this.d;
   }
}
