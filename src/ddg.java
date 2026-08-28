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

public class ddg {
   public static final Codec<ddg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddg.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), akz.c(lq.az)).apply($$0, ddg::new)
   );
   public static final Codec<ji<ddg>> b = akx.a(lq.aR, a);
   private final ddg.a c;
   private final ddb.c<ji<dcs>> d;

   public ddg(ddg.a $$0, jj<dcs> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public ddb.c<ji<dcs>> a() {
      return this.d;
   }

   public static Map<ddg.a, ddb.c<ala<dcs>>> b() {
      return ddg.a.f.values().stream().collect(Collectors.toMap($$0 -> (ddg.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alb d, ddg.a.a e) {
      public static final ddg.a a = new ddg.a(
         new alb("nether"),
         new ddg.a.a() {
            @Override
            public <T> ddb.c<T> apply(Function<ala<dcs>, T> $$0) {
               return new ddb.c<>(
                  List.of(
                     Pair.of(ddb.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dcz.ac)),
                     Pair.of(ddb.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dcz.af)),
                     Pair.of(ddb.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dcz.ae)),
                     Pair.of(ddb.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dcz.ad)),
                     Pair.of(ddb.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dcz.ag))
                  )
               );
            }
         }
      );
      public static final ddg.a b = new ddg.a(new alb("overworld"), new ddg.a.a() {
         @Override
         public <T> ddb.c<T> apply(Function<ala<dcs>, T> $$0) {
            return ddg.a.a($$0);
         }
      });
      static final Map<alb, ddg.a> f = Stream.of(a, b).collect(Collectors.toMap(ddg.a::b, $$0 -> (ddg.a)$$0));
      public static final Codec<ddg.a> c = alb.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> ddb.c<T> a(Function<ala<dcs>, T> $$0) {
         Builder<Pair<ddb.d, T>> $$1 = ImmutableList.builder();
         new ddi().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new ddb.c<>($$1.build());
      }

      public Stream<ala<dcs>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ala<dcs>>map(Pair::getSecond).distinct();
      }

      public alb b() {
         return this.d;
      }

      public ddg.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> ddb.c<T> apply(Function<ala<dcs>, T> var1);
      }
   }
}
