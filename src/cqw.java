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

public class cqw {
   public static final Codec<cqw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cqw.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aen.c(jd.ap)).apply($$0, cqw::new)
   );
   public static final Codec<hf<cqw>> b = ael.a(jd.aG, a);
   private final cqw.a c;
   private final cqr.c<hf<cqi>> d;

   public cqw(cqw.a $$0, hg<cqi> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cqr.c<hf<cqi>> a() {
      return this.d;
   }

   public static Map<cqw.a, cqr.c<aeo<cqi>>> b() {
      return cqw.a.f.values().stream().collect(Collectors.toMap($$0 -> (cqw.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(aep d, cqw.a.a e) {
      public static final cqw.a a = new cqw.a(
         new aep("nether"),
         new cqw.a.a() {
            @Override
            public <T> cqr.c<T> apply(Function<aeo<cqi>, T> $$0) {
               return new cqr.c<>(
                  List.of(
                     Pair.of(cqr.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cqp.ac)),
                     Pair.of(cqr.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cqp.af)),
                     Pair.of(cqr.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cqp.ae)),
                     Pair.of(cqr.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cqp.ad)),
                     Pair.of(cqr.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cqp.ag))
                  )
               );
            }
         }
      );
      public static final cqw.a b = new cqw.a(new aep("overworld"), new cqw.a.a() {
         @Override
         public <T> cqr.c<T> apply(Function<aeo<cqi>, T> $$0) {
            return cqw.a.a($$0);
         }
      });
      static final Map<aep, cqw.a> f = Stream.of(a, b).collect(Collectors.toMap(cqw.a::b, $$0 -> (cqw.a)$$0));
      public static final Codec<cqw.a> c = aep.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cqr.c<T> a(Function<aeo<cqi>, T> $$0) {
         Builder<Pair<cqr.d, T>> $$1 = ImmutableList.builder();
         new cqy().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cqr.c<>($$1.build());
      }

      public Stream<aeo<cqi>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<aeo<cqi>>map(Pair::getSecond).distinct();
      }

      public aep b() {
         return this.d;
      }

      public cqw.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cqr.c<T> apply(Function<aeo<cqi>, T> var1);
      }
   }
}
