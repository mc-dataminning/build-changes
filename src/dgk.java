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

public class dgk {
   public static final Codec<dgk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dgk.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), alf.c(ly.aG)).apply($$0, dgk::new)
   );
   public static final Codec<jp<dgk>> b = ald.a(ly.ba, a);
   private final dgk.a c;
   private final dgf.c<jp<dfw>> d;

   public dgk(dgk.a $$0, jq<dfw> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dgf.c<jp<dfw>> a() {
      return this.d;
   }

   public static Map<dgk.a, dgf.c<alg<dfw>>> b() {
      return dgk.a.f.values().stream().collect(Collectors.toMap($$0 -> (dgk.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alh d, dgk.a.a e) {
      public static final dgk.a a = new dgk.a(
         alh.b("nether"),
         new dgk.a.a() {
            @Override
            public <T> dgf.c<T> apply(Function<alg<dfw>, T> $$0) {
               return new dgf.c<>(
                  List.of(
                     Pair.of(dgf.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dgd.ac)),
                     Pair.of(dgf.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dgd.af)),
                     Pair.of(dgf.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dgd.ae)),
                     Pair.of(dgf.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dgd.ad)),
                     Pair.of(dgf.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dgd.ag))
                  )
               );
            }
         }
      );
      public static final dgk.a b = new dgk.a(alh.b("overworld"), new dgk.a.a() {
         @Override
         public <T> dgf.c<T> apply(Function<alg<dfw>, T> $$0) {
            return dgk.a.a($$0);
         }
      });
      static final Map<alh, dgk.a> f = Stream.of(a, b).collect(Collectors.toMap(dgk.a::b, $$0 -> (dgk.a)$$0));
      public static final Codec<dgk.a> c = alh.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dgf.c<T> a(Function<alg<dfw>, T> $$0) {
         Builder<Pair<dgf.d, T>> $$1 = ImmutableList.builder();
         new dgm().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dgf.c<>($$1.build());
      }

      public Stream<alg<dfw>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<alg<dfw>>map(Pair::getSecond).distinct();
      }

      public alh b() {
         return this.d;
      }

      public dgk.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dgf.c<T> apply(Function<alg<dfw>, T> var1);
      }
   }
}
