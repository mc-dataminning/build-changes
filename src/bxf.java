import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bxf(alh<fam> c, Map<bxd, Float> d) {
   public static final Codec<Map<bxd, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bxd.l, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bxf::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(bxd.j);
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bxf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(fam.a.fieldOf("loot_table").forGetter(bxf::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bxf::b)).apply($$0, bxf::new)
   );

   public bxf(alh<fam> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<bxd, Float> a(float $$0) {
      return a(List.of(bxd.values()), $$0);
   }

   private static Map<bxd, Float> a(List<bxd> $$0, float $$1) {
      Map<bxd, Float> $$2 = Maps.newHashMap();

      for (bxd $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public alh<fam> a() {
      return this.c;
   }

   public Map<bxd, Float> b() {
      return this.d;
   }
}
