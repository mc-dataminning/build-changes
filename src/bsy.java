import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bsy(ala<eqi> c, Map<bsw, Float> d) {
   public static final Codec<Map<bsw, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bsw.h, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bsy::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(bsw.values()));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bsy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ala.a(lq.aU).fieldOf("loot_table").forGetter(bsy::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bsy::b))
            .apply($$0, bsy::new)
   );

   private static Map<bsw, Float> a(float $$0) {
      return a(List.of(bsw.values()), $$0);
   }

   private static Map<bsw, Float> a(List<bsw> $$0, float $$1) {
      Map<bsw, Float> $$2 = Maps.newHashMap();

      for (bsw $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public ala<eqi> a() {
      return this.c;
   }

   public Map<bsw, Float> b() {
      return this.d;
   }
}
