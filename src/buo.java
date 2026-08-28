import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record buo(alh<euh> c, Map<bum, Float> d) {
   public static final Codec<Map<bum, Float>> a = Codec.either(Codec.FLOAT, Codec.unboundedMap(bum.k, Codec.FLOAT))
      .xmap($$0 -> (Map)$$0.map(buo::a, Function.identity()), $$0 -> {
         boolean $$1 = $$0.values().stream().distinct().count() == 1L;
         boolean $$2 = $$0.keySet().containsAll(Arrays.asList(bum.i));
         return $$1 && $$2 ? Either.left($$0.values().stream().findFirst().orElse(0.0F)) : Either.right($$0);
      });
   public static final Codec<buo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(alh.a(lz.bd).fieldOf("loot_table").forGetter(buo::a), a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(buo::b))
            .apply($$0, buo::new)
   );

   public buo(alh<euh> $$0, float $$1) {
      this($$0, a($$1));
   }

   private static Map<bum, Float> a(float $$0) {
      return a(List.of(bum.values()), $$0);
   }

   private static Map<bum, Float> a(List<bum> $$0, float $$1) {
      Map<bum, Float> $$2 = Maps.newHashMap();

      for (bum $$3 : $$0) {
         $$2.put($$3, $$1);
      }

      return $$2;
   }

   public alh<euh> a() {
      return this.c;
   }

   public Map<bum, Float> b() {
      return this.d;
   }
}
