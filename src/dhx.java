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

public class dhx {
   public static final Codec<dhx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhx.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), akt.c(mc.aI)).apply($$0, dhx::new)
   );
   public static final Codec<jr<dhx>> b = akr.a(mc.bc, a);
   private final dhx.a c;
   private final dhs.c<jr<dhj>> d;

   public dhx(dhx.a $$0, js<dhj> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dhs.c<jr<dhj>> a() {
      return this.d;
   }

   public static Map<dhx.a, dhs.c<aku<dhj>>> b() {
      return dhx.a.f.values().stream().collect(Collectors.toMap($$0 -> (dhx.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(akv d, dhx.a.a e) {
      public static final dhx.a a = new dhx.a(
         akv.b("nether"),
         new dhx.a.a() {
            @Override
            public <T> dhs.c<T> apply(Function<aku<dhj>, T> $$0) {
               return new dhs.c<>(
                  List.of(
                     Pair.of(dhs.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dhq.ad)),
                     Pair.of(dhs.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dhq.ag)),
                     Pair.of(dhs.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dhq.af)),
                     Pair.of(dhs.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dhq.ae)),
                     Pair.of(dhs.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dhq.ah))
                  )
               );
            }
         }
      );
      public static final dhx.a b = new dhx.a(akv.b("overworld"), new dhx.a.a() {
         @Override
         public <T> dhs.c<T> apply(Function<aku<dhj>, T> $$0) {
            return dhx.a.a($$0);
         }
      });
      static final Map<akv, dhx.a> f = Stream.of(a, b).collect(Collectors.toMap(dhx.a::b, $$0 -> (dhx.a)$$0));
      public static final Codec<dhx.a> c = akv.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dhs.c<T> a(Function<aku<dhj>, T> $$0) {
         Builder<Pair<dhs.d, T>> $$1 = ImmutableList.builder();
         new dhz().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dhs.c<>($$1.build());
      }

      public Stream<aku<dhj>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<aku<dhj>>map(Pair::getSecond).distinct();
      }

      public akv b() {
         return this.d;
      }

      public dhx.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dhs.c<T> apply(Function<aku<dhj>, T> var1);
      }
   }
}
