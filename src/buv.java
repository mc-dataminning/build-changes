import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record buv(aku<evw> c, Map<but, Float> d) {
   public static final Codec<Map<but, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(but.k, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(buv::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(but.i);
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<buv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aku.a(mc.bg).fieldOf("loot_table").forGetter(buv::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(buv::b))
            .apply($$0, buv::new)
   );

   public buv(aku<evw> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<but, Float> a(float $$0) {
      return a(List.of(but.values()), $$0);
   }

   private static Map<but, Float> a(List<but> $$0, float $$1) {
      Map<but, Float> $$2 = Maps.newHashMap();

      for (but $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public aku<evw> a() {
      return this.c;
   }

   public Map<but, Float> b() {
      return this.d;
   }
}
