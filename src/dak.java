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

public class dak {
   public static final Codec<dak> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dak.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ajr.c(ks.av)).apply($$0, dak::new)
   );
   public static final Codec<il<dak>> b = ajp.a(ks.aN, a);
   private final dak.a c;
   private final daf.c<il<czw>> d;

   public dak(dak.a $$0, im<czw> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public daf.c<il<czw>> a() {
      return this.d;
   }

   public static Map<dak.a, daf.c<ajs<czw>>> b() {
      return dak.a.f.values().stream().collect(Collectors.toMap($$0 -> (dak.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(ajt d, dak.a.a e) {
      public static final dak.a a = new dak.a(
         new ajt("nether"),
         new dak.a.a() {
            @Override
            public <T> daf.c<T> apply(Function<ajs<czw>, T> $$0) {
               return new daf.c<>(
                  List.of(
                     Pair.of(daf.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dad.ac)),
                     Pair.of(daf.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dad.af)),
                     Pair.of(daf.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dad.ae)),
                     Pair.of(daf.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dad.ad)),
                     Pair.of(daf.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dad.ag))
                  )
               );
            }
         }
      );
      public static final dak.a b = new dak.a(new ajt("overworld"), new dak.a.a() {
         @Override
         public <T> daf.c<T> apply(Function<ajs<czw>, T> $$0) {
            return dak.a.a($$0);
         }
      });
      static final Map<ajt, dak.a> f = Stream.of(a, b).collect(Collectors.toMap(dak.a::b, $$0 -> (dak.a)$$0));
      public static final Codec<dak.a> c = ajt.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> daf.c<T> a(Function<ajs<czw>, T> $$0) {
         Builder<Pair<daf.d, T>> $$1 = ImmutableList.builder();
         new dam().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new daf.c<>($$1.build());
      }

      public Stream<ajs<czw>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ajs<czw>>map(Pair::getSecond).distinct();
      }

      public ajt b() {
         return this.d;
      }

      public dak.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> daf.c<T> apply(Function<ajs<czw>, T> var1);
      }
   }
}
