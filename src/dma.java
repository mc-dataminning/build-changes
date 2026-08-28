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

public class dma {
   public static final Codec<dma> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dma.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), alp.c(mi.aG)).apply($$0, dma::new)
   );
   public static final Codec<jg<dma>> b = aln.a(mi.aW, a);
   private final dma.a c;
   private final dlv.c<jg<dlm>> d;

   public dma(dma.a $$0, jh<dlm> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dlv.c<jg<dlm>> a() {
      return this.d;
   }

   public static Map<dma.a, dlv.c<alq<dlm>>> b() {
      return dma.a.f.values().stream().collect(Collectors.toMap($$0 -> (dma.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alr d, dma.a.a e) {
      public static final dma.a a = new dma.a(
         alr.b("nether"),
         new dma.a.a() {
            @Override
            public <T> dlv.c<T> apply(Function<alq<dlm>, T> $$0) {
               return new dlv.c<>(
                  List.of(
                     Pair.of(dlv.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dlt.ad)),
                     Pair.of(dlv.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dlt.ag)),
                     Pair.of(dlv.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dlt.af)),
                     Pair.of(dlv.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dlt.ae)),
                     Pair.of(dlv.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dlt.ah))
                  )
               );
            }
         }
      );
      public static final dma.a b = new dma.a(alr.b("overworld"), new dma.a.a() {
         @Override
         public <T> dlv.c<T> apply(Function<alq<dlm>, T> $$0) {
            return dma.a.a($$0);
         }
      });
      static final Map<alr, dma.a> f = Stream.of(a, b).collect(Collectors.toMap(dma.a::b, $$0 -> (dma.a)$$0));
      public static final Codec<dma.a> c = alr.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dlv.c<T> a(Function<alq<dlm>, T> $$0) {
         Builder<Pair<dlv.d, T>> $$1 = ImmutableList.builder();
         new dmc().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dlv.c<>($$1.build());
      }

      public Stream<alq<dlm>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<alq<dlm>>map(Pair::getSecond).distinct();
      }

      public alr b() {
         return this.d;
      }

      public dma.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dlv.c<T> apply(Function<alq<dlm>, T> var1);
      }
   }
}
