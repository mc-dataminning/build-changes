import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record bus(alk<eul> c, Map<buq, Float> d) {
   public static final Codec<Map<buq, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(buq.k, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(bus::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(buq.i));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<bus> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(alk.a(ma.bd).fieldOf("loot_table").forGetter(bus::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(bus::b))
            .apply($$0, bus::new)
   );

   public bus(alk<eul> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<buq, Float> a(float $$0) {
      return a(List.of(buq.values()), $$0);
   }

   private static Map<buq, Float> a(List<buq> $$0, float $$1) {
      Map<buq, Float> $$2 = Maps.newHashMap();

      for (buq $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public alk<eul> a() {
      return this.c;
   }

   public Map<buq, Float> b() {
      return this.d;
   }
}
