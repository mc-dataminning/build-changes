import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record buw(aku<evx> c, Map<buu, Float> d) {
   public static final Codec<Map<buu, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(buu.k, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(buw::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(buu.i);
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<buw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aku.a(mc.bg).fieldOf("loot_table").forGetter(buw::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(buw::b))
            .apply($$0, buw::new)
   );

   public buw(aku<evx> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<buu, Float> a(float $$0) {
      return a(List.of(buu.values()), $$0);
   }

   private static Map<buu, Float> a(List<buu> $$0, float $$1) {
      Map<buu, Float> $$2 = Maps.newHashMap();

      for (buu $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public aku<evx> a() {
      return this.c;
   }

   public Map<buu, Float> b() {
      return this.d;
   }
}
