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

public class ddn {
   public static final Codec<ddn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddn.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ald.c(lq.az)).apply($$0, ddn::new)
   );
   public static final Codec<ji<ddn>> b = alb.a(lq.aR, a);
   private final ddn.a c;
   private final ddi.c<ji<dcz>> d;

   public ddn(ddn.a $$0, jj<dcz> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public ddi.c<ji<dcz>> a() {
      return this.d;
   }

   public static Map<ddn.a, ddi.c<ale<dcz>>> b() {
      return ddn.a.f.values().stream().collect(Collectors.toMap($$0 -> (ddn.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alf d, ddn.a.a e) {
      public static final ddn.a a = new ddn.a(
         new alf("nether"),
         new ddn.a.a() {
            @Override
            public <T> ddi.c<T> apply(Function<ale<dcz>, T> $$0) {
               return new ddi.c<>(
                  List.of(
                     Pair.of(ddi.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddg.ac)),
                     Pair.of(ddi.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddg.af)),
                     Pair.of(ddi.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddg.ae)),
                     Pair.of(ddi.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(ddg.ad)),
                     Pair.of(ddi.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(ddg.ag))
                  )
               );
            }
         }
      );
      public static final ddn.a b = new ddn.a(new alf("overworld"), new ddn.a.a() {
         @Override
         public <T> ddi.c<T> apply(Function<ale<dcz>, T> $$0) {
            return ddn.a.a($$0);
         }
      });
      static final Map<alf, ddn.a> f = Stream.of(a, b).collect(Collectors.toMap(ddn.a::b, $$0 -> (ddn.a)$$0));
      public static final Codec<ddn.a> c = alf.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> ddi.c<T> a(Function<ale<dcz>, T> $$0) {
         Builder<Pair<ddi.d, T>> $$1 = ImmutableList.builder();
         new ddp().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new ddi.c<>($$1.build());
      }

      public Stream<ale<dcz>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ale<dcz>>map(Pair::getSecond).distinct();
      }

      public alf b() {
         return this.d;
      }

      public ddn.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> ddi.c<T> apply(Function<ale<dcz>, T> var1);
      }
   }
}
