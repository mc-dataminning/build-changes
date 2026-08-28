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

public class dld {
   public static final Codec<dld> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dld.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ale.c(mh.aG)).apply($$0, dld::new)
   );
   public static final Codec<jf<dld>> b = alc.a(mh.aW, a);
   private final dld.a c;
   private final dky.c<jf<dkp>> d;

   public dld(dld.a $$0, jg<dkp> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dky.c<jf<dkp>> a() {
      return this.d;
   }

   public static Map<dld.a, dky.c<alf<dkp>>> b() {
      return dld.a.f.values().stream().collect(Collectors.toMap($$0 -> (dld.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alg d, dld.a.a e) {
      public static final dld.a a = new dld.a(
         alg.b("nether"),
         new dld.a.a() {
            @Override
            public <T> dky.c<T> apply(Function<alf<dkp>, T> $$0) {
               return new dky.c<>(
                  List.of(
                     Pair.of(dky.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dkw.ad)),
                     Pair.of(dky.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dkw.ag)),
                     Pair.of(dky.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dkw.af)),
                     Pair.of(dky.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dkw.ae)),
                     Pair.of(dky.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dkw.ah))
                  )
               );
            }
         }
      );
      public static final dld.a b = new dld.a(alg.b("overworld"), new dld.a.a() {
         @Override
         public <T> dky.c<T> apply(Function<alf<dkp>, T> $$0) {
            return dld.a.a($$0);
         }
      });
      static final Map<alg, dld.a> f = Stream.of(a, b).collect(Collectors.toMap(dld.a::b, $$0 -> (dld.a)$$0));
      public static final Codec<dld.a> c = alg.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dky.c<T> a(Function<alf<dkp>, T> $$0) {
         Builder<Pair<dky.d, T>> $$1 = ImmutableList.builder();
         new dlf().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dky.c<>($$1.build());
      }

      public Stream<alf<dkp>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<alf<dkp>>map(Pair::getSecond).distinct();
      }

      public alg b() {
         return this.d;
      }

      public dld.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dky.c<T> apply(Function<alf<dkp>, T> var1);
      }
   }
}
