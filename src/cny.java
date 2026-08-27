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

public class cny {
   public static final Codec<cny> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cny.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aco.c(jc.ap)).apply($$0, cny::new)
   );
   public static final Codec<he<cny>> b = acm.a(jc.aG, a);
   private final cny.a c;
   private final cnt.c<he<cnk>> d;

   public cny(cny.a $$0, hf<cnk> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cnt.c<he<cnk>> a() {
      return this.d;
   }

   public static Map<cny.a, cnt.c<acp<cnk>>> b() {
      return cny.a.f.values().stream().collect(Collectors.toMap($$0 -> (cny.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(acq d, cny.a.a e) {
      public static final cny.a a = new cny.a(
         new acq("nether"),
         new cny.a.a() {
            @Override
            public <T> cnt.c<T> apply(Function<acp<cnk>, T> $$0) {
               return new cnt.c<>(
                  List.of(
                     Pair.of(cnt.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cnr.ac)),
                     Pair.of(cnt.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cnr.af)),
                     Pair.of(cnt.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cnr.ae)),
                     Pair.of(cnt.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cnr.ad)),
                     Pair.of(cnt.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cnr.ag))
                  )
               );
            }
         }
      );
      public static final cny.a b = new cny.a(new acq("overworld"), new cny.a.a() {
         @Override
         public <T> cnt.c<T> apply(Function<acp<cnk>, T> $$0) {
            return cny.a.a($$0);
         }
      });
      static final Map<acq, cny.a> f = Stream.of(a, b).collect(Collectors.toMap(cny.a::b, $$0 -> (cny.a)$$0));
      public static final Codec<cny.a> c = acq.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cnt.c<T> a(Function<acp<cnk>, T> $$0) {
         Builder<Pair<cnt.d, T>> $$1 = ImmutableList.builder();
         new coa().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cnt.c<>($$1.build());
      }

      public Stream<acp<cnk>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<acp<cnk>>map(Pair::getSecond).distinct();
      }

      public acq b() {
         return this.d;
      }

      public cny.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cnt.c<T> apply(Function<acp<cnk>, T> var1);
      }
   }
}
