import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bxh(alj<fao> c, Map<bxf, Float> d) {
   public static final Codec<Map<bxf, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bxf.l, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bxh::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(bxf.j);
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bxh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(fao.a.fieldOf("loot_table").forGetter(bxh::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bxh::b)).apply($$0, bxh::new)
   );

   public bxh(alj<fao> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<bxf, Float> a(float $$0) {
      return a(List.of(bxf.values()), $$0);
   }

   private static Map<bxf, Float> a(List<bxf> $$0, float $$1) {
      Map<bxf, Float> $$2 = Maps.newHashMap();

      for (bxf $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public alj<fao> a() {
      return this.c;
   }

   public Map<bxf, Float> b() {
      return this.d;
   }
}
