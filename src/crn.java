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

public class crn {
   public static final Codec<crn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(crn.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aex.c(jc.aq)).apply($$0, crn::new)
   );
   public static final Codec<he<crn>> b = aev.a(jc.aH, a);
   private final crn.a c;
   private final cri.c<he<cqz>> d;

   public crn(crn.a $$0, hf<cqz> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cri.c<he<cqz>> a() {
      return this.d;
   }

   public static Map<crn.a, cri.c<aey<cqz>>> b() {
      return crn.a.f.values().stream().collect(Collectors.toMap($$0 -> (crn.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(aez d, crn.a.a e) {
      public static final crn.a a = new crn.a(
         new aez("nether"),
         new crn.a.a() {
            @Override
            public <T> cri.c<T> apply(Function<aey<cqz>, T> $$0) {
               return new cri.c<>(
                  List.of(
                     Pair.of(cri.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(crg.ac)),
                     Pair.of(cri.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(crg.af)),
                     Pair.of(cri.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(crg.ae)),
                     Pair.of(cri.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(crg.ad)),
                     Pair.of(cri.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(crg.ag))
                  )
               );
            }
         }
      );
      public static final crn.a b = new crn.a(new aez("overworld"), new crn.a.a() {
         @Override
         public <T> cri.c<T> apply(Function<aey<cqz>, T> $$0) {
            return crn.a.a($$0);
         }
      });
      static final Map<aez, crn.a> f = Stream.of(a, b).collect(Collectors.toMap(crn.a::b, $$0 -> (crn.a)$$0));
      public static final Codec<crn.a> c = aez.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cri.c<T> a(Function<aey<cqz>, T> $$0) {
         Builder<Pair<cri.d, T>> $$1 = ImmutableList.builder();
         new crp().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cri.c<>($$1.build());
      }

      public Stream<aey<cqz>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<aey<cqz>>map(Pair::getSecond).distinct();
      }

      public aez b() {
         return this.d;
      }

      public crn.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cri.c<T> apply(Function<aey<cqz>, T> var1);
      }
   }
}
