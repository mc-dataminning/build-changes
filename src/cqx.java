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

public class cqx {
   public static final Codec<cqx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cqx.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aep.c(jc.ap)).apply($$0, cqx::new)
   );
   public static final Codec<he<cqx>> b = aen.a(jc.aG, a);
   private final cqx.a c;
   private final cqs.c<he<cqj>> d;

   public cqx(cqx.a $$0, hf<cqj> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cqs.c<he<cqj>> a() {
      return this.d;
   }

   public static Map<cqx.a, cqs.c<aeq<cqj>>> b() {
      return cqx.a.f.values().stream().collect(Collectors.toMap($$0 -> (cqx.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(aer d, cqx.a.a e) {
      public static final cqx.a a = new cqx.a(
         new aer("nether"),
         new cqx.a.a() {
            @Override
            public <T> cqs.c<T> apply(Function<aeq<cqj>, T> $$0) {
               return new cqs.c<>(
                  List.of(
                     Pair.of(cqs.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cqq.ac)),
                     Pair.of(cqs.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cqq.af)),
                     Pair.of(cqs.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cqq.ae)),
                     Pair.of(cqs.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cqq.ad)),
                     Pair.of(cqs.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cqq.ag))
                  )
               );
            }
         }
      );
      public static final cqx.a b = new cqx.a(new aer("overworld"), new cqx.a.a() {
         @Override
         public <T> cqs.c<T> apply(Function<aeq<cqj>, T> $$0) {
            return cqx.a.a($$0);
         }
      });
      static final Map<aer, cqx.a> f = Stream.of(a, b).collect(Collectors.toMap(cqx.a::b, $$0 -> (cqx.a)$$0));
      public static final Codec<cqx.a> c = aer.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cqs.c<T> a(Function<aeq<cqj>, T> $$0) {
         Builder<Pair<cqs.d, T>> $$1 = ImmutableList.builder();
         new cqz().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cqs.c<>($$1.build());
      }

      public Stream<aeq<cqj>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<aeq<cqj>>map(Pair::getSecond).distinct();
      }

      public aer b() {
         return this.d;
      }

      public cqx.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cqs.c<T> apply(Function<aeq<cqj>, T> var1);
      }
   }
}
