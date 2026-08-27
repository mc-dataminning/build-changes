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

public class cvk {
   public static final Codec<cvk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cvk.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ahf.c(ke.at)).apply($$0, cvk::new)
   );
   public static final Codec<ih<cvk>> b = ahd.a(ke.aL, a);
   private final cvk.a c;
   private final cvf.c<ih<cuw>> d;

   public cvk(cvk.a $$0, ii<cuw> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cvf.c<ih<cuw>> a() {
      return this.d;
   }

   public static Map<cvk.a, cvf.c<ahg<cuw>>> b() {
      return cvk.a.f.values().stream().collect(Collectors.toMap($$0 -> (cvk.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(ahh d, cvk.a.a e) {
      public static final cvk.a a = new cvk.a(
         new ahh("nether"),
         new cvk.a.a() {
            @Override
            public <T> cvf.c<T> apply(Function<ahg<cuw>, T> $$0) {
               return new cvf.c<>(
                  List.of(
                     Pair.of(cvf.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cvd.ac)),
                     Pair.of(cvf.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cvd.af)),
                     Pair.of(cvf.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cvd.ae)),
                     Pair.of(cvf.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cvd.ad)),
                     Pair.of(cvf.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cvd.ag))
                  )
               );
            }
         }
      );
      public static final cvk.a b = new cvk.a(new ahh("overworld"), new cvk.a.a() {
         @Override
         public <T> cvf.c<T> apply(Function<ahg<cuw>, T> $$0) {
            return cvk.a.a($$0);
         }
      });
      static final Map<ahh, cvk.a> f = Stream.of(a, b).collect(Collectors.toMap(cvk.a::b, $$0 -> (cvk.a)$$0));
      public static final Codec<cvk.a> c = ahh.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cvf.c<T> a(Function<ahg<cuw>, T> $$0) {
         Builder<Pair<cvf.d, T>> $$1 = ImmutableList.builder();
         new cvm().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cvf.c<>($$1.build());
      }

      public Stream<ahg<cuw>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ahg<cuw>>map(Pair::getSecond).distinct();
      }

      public ahh b() {
         return this.d;
      }

      public cvk.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cvf.c<T> apply(Function<ahg<cuw>, T> var1);
      }
   }
}
