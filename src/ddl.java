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

public class ddl {
   public static final Codec<ddl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddl.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ald.c(lq.az)).apply($$0, ddl::new)
   );
   public static final Codec<ji<ddl>> b = alb.a(lq.aR, a);
   private final ddl.a c;
   private final ddg.c<ji<dcx>> d;

   public ddl(ddl.a $$0, jj<dcx> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public ddg.c<ji<dcx>> a() {
      return this.d;
   }

   public static Map<ddl.a, ddg.c<ale<dcx>>> b() {
      return ddl.a.f.values().stream().collect(Collectors.toMap($$0 -> (ddl.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alf d, ddl.a.a e) {
      public static final ddl.a a = new ddl.a(
         new alf("nether"),
         new ddl.a.a() {
            @Override
            public <T> ddg.c<T> apply(Function<ale<dcx>, T> $$0) {
               return new ddg.c<>(
                  List.of(
                     Pair.of(ddg.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dde.ac)),
                     Pair.of(ddg.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dde.af)),
                     Pair.of(ddg.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dde.ae)),
                     Pair.of(ddg.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dde.ad)),
                     Pair.of(ddg.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dde.ag))
                  )
               );
            }
         }
      );
      public static final ddl.a b = new ddl.a(new alf("overworld"), new ddl.a.a() {
         @Override
         public <T> ddg.c<T> apply(Function<ale<dcx>, T> $$0) {
            return ddl.a.a($$0);
         }
      });
      static final Map<alf, ddl.a> f = Stream.of(a, b).collect(Collectors.toMap(ddl.a::b, $$0 -> (ddl.a)$$0));
      public static final Codec<ddl.a> c = alf.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> ddg.c<T> a(Function<ale<dcx>, T> $$0) {
         Builder<Pair<ddg.d, T>> $$1 = ImmutableList.builder();
         new ddn().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new ddg.c<>($$1.build());
      }

      public Stream<ale<dcx>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ale<dcx>>map(Pair::getSecond).distinct();
      }

      public alf b() {
         return this.d;
      }

      public ddl.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> ddg.c<T> apply(Function<ale<dcx>, T> var1);
      }
   }
}
