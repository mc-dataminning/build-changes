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

public class dfy {
   public static final Codec<dfy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dfy.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), alc.c(lw.aH)).apply($$0, dfy::new)
   );
   public static final Codec<jo<dfy>> b = ala.a(lw.bb, a);
   private final dfy.a c;
   private final dft.c<jo<dfk>> d;

   public dfy(dfy.a $$0, jp<dfk> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dft.c<jo<dfk>> a() {
      return this.d;
   }

   public static Map<dfy.a, dft.c<ald<dfk>>> b() {
      return dfy.a.f.values().stream().collect(Collectors.toMap($$0 -> (dfy.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(ale d, dfy.a.a e) {
      public static final dfy.a a = new dfy.a(
         ale.b("nether"),
         new dfy.a.a() {
            @Override
            public <T> dft.c<T> apply(Function<ald<dfk>, T> $$0) {
               return new dft.c<>(
                  List.of(
                     Pair.of(dft.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dfr.ac)),
                     Pair.of(dft.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dfr.af)),
                     Pair.of(dft.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dfr.ae)),
                     Pair.of(dft.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dfr.ad)),
                     Pair.of(dft.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dfr.ag))
                  )
               );
            }
         }
      );
      public static final dfy.a b = new dfy.a(ale.b("overworld"), new dfy.a.a() {
         @Override
         public <T> dft.c<T> apply(Function<ald<dfk>, T> $$0) {
            return dfy.a.a($$0);
         }
      });
      static final Map<ale, dfy.a> f = Stream.of(a, b).collect(Collectors.toMap(dfy.a::b, $$0 -> (dfy.a)$$0));
      public static final Codec<dfy.a> c = ale.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dft.c<T> a(Function<ald<dfk>, T> $$0) {
         Builder<Pair<dft.d, T>> $$1 = ImmutableList.builder();
         new dga().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dft.c<>($$1.build());
      }

      public Stream<ald<dfk>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ald<dfk>>map(Pair::getSecond).distinct();
      }

      public ale b() {
         return this.d;
      }

      public dfy.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dft.c<T> apply(Function<ald<dfk>, T> var1);
      }
   }
}
