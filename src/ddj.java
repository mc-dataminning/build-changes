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

public class ddj {
   public static final Codec<ddj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddj.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), alc.c(lq.az)).apply($$0, ddj::new)
   );
   public static final Codec<ji<ddj>> b = ala.a(lq.aR, a);
   private final ddj.a c;
   private final dde.c<ji<dcv>> d;

   public ddj(ddj.a $$0, jj<dcv> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dde.c<ji<dcv>> a() {
      return this.d;
   }

   public static Map<ddj.a, dde.c<ald<dcv>>> b() {
      return ddj.a.f.values().stream().collect(Collectors.toMap($$0 -> (ddj.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(ale d, ddj.a.a e) {
      public static final ddj.a a = new ddj.a(
         new ale("nether"),
         new ddj.a.a() {
            @Override
            public <T> dde.c<T> apply(Function<ald<dcv>, T> $$0) {
               return new dde.c<>(
                  List.of(
                     Pair.of(dde.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddc.ac)),
                     Pair.of(dde.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddc.af)),
                     Pair.of(dde.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddc.ae)),
                     Pair.of(dde.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(ddc.ad)),
                     Pair.of(dde.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(ddc.ag))
                  )
               );
            }
         }
      );
      public static final ddj.a b = new ddj.a(new ale("overworld"), new ddj.a.a() {
         @Override
         public <T> dde.c<T> apply(Function<ald<dcv>, T> $$0) {
            return ddj.a.a($$0);
         }
      });
      static final Map<ale, ddj.a> f = Stream.of(a, b).collect(Collectors.toMap(ddj.a::b, $$0 -> (ddj.a)$$0));
      public static final Codec<ddj.a> c = ale.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dde.c<T> a(Function<ald<dcv>, T> $$0) {
         Builder<Pair<dde.d, T>> $$1 = ImmutableList.builder();
         new ddl().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dde.c<>($$1.build());
      }

      public Stream<ald<dcv>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ald<dcv>>map(Pair::getSecond).distinct();
      }

      public ale b() {
         return this.d;
      }

      public ddj.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dde.c<T> apply(Function<ald<dcv>, T> var1);
      }
   }
}
