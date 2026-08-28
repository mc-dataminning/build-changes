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

public class ddm {
   public static final Codec<ddm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddm.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ald.c(lq.az)).apply($$0, ddm::new)
   );
   public static final Codec<ji<ddm>> b = alb.a(lq.aR, a);
   private final ddm.a c;
   private final ddh.c<ji<dcy>> d;

   public ddm(ddm.a $$0, jj<dcy> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public ddh.c<ji<dcy>> a() {
      return this.d;
   }

   public static Map<ddm.a, ddh.c<ale<dcy>>> b() {
      return ddm.a.f.values().stream().collect(Collectors.toMap($$0 -> (ddm.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alf d, ddm.a.a e) {
      public static final ddm.a a = new ddm.a(
         new alf("nether"),
         new ddm.a.a() {
            @Override
            public <T> ddh.c<T> apply(Function<ale<dcy>, T> $$0) {
               return new ddh.c<>(
                  List.of(
                     Pair.of(ddh.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddf.ac)),
                     Pair.of(ddh.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddf.af)),
                     Pair.of(ddh.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddf.ae)),
                     Pair.of(ddh.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(ddf.ad)),
                     Pair.of(ddh.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(ddf.ag))
                  )
               );
            }
         }
      );
      public static final ddm.a b = new ddm.a(new alf("overworld"), new ddm.a.a() {
         @Override
         public <T> ddh.c<T> apply(Function<ale<dcy>, T> $$0) {
            return ddm.a.a($$0);
         }
      });
      static final Map<alf, ddm.a> f = Stream.of(a, b).collect(Collectors.toMap(ddm.a::b, $$0 -> (ddm.a)$$0));
      public static final Codec<ddm.a> c = alf.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> ddh.c<T> a(Function<ale<dcy>, T> $$0) {
         Builder<Pair<ddh.d, T>> $$1 = ImmutableList.builder();
         new ddo().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new ddh.c<>($$1.build());
      }

      public Stream<ale<dcy>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ale<dcy>>map(Pair::getSecond).distinct();
      }

      public alf b() {
         return this.d;
      }

      public ddm.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> ddh.c<T> apply(Function<ale<dcy>, T> var1);
      }
   }
}
