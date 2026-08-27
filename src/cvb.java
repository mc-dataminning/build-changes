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

public class cvb {
   public static final Codec<cvb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cvb.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ahe.c(ke.at)).apply($$0, cvb::new)
   );
   public static final Codec<ih<cvb>> b = ahc.a(ke.aL, a);
   private final cvb.a c;
   private final cuw.c<ih<cun>> d;

   public cvb(cvb.a $$0, ii<cun> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cuw.c<ih<cun>> a() {
      return this.d;
   }

   public static Map<cvb.a, cuw.c<ahf<cun>>> b() {
      return cvb.a.f.values().stream().collect(Collectors.toMap($$0 -> (cvb.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(ahg d, cvb.a.a e) {
      public static final cvb.a a = new cvb.a(
         new ahg("nether"),
         new cvb.a.a() {
            @Override
            public <T> cuw.c<T> apply(Function<ahf<cun>, T> $$0) {
               return new cuw.c<>(
                  List.of(
                     Pair.of(cuw.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cuu.ac)),
                     Pair.of(cuw.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cuu.af)),
                     Pair.of(cuw.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cuu.ae)),
                     Pair.of(cuw.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cuu.ad)),
                     Pair.of(cuw.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cuu.ag))
                  )
               );
            }
         }
      );
      public static final cvb.a b = new cvb.a(new ahg("overworld"), new cvb.a.a() {
         @Override
         public <T> cuw.c<T> apply(Function<ahf<cun>, T> $$0) {
            return cvb.a.a($$0);
         }
      });
      static final Map<ahg, cvb.a> f = Stream.of(a, b).collect(Collectors.toMap(cvb.a::b, $$0 -> (cvb.a)$$0));
      public static final Codec<cvb.a> c = ahg.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cuw.c<T> a(Function<ahf<cun>, T> $$0) {
         Builder<Pair<cuw.d, T>> $$1 = ImmutableList.builder();
         new cvd().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cuw.c<>($$1.build());
      }

      public Stream<ahf<cun>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ahf<cun>>map(Pair::getSecond).distinct();
      }

      public ahg b() {
         return this.d;
      }

      public cvb.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cuw.c<T> apply(Function<ahf<cun>, T> var1);
      }
   }
}
