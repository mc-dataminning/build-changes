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

public class dfh {
   public static final Codec<dfh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dfh.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), akz.c(lv.aF)).apply($$0, dfh::new)
   );
   public static final Codec<jn<dfh>> b = akx.a(lv.aZ, a);
   private final dfh.a c;
   private final dfc.c<jn<det>> d;

   public dfh(dfh.a $$0, jo<det> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dfc.c<jn<det>> a() {
      return this.d;
   }

   public static Map<dfh.a, dfc.c<ala<det>>> b() {
      return dfh.a.f.values().stream().collect(Collectors.toMap($$0 -> (dfh.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alb d, dfh.a.a e) {
      public static final dfh.a a = new dfh.a(
         alb.b("nether"),
         new dfh.a.a() {
            @Override
            public <T> dfc.c<T> apply(Function<ala<det>, T> $$0) {
               return new dfc.c<>(
                  List.of(
                     Pair.of(dfc.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dfa.ac)),
                     Pair.of(dfc.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dfa.af)),
                     Pair.of(dfc.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dfa.ae)),
                     Pair.of(dfc.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dfa.ad)),
                     Pair.of(dfc.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dfa.ag))
                  )
               );
            }
         }
      );
      public static final dfh.a b = new dfh.a(alb.b("overworld"), new dfh.a.a() {
         @Override
         public <T> dfc.c<T> apply(Function<ala<det>, T> $$0) {
            return dfh.a.a($$0);
         }
      });
      static final Map<alb, dfh.a> f = Stream.of(a, b).collect(Collectors.toMap(dfh.a::b, $$0 -> (dfh.a)$$0));
      public static final Codec<dfh.a> c = alb.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dfc.c<T> a(Function<ala<det>, T> $$0) {
         Builder<Pair<dfc.d, T>> $$1 = ImmutableList.builder();
         new dfj().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dfc.c<>($$1.build());
      }

      public Stream<ala<det>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ala<det>>map(Pair::getSecond).distinct();
      }

      public alb b() {
         return this.d;
      }

      public dfh.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dfc.c<T> apply(Function<ala<det>, T> var1);
      }
   }
}
