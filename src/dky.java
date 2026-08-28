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

public class dky {
   public static final Codec<dky> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dky.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ale.c(mh.aG)).apply($$0, dky::new)
   );
   public static final Codec<jf<dky>> b = alc.a(mh.aW, a);
   private final dky.a c;
   private final dkt.c<jf<dkk>> d;

   public dky(dky.a $$0, jg<dkk> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dkt.c<jf<dkk>> a() {
      return this.d;
   }

   public static Map<dky.a, dkt.c<alf<dkk>>> b() {
      return dky.a.f.values().stream().collect(Collectors.toMap($$0 -> (dky.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alg d, dky.a.a e) {
      public static final dky.a a = new dky.a(
         alg.b("nether"),
         new dky.a.a() {
            @Override
            public <T> dkt.c<T> apply(Function<alf<dkk>, T> $$0) {
               return new dkt.c<>(
                  List.of(
                     Pair.of(dkt.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dkr.ad)),
                     Pair.of(dkt.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dkr.ag)),
                     Pair.of(dkt.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dkr.af)),
                     Pair.of(dkt.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dkr.ae)),
                     Pair.of(dkt.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dkr.ah))
                  )
               );
            }
         }
      );
      public static final dky.a b = new dky.a(alg.b("overworld"), new dky.a.a() {
         @Override
         public <T> dkt.c<T> apply(Function<alf<dkk>, T> $$0) {
            return dky.a.a($$0);
         }
      });
      static final Map<alg, dky.a> f = Stream.of(a, b).collect(Collectors.toMap(dky.a::b, $$0 -> (dky.a)$$0));
      public static final Codec<dky.a> c = alg.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dkt.c<T> a(Function<alf<dkk>, T> $$0) {
         Builder<Pair<dkt.d, T>> $$1 = ImmutableList.builder();
         new dla().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dkt.c<>($$1.build());
      }

      public Stream<alf<dkk>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<alf<dkk>>map(Pair::getSecond).distinct();
      }

      public alg b() {
         return this.d;
      }

      public dky.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dkt.c<T> apply(Function<alf<dkk>, T> var1);
      }
   }
}
