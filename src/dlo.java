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

public class dlo {
   public static final Codec<dlo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlo.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), alg.c(mh.aG)).apply($$0, dlo::new)
   );
   public static final Codec<jf<dlo>> b = ale.a(mh.aW, a);
   private final dlo.a c;
   private final dlj.c<jf<dla>> d;

   public dlo(dlo.a $$0, jg<dla> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dlj.c<jf<dla>> a() {
      return this.d;
   }

   public static Map<dlo.a, dlj.c<alh<dla>>> b() {
      return dlo.a.f.values().stream().collect(Collectors.toMap($$0 -> (dlo.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(ali d, dlo.a.a e) {
      public static final dlo.a a = new dlo.a(
         ali.b("nether"),
         new dlo.a.a() {
            @Override
            public <T> dlj.c<T> apply(Function<alh<dla>, T> $$0) {
               return new dlj.c<>(
                  List.of(
                     Pair.of(dlj.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dlh.ad)),
                     Pair.of(dlj.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dlh.ag)),
                     Pair.of(dlj.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dlh.af)),
                     Pair.of(dlj.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dlh.ae)),
                     Pair.of(dlj.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dlh.ah))
                  )
               );
            }
         }
      );
      public static final dlo.a b = new dlo.a(ali.b("overworld"), new dlo.a.a() {
         @Override
         public <T> dlj.c<T> apply(Function<alh<dla>, T> $$0) {
            return dlo.a.a($$0);
         }
      });
      static final Map<ali, dlo.a> f = Stream.of(a, b).collect(Collectors.toMap(dlo.a::b, $$0 -> (dlo.a)$$0));
      public static final Codec<dlo.a> c = ali.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dlj.c<T> a(Function<alh<dla>, T> $$0) {
         Builder<Pair<dlj.d, T>> $$1 = ImmutableList.builder();
         new dlq().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dlj.c<>($$1.build());
      }

      public Stream<alh<dla>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<alh<dla>>map(Pair::getSecond).distinct();
      }

      public ali b() {
         return this.d;
      }

      public dlo.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dlj.c<T> apply(Function<alh<dla>, T> var1);
      }
   }
}
