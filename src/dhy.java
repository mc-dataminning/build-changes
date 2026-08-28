import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dhy {
   public static final Codec<dhy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhy.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aks.c(mc.aI)).apply($$0, dhy::new)
   );
   public static final Codec<jr<dhy>> b = akq.a(mc.bc, a);
   private final dhy.a c;
   private final dht.c<jr<dhk>> d;

   public dhy(dhy.a $$0, js<dhk> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dht.c<jr<dhk>> a() {
      return this.d;
   }

   public static Map<dhy.a, dht.c<akt<dhk>>> b() {
      return dhy.a.f.values().stream().collect(Collectors.toMap($$0 -> (dhy.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(aku d, dhy.a.a e) {
      public static final dhy.a a = new dhy.a(
         aku.b("nether"),
         new dhy.a.a() {
            @Override
            public <T> dht.c<T> apply(Function<akt<dhk>, T> $$0) {
               return new dht.c<>(
                  List.of(
                     Pair.of(dht.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dhr.ad)),
                     Pair.of(dht.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dhr.ag)),
                     Pair.of(dht.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dhr.af)),
                     Pair.of(dht.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dhr.ae)),
                     Pair.of(dht.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dhr.ah))
                  )
               );
            }
         }
      );
      public static final dhy.a b = new dhy.a(aku.b("overworld"), new dhy.a.a() {
         @Override
         public <T> dht.c<T> apply(Function<akt<dhk>, T> $$0) {
            return dhy.a.a($$0);
         }
      });
      static final Map<aku, dhy.a> f = Stream.of(a, b).collect(Collectors.toMap(dhy.a::b, $$0 -> (dhy.a)$$0));
      public static final Codec<dhy.a> c = aku.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dht.c<T> a(Function<akt<dhk>, T> $$0) {
         Builder<Pair<dht.d, T>> $$1 = ImmutableList.builder();
         new dia().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dht.c<>($$1.build());
      }

      public Stream<akt<dhk>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<akt<dhk>>map(Pair::getSecond).distinct();
      }

      public aku b() {
         return this.d;
      }

      public dhy.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dht.c<T> apply(Function<akt<dhk>, T> var1);
      }
   }
}
