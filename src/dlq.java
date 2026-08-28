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

public class dlq {
   public static final Codec<dlq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlq.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ali.c(mi.aG)).apply($$0, dlq::new)
   );
   public static final Codec<jg<dlq>> b = alg.a(mi.aW, a);
   private final dlq.a c;
   private final dll.c<jg<dlc>> d;

   public dlq(dlq.a $$0, jh<dlc> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dll.c<jg<dlc>> a() {
      return this.d;
   }

   public static Map<dlq.a, dll.c<alj<dlc>>> b() {
      return dlq.a.f.values().stream().collect(Collectors.toMap($$0 -> (dlq.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alk d, dlq.a.a e) {
      public static final dlq.a a = new dlq.a(
         alk.b("nether"),
         new dlq.a.a() {
            @Override
            public <T> dll.c<T> apply(Function<alj<dlc>, T> $$0) {
               return new dll.c<>(
                  List.of(
                     Pair.of(dll.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dlj.ad)),
                     Pair.of(dll.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dlj.ag)),
                     Pair.of(dll.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dlj.af)),
                     Pair.of(dll.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dlj.ae)),
                     Pair.of(dll.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dlj.ah))
                  )
               );
            }
         }
      );
      public static final dlq.a b = new dlq.a(alk.b("overworld"), new dlq.a.a() {
         @Override
         public <T> dll.c<T> apply(Function<alj<dlc>, T> $$0) {
            return dlq.a.a($$0);
         }
      });
      static final Map<alk, dlq.a> f = Stream.of(a, b).collect(Collectors.toMap(dlq.a::b, $$0 -> (dlq.a)$$0));
      public static final Codec<dlq.a> c = alk.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dll.c<T> a(Function<alj<dlc>, T> $$0) {
         Builder<Pair<dll.d, T>> $$1 = ImmutableList.builder();
         new dls().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dll.c<>($$1.build());
      }

      public Stream<alj<dlc>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<alj<dlc>>map(Pair::getSecond).distinct();
      }

      public alk b() {
         return this.d;
      }

      public dlq.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dll.c<T> apply(Function<alj<dlc>, T> var1);
      }
   }
}
