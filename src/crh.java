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

public class crh {
   public static final Codec<crh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(crh.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aeu.c(jc.ap)).apply($$0, crh::new)
   );
   public static final Codec<he<crh>> b = aes.a(jc.aG, a);
   private final crh.a c;
   private final crc.c<he<cqt>> d;

   public crh(crh.a $$0, hf<cqt> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public crc.c<he<cqt>> a() {
      return this.d;
   }

   public static Map<crh.a, crc.c<aev<cqt>>> b() {
      return crh.a.f.values().stream().collect(Collectors.toMap($$0 -> (crh.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(aew d, crh.a.a e) {
      public static final crh.a a = new crh.a(
         new aew("nether"),
         new crh.a.a() {
            @Override
            public <T> crc.c<T> apply(Function<aev<cqt>, T> $$0) {
               return new crc.c<>(
                  List.of(
                     Pair.of(crc.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cra.ac)),
                     Pair.of(crc.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cra.af)),
                     Pair.of(crc.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cra.ae)),
                     Pair.of(crc.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cra.ad)),
                     Pair.of(crc.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cra.ag))
                  )
               );
            }
         }
      );
      public static final crh.a b = new crh.a(new aew("overworld"), new crh.a.a() {
         @Override
         public <T> crc.c<T> apply(Function<aev<cqt>, T> $$0) {
            return crh.a.a($$0);
         }
      });
      static final Map<aew, crh.a> f = Stream.of(a, b).collect(Collectors.toMap(crh.a::b, $$0 -> (crh.a)$$0));
      public static final Codec<crh.a> c = aew.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> crc.c<T> a(Function<aev<cqt>, T> $$0) {
         Builder<Pair<crc.d, T>> $$1 = ImmutableList.builder();
         new crj().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new crc.c<>($$1.build());
      }

      public Stream<aev<cqt>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<aev<cqt>>map(Pair::getSecond).distinct();
      }

      public aew b() {
         return this.d;
      }

      public crh.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> crc.c<T> apply(Function<aev<cqt>, T> var1);
      }
   }
}
