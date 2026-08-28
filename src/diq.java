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

public class diq {
   public static final Codec<diq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(diq.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aks.c(mc.aJ)).apply($$0, diq::new)
   );
   public static final Codec<jr<diq>> b = akq.a(mc.be, a);
   private final diq.a c;
   private final dil.c<jr<dic>> d;

   public diq(diq.a $$0, js<dic> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dil.c<jr<dic>> a() {
      return this.d;
   }

   public static Map<diq.a, dil.c<akt<dic>>> b() {
      return diq.a.f.values().stream().collect(Collectors.toMap($$0 -> (diq.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(aku d, diq.a.a e) {
      public static final diq.a a = new diq.a(
         aku.b("nether"),
         new diq.a.a() {
            @Override
            public <T> dil.c<T> apply(Function<akt<dic>, T> $$0) {
               return new dil.c<>(
                  List.of(
                     Pair.of(dil.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dij.ad)),
                     Pair.of(dil.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dij.ag)),
                     Pair.of(dil.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dij.af)),
                     Pair.of(dil.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dij.ae)),
                     Pair.of(dil.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dij.ah))
                  )
               );
            }
         }
      );
      public static final diq.a b = new diq.a(aku.b("overworld"), new diq.a.a() {
         @Override
         public <T> dil.c<T> apply(Function<akt<dic>, T> $$0) {
            return diq.a.a($$0);
         }
      });
      static final Map<aku, diq.a> f = Stream.of(a, b).collect(Collectors.toMap(diq.a::b, $$0 -> (diq.a)$$0));
      public static final Codec<diq.a> c = aku.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dil.c<T> a(Function<akt<dic>, T> $$0) {
         Builder<Pair<dil.d, T>> $$1 = ImmutableList.builder();
         new dis().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dil.c<>($$1.build());
      }

      public Stream<akt<dic>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<akt<dic>>map(Pair::getSecond).distinct();
      }

      public aku b() {
         return this.d;
      }

      public diq.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dil.c<T> apply(Function<akt<dic>, T> var1);
      }
   }
}
