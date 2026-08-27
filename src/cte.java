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

public class cte {
   public static final Codec<cte> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cte.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), age.c(jz.ar)).apply($$0, cte::new)
   );
   public static final Codec<ib<cte>> b = agc.a(jz.aI, a);
   private final cte.a c;
   private final csz.c<ib<csq>> d;

   public cte(cte.a $$0, ic<csq> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public csz.c<ib<csq>> a() {
      return this.d;
   }

   public static Map<cte.a, csz.c<agf<csq>>> b() {
      return cte.a.f.values().stream().collect(Collectors.toMap($$0 -> (cte.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(agg d, cte.a.a e) {
      public static final cte.a a = new cte.a(
         new agg("nether"),
         new cte.a.a() {
            @Override
            public <T> csz.c<T> apply(Function<agf<csq>, T> $$0) {
               return new csz.c<>(
                  List.of(
                     Pair.of(csz.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(csx.ac)),
                     Pair.of(csz.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(csx.af)),
                     Pair.of(csz.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(csx.ae)),
                     Pair.of(csz.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(csx.ad)),
                     Pair.of(csz.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(csx.ag))
                  )
               );
            }
         }
      );
      public static final cte.a b = new cte.a(new agg("overworld"), new cte.a.a() {
         @Override
         public <T> csz.c<T> apply(Function<agf<csq>, T> $$0) {
            return cte.a.a($$0);
         }
      });
      static final Map<agg, cte.a> f = Stream.of(a, b).collect(Collectors.toMap(cte.a::b, $$0 -> (cte.a)$$0));
      public static final Codec<cte.a> c = agg.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> csz.c<T> a(Function<agf<csq>, T> $$0) {
         Builder<Pair<csz.d, T>> $$1 = ImmutableList.builder();
         new ctg().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new csz.c<>($$1.build());
      }

      public Stream<agf<csq>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<agf<csq>>map(Pair::getSecond).distinct();
      }

      public agg b() {
         return this.d;
      }

      public cte.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> csz.c<T> apply(Function<agf<csq>, T> var1);
      }
   }
}
