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

public class cqy {
   public static final Codec<cqy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cqy.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aep.c(jc.ap)).apply($$0, cqy::new)
   );
   public static final Codec<he<cqy>> b = aen.a(jc.aG, a);
   private final cqy.a c;
   private final cqt.c<he<cqk>> d;

   public cqy(cqy.a $$0, hf<cqk> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cqt.c<he<cqk>> a() {
      return this.d;
   }

   public static Map<cqy.a, cqt.c<aeq<cqk>>> b() {
      return cqy.a.f.values().stream().collect(Collectors.toMap($$0 -> (cqy.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(aer d, cqy.a.a e) {
      public static final cqy.a a = new cqy.a(
         new aer("nether"),
         new cqy.a.a() {
            @Override
            public <T> cqt.c<T> apply(Function<aeq<cqk>, T> $$0) {
               return new cqt.c<>(
                  List.of(
                     Pair.of(cqt.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cqr.ac)),
                     Pair.of(cqt.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cqr.af)),
                     Pair.of(cqt.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cqr.ae)),
                     Pair.of(cqt.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cqr.ad)),
                     Pair.of(cqt.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cqr.ag))
                  )
               );
            }
         }
      );
      public static final cqy.a b = new cqy.a(new aer("overworld"), new cqy.a.a() {
         @Override
         public <T> cqt.c<T> apply(Function<aeq<cqk>, T> $$0) {
            return cqy.a.a($$0);
         }
      });
      static final Map<aer, cqy.a> f = Stream.of(a, b).collect(Collectors.toMap(cqy.a::b, $$0 -> (cqy.a)$$0));
      public static final Codec<cqy.a> c = aer.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cqt.c<T> a(Function<aeq<cqk>, T> $$0) {
         Builder<Pair<cqt.d, T>> $$1 = ImmutableList.builder();
         new cra().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cqt.c<>($$1.build());
      }

      public Stream<aeq<cqk>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<aeq<cqk>>map(Pair::getSecond).distinct();
      }

      public aer b() {
         return this.d;
      }

      public cqy.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cqt.c<T> apply(Function<aeq<cqk>, T> var1);
      }
   }
}
