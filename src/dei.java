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

public class dei {
   public static final Codec<dei> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dei.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ako.c(lu.aF)).apply($$0, dei::new)
   );
   public static final Codec<jm<dei>> b = akm.a(lu.aZ, a);
   private final dei.a c;
   private final ded.c<jm<ddu>> d;

   public dei(dei.a $$0, jn<ddu> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public ded.c<jm<ddu>> a() {
      return this.d;
   }

   public static Map<dei.a, ded.c<akp<ddu>>> b() {
      return dei.a.f.values().stream().collect(Collectors.toMap($$0 -> (dei.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(akq d, dei.a.a e) {
      public static final dei.a a = new dei.a(
         akq.b("nether"),
         new dei.a.a() {
            @Override
            public <T> ded.c<T> apply(Function<akp<ddu>, T> $$0) {
               return new ded.c<>(
                  List.of(
                     Pair.of(ded.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(deb.ac)),
                     Pair.of(ded.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(deb.af)),
                     Pair.of(ded.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(deb.ae)),
                     Pair.of(ded.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(deb.ad)),
                     Pair.of(ded.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(deb.ag))
                  )
               );
            }
         }
      );
      public static final dei.a b = new dei.a(akq.b("overworld"), new dei.a.a() {
         @Override
         public <T> ded.c<T> apply(Function<akp<ddu>, T> $$0) {
            return dei.a.a($$0);
         }
      });
      static final Map<akq, dei.a> f = Stream.of(a, b).collect(Collectors.toMap(dei.a::b, $$0 -> (dei.a)$$0));
      public static final Codec<dei.a> c = akq.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> ded.c<T> a(Function<akp<ddu>, T> $$0) {
         Builder<Pair<ded.d, T>> $$1 = ImmutableList.builder();
         new dek().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new ded.c<>($$1.build());
      }

      public Stream<akp<ddu>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<akp<ddu>>map(Pair::getSecond).distinct();
      }

      public akq b() {
         return this.d;
      }

      public dei.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> ded.c<T> apply(Function<akp<ddu>, T> var1);
      }
   }
}
