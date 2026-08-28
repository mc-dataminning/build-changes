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

public class djg {
   public static final Codec<djg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(djg.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), alb.c(me.aM)).apply($$0, djg::new)
   );
   public static final Codec<js<djg>> b = akz.a(me.bj, a);
   private final djg.a c;
   private final djb.c<js<dis>> d;

   public djg(djg.a $$0, jt<dis> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public djb.c<js<dis>> a() {
      return this.d;
   }

   public static Map<djg.a, djb.c<alc<dis>>> b() {
      return djg.a.f.values().stream().collect(Collectors.toMap($$0 -> (djg.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(ald d, djg.a.a e) {
      public static final djg.a a = new djg.a(
         ald.b("nether"),
         new djg.a.a() {
            @Override
            public <T> djb.c<T> apply(Function<alc<dis>, T> $$0) {
               return new djb.c<>(
                  List.of(
                     Pair.of(djb.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(diz.ad)),
                     Pair.of(djb.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(diz.ag)),
                     Pair.of(djb.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(diz.af)),
                     Pair.of(djb.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(diz.ae)),
                     Pair.of(djb.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(diz.ah))
                  )
               );
            }
         }
      );
      public static final djg.a b = new djg.a(ald.b("overworld"), new djg.a.a() {
         @Override
         public <T> djb.c<T> apply(Function<alc<dis>, T> $$0) {
            return djg.a.a($$0);
         }
      });
      static final Map<ald, djg.a> f = Stream.of(a, b).collect(Collectors.toMap(djg.a::b, $$0 -> (djg.a)$$0));
      public static final Codec<djg.a> c = ald.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> djb.c<T> a(Function<alc<dis>, T> $$0) {
         Builder<Pair<djb.d, T>> $$1 = ImmutableList.builder();
         new dji().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new djb.c<>($$1.build());
      }

      public Stream<alc<dis>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<alc<dis>>map(Pair::getSecond).distinct();
      }

      public ald b() {
         return this.d;
      }

      public djg.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> djb.c<T> apply(Function<alc<dis>, T> var1);
      }
   }
}
