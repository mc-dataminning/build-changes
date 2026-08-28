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

public class dkm {
   public static final Codec<dkm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dkm.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ale.c(mg.aG)).apply($$0, dkm::new)
   );
   public static final Codec<je<dkm>> b = alc.a(mg.aV, a);
   private final dkm.a c;
   private final dkh.c<je<djy>> d;

   public dkm(dkm.a $$0, jf<djy> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dkh.c<je<djy>> a() {
      return this.d;
   }

   public static Map<dkm.a, dkh.c<alf<djy>>> b() {
      return dkm.a.f.values().stream().collect(Collectors.toMap($$0 -> (dkm.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alg d, dkm.a.a e) {
      public static final dkm.a a = new dkm.a(
         alg.b("nether"),
         new dkm.a.a() {
            @Override
            public <T> dkh.c<T> apply(Function<alf<djy>, T> $$0) {
               return new dkh.c<>(
                  List.of(
                     Pair.of(dkh.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dkf.ad)),
                     Pair.of(dkh.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dkf.ag)),
                     Pair.of(dkh.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dkf.af)),
                     Pair.of(dkh.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dkf.ae)),
                     Pair.of(dkh.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dkf.ah))
                  )
               );
            }
         }
      );
      public static final dkm.a b = new dkm.a(alg.b("overworld"), new dkm.a.a() {
         @Override
         public <T> dkh.c<T> apply(Function<alf<djy>, T> $$0) {
            return dkm.a.a($$0);
         }
      });
      static final Map<alg, dkm.a> f = Stream.of(a, b).collect(Collectors.toMap(dkm.a::b, $$0 -> (dkm.a)$$0));
      public static final Codec<dkm.a> c = alg.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dkh.c<T> a(Function<alf<djy>, T> $$0) {
         Builder<Pair<dkh.d, T>> $$1 = ImmutableList.builder();
         new dko().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dkh.c<>($$1.build());
      }

      public Stream<alf<djy>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<alf<djy>>map(Pair::getSecond).distinct();
      }

      public alg b() {
         return this.d;
      }

      public dkm.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dkh.c<T> apply(Function<alf<djy>, T> var1);
      }
   }
}
