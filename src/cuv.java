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

public class cuv {
   public static final Codec<cuv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cuv.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ahb.c(ke.at)).apply($$0, cuv::new)
   );
   public static final Codec<ih<cuv>> b = agz.a(ke.aL, a);
   private final cuv.a c;
   private final cuq.c<ih<cuh>> d;

   public cuv(cuv.a $$0, ii<cuh> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cuq.c<ih<cuh>> a() {
      return this.d;
   }

   public static Map<cuv.a, cuq.c<ahc<cuh>>> b() {
      return cuv.a.f.values().stream().collect(Collectors.toMap($$0 -> (cuv.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(ahd d, cuv.a.a e) {
      public static final cuv.a a = new cuv.a(
         new ahd("nether"),
         new cuv.a.a() {
            @Override
            public <T> cuq.c<T> apply(Function<ahc<cuh>, T> $$0) {
               return new cuq.c<>(
                  List.of(
                     Pair.of(cuq.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cuo.ac)),
                     Pair.of(cuq.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cuo.af)),
                     Pair.of(cuq.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cuo.ae)),
                     Pair.of(cuq.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cuo.ad)),
                     Pair.of(cuq.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cuo.ag))
                  )
               );
            }
         }
      );
      public static final cuv.a b = new cuv.a(new ahd("overworld"), new cuv.a.a() {
         @Override
         public <T> cuq.c<T> apply(Function<ahc<cuh>, T> $$0) {
            return cuv.a.a($$0);
         }
      });
      static final Map<ahd, cuv.a> f = Stream.of(a, b).collect(Collectors.toMap(cuv.a::b, $$0 -> (cuv.a)$$0));
      public static final Codec<cuv.a> c = ahd.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cuq.c<T> a(Function<ahc<cuh>, T> $$0) {
         Builder<Pair<cuq.d, T>> $$1 = ImmutableList.builder();
         new cux().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cuq.c<>($$1.build());
      }

      public Stream<ahc<cuh>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ahc<cuh>>map(Pair::getSecond).distinct();
      }

      public ahd b() {
         return this.d;
      }

      public cuv.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cuq.c<T> apply(Function<ahc<cuh>, T> var1);
      }
   }
}
