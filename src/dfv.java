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

public class dfv {
   public static final Codec<dfv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dfv.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ala.c(lv.aG)).apply($$0, dfv::new)
   );
   public static final Codec<jn<dfv>> b = aky.a(lv.ba, a);
   private final dfv.a c;
   private final dfq.c<jn<dfh>> d;

   public dfv(dfv.a $$0, jo<dfh> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dfq.c<jn<dfh>> a() {
      return this.d;
   }

   public static Map<dfv.a, dfq.c<alb<dfh>>> b() {
      return dfv.a.f.values().stream().collect(Collectors.toMap($$0 -> (dfv.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alc d, dfv.a.a e) {
      public static final dfv.a a = new dfv.a(
         alc.b("nether"),
         new dfv.a.a() {
            @Override
            public <T> dfq.c<T> apply(Function<alb<dfh>, T> $$0) {
               return new dfq.c<>(
                  List.of(
                     Pair.of(dfq.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dfo.ac)),
                     Pair.of(dfq.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dfo.af)),
                     Pair.of(dfq.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dfo.ae)),
                     Pair.of(dfq.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dfo.ad)),
                     Pair.of(dfq.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dfo.ag))
                  )
               );
            }
         }
      );
      public static final dfv.a b = new dfv.a(alc.b("overworld"), new dfv.a.a() {
         @Override
         public <T> dfq.c<T> apply(Function<alb<dfh>, T> $$0) {
            return dfv.a.a($$0);
         }
      });
      static final Map<alc, dfv.a> f = Stream.of(a, b).collect(Collectors.toMap(dfv.a::b, $$0 -> (dfv.a)$$0));
      public static final Codec<dfv.a> c = alc.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dfq.c<T> a(Function<alb<dfh>, T> $$0) {
         Builder<Pair<dfq.d, T>> $$1 = ImmutableList.builder();
         new dfx().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dfq.c<>($$1.build());
      }

      public Stream<alb<dfh>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<alb<dfh>>map(Pair::getSecond).distinct();
      }

      public alc b() {
         return this.d;
      }

      public dfv.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dfq.c<T> apply(Function<alb<dfh>, T> var1);
      }
   }
}
