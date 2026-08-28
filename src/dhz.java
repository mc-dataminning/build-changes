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

public class dhz {
   public static final Codec<dhz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhz.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), akt.c(mc.aI)).apply($$0, dhz::new)
   );
   public static final Codec<jr<dhz>> b = akr.a(mc.bc, a);
   private final dhz.a c;
   private final dhu.c<jr<dhl>> d;

   public dhz(dhz.a $$0, js<dhl> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dhu.c<jr<dhl>> a() {
      return this.d;
   }

   public static Map<dhz.a, dhu.c<aku<dhl>>> b() {
      return dhz.a.f.values().stream().collect(Collectors.toMap($$0 -> (dhz.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(akv d, dhz.a.a e) {
      public static final dhz.a a = new dhz.a(
         akv.b("nether"),
         new dhz.a.a() {
            @Override
            public <T> dhu.c<T> apply(Function<aku<dhl>, T> $$0) {
               return new dhu.c<>(
                  List.of(
                     Pair.of(dhu.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dhs.ad)),
                     Pair.of(dhu.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dhs.ag)),
                     Pair.of(dhu.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dhs.af)),
                     Pair.of(dhu.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dhs.ae)),
                     Pair.of(dhu.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dhs.ah))
                  )
               );
            }
         }
      );
      public static final dhz.a b = new dhz.a(akv.b("overworld"), new dhz.a.a() {
         @Override
         public <T> dhu.c<T> apply(Function<aku<dhl>, T> $$0) {
            return dhz.a.a($$0);
         }
      });
      static final Map<akv, dhz.a> f = Stream.of(a, b).collect(Collectors.toMap(dhz.a::b, $$0 -> (dhz.a)$$0));
      public static final Codec<dhz.a> c = akv.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dhu.c<T> a(Function<aku<dhl>, T> $$0) {
         Builder<Pair<dhu.d, T>> $$1 = ImmutableList.builder();
         new dib().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dhu.c<>($$1.build());
      }

      public Stream<aku<dhl>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<aku<dhl>>map(Pair::getSecond).distinct();
      }

      public akv b() {
         return this.d;
      }

      public dhz.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dhu.c<T> apply(Function<aku<dhl>, T> var1);
      }
   }
}
