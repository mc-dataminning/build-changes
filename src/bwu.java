import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bwu(alf<ezt> c, Map<bws, Float> d) {
   public static final Codec<Map<bws, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bws.l, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bwu::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(bws.j);
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bwu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ezt.a.fieldOf("loot_table").forGetter(bwu::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bwu::b)).apply($$0, bwu::new)
   );

   public bwu(alf<ezt> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<bws, Float> a(float $$0) {
      return a(List.of(bws.values()), $$0);
   }

   private static Map<bws, Float> a(List<bws> $$0, float $$1) {
      Map<bws, Float> $$2 = Maps.newHashMap();

      for (bws $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public alf<ezt> a() {
      return this.c;
   }

   public Map<bws, Float> b() {
      return this.d;
   }
}
