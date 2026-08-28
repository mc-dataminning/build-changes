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

public class dhw {
   public static final Codec<dhw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhw.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aks.c(mc.aI)).apply($$0, dhw::new)
   );
   public static final Codec<jr<dhw>> b = akq.a(mc.bc, a);
   private final dhw.a c;
   private final dhr.c<jr<dhi>> d;

   public dhw(dhw.a $$0, js<dhi> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dhr.c<jr<dhi>> a() {
      return this.d;
   }

   public static Map<dhw.a, dhr.c<akt<dhi>>> b() {
      return dhw.a.f.values().stream().collect(Collectors.toMap($$0 -> (dhw.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(aku d, dhw.a.a e) {
      public static final dhw.a a = new dhw.a(
         aku.b("nether"),
         new dhw.a.a() {
            @Override
            public <T> dhr.c<T> apply(Function<akt<dhi>, T> $$0) {
               return new dhr.c<>(
                  List.of(
                     Pair.of(dhr.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dhp.ad)),
                     Pair.of(dhr.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dhp.ag)),
                     Pair.of(dhr.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dhp.af)),
                     Pair.of(dhr.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dhp.ae)),
                     Pair.of(dhr.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dhp.ah))
                  )
               );
            }
         }
      );
      public static final dhw.a b = new dhw.a(aku.b("overworld"), new dhw.a.a() {
         @Override
         public <T> dhr.c<T> apply(Function<akt<dhi>, T> $$0) {
            return dhw.a.a($$0);
         }
      });
      static final Map<aku, dhw.a> f = Stream.of(a, b).collect(Collectors.toMap(dhw.a::b, $$0 -> (dhw.a)$$0));
      public static final Codec<dhw.a> c = aku.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dhr.c<T> a(Function<akt<dhi>, T> $$0) {
         Builder<Pair<dhr.d, T>> $$1 = ImmutableList.builder();
         new dhy().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dhr.c<>($$1.build());
      }

      public Stream<akt<dhi>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<akt<dhi>>map(Pair::getSecond).distinct();
      }

      public aku b() {
         return this.d;
      }

      public dhw.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dhr.c<T> apply(Function<akt<dhi>, T> var1);
      }
   }
}
