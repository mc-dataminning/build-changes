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

public class dkr {
   public static final Codec<dkr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dkr.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ale.c(mg.aG)).apply($$0, dkr::new)
   );
   public static final Codec<je<dkr>> b = alc.a(mg.aW, a);
   private final dkr.a c;
   private final dkm.c<je<dkd>> d;

   public dkr(dkr.a $$0, jf<dkd> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dkm.c<je<dkd>> a() {
      return this.d;
   }

   public static Map<dkr.a, dkm.c<alf<dkd>>> b() {
      return dkr.a.f.values().stream().collect(Collectors.toMap($$0 -> (dkr.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alg d, dkr.a.a e) {
      public static final dkr.a a = new dkr.a(
         alg.b("nether"),
         new dkr.a.a() {
            @Override
            public <T> dkm.c<T> apply(Function<alf<dkd>, T> $$0) {
               return new dkm.c<>(
                  List.of(
                     Pair.of(dkm.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dkk.ad)),
                     Pair.of(dkm.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dkk.ag)),
                     Pair.of(dkm.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dkk.af)),
                     Pair.of(dkm.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dkk.ae)),
                     Pair.of(dkm.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dkk.ah))
                  )
               );
            }
         }
      );
      public static final dkr.a b = new dkr.a(alg.b("overworld"), new dkr.a.a() {
         @Override
         public <T> dkm.c<T> apply(Function<alf<dkd>, T> $$0) {
            return dkr.a.a($$0);
         }
      });
      static final Map<alg, dkr.a> f = Stream.of(a, b).collect(Collectors.toMap(dkr.a::b, $$0 -> (dkr.a)$$0));
      public static final Codec<dkr.a> c = alg.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dkm.c<T> a(Function<alf<dkd>, T> $$0) {
         Builder<Pair<dkm.d, T>> $$1 = ImmutableList.builder();
         new dkt().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dkm.c<>($$1.build());
      }

      public Stream<alf<dkd>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<alf<dkd>>map(Pair::getSecond).distinct();
      }

      public alg b() {
         return this.d;
      }

      public dkr.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dkm.c<T> apply(Function<alf<dkd>, T> var1);
      }
   }
}
