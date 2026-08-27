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

public class cvc {
   public static final Codec<cvc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cvc.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ahe.c(ke.at)).apply($$0, cvc::new)
   );
   public static final Codec<ih<cvc>> b = ahc.a(ke.aL, a);
   private final cvc.a c;
   private final cux.c<ih<cuo>> d;

   public cvc(cvc.a $$0, ii<cuo> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cux.c<ih<cuo>> a() {
      return this.d;
   }

   public static Map<cvc.a, cux.c<ahf<cuo>>> b() {
      return cvc.a.f.values().stream().collect(Collectors.toMap($$0 -> (cvc.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(ahg d, cvc.a.a e) {
      public static final cvc.a a = new cvc.a(
         new ahg("nether"),
         new cvc.a.a() {
            @Override
            public <T> cux.c<T> apply(Function<ahf<cuo>, T> $$0) {
               return new cux.c<>(
                  List.of(
                     Pair.of(cux.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cuv.ac)),
                     Pair.of(cux.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cuv.af)),
                     Pair.of(cux.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cuv.ae)),
                     Pair.of(cux.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cuv.ad)),
                     Pair.of(cux.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cuv.ag))
                  )
               );
            }
         }
      );
      public static final cvc.a b = new cvc.a(new ahg("overworld"), new cvc.a.a() {
         @Override
         public <T> cux.c<T> apply(Function<ahf<cuo>, T> $$0) {
            return cvc.a.a($$0);
         }
      });
      static final Map<ahg, cvc.a> f = Stream.of(a, b).collect(Collectors.toMap(cvc.a::b, $$0 -> (cvc.a)$$0));
      public static final Codec<cvc.a> c = ahg.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cux.c<T> a(Function<ahf<cuo>, T> $$0) {
         Builder<Pair<cux.d, T>> $$1 = ImmutableList.builder();
         new cve().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cux.c<>($$1.build());
      }

      public Stream<ahf<cuo>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ahf<cuo>>map(Pair::getSecond).distinct();
      }

      public ahg b() {
         return this.d;
      }

      public cvc.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cux.c<T> apply(Function<ahf<cuo>, T> var1);
      }
   }
}
