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

public class cyo {
   public static final Codec<cyo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cyo.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ajf.c(kj.au)).apply($$0, cyo::new)
   );
   public static final Codec<il<cyo>> b = ajd.a(kj.aM, a);
   private final cyo.a c;
   private final cyj.c<il<cya>> d;

   public cyo(cyo.a $$0, im<cya> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cyj.c<il<cya>> a() {
      return this.d;
   }

   public static Map<cyo.a, cyj.c<ajg<cya>>> b() {
      return cyo.a.f.values().stream().collect(Collectors.toMap($$0 -> (cyo.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(ajh d, cyo.a.a e) {
      public static final cyo.a a = new cyo.a(
         new ajh("nether"),
         new cyo.a.a() {
            @Override
            public <T> cyj.c<T> apply(Function<ajg<cya>, T> $$0) {
               return new cyj.c<>(
                  List.of(
                     Pair.of(cyj.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cyh.ac)),
                     Pair.of(cyj.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cyh.af)),
                     Pair.of(cyj.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cyh.ae)),
                     Pair.of(cyj.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cyh.ad)),
                     Pair.of(cyj.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cyh.ag))
                  )
               );
            }
         }
      );
      public static final cyo.a b = new cyo.a(new ajh("overworld"), new cyo.a.a() {
         @Override
         public <T> cyj.c<T> apply(Function<ajg<cya>, T> $$0) {
            return cyo.a.a($$0);
         }
      });
      static final Map<ajh, cyo.a> f = Stream.of(a, b).collect(Collectors.toMap(cyo.a::b, $$0 -> (cyo.a)$$0));
      public static final Codec<cyo.a> c = ajh.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cyj.c<T> a(Function<ajg<cya>, T> $$0) {
         Builder<Pair<cyj.d, T>> $$1 = ImmutableList.builder();
         new cyq().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cyj.c<>($$1.build());
      }

      public Stream<ajg<cya>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ajg<cya>>map(Pair::getSecond).distinct();
      }

      public ajh b() {
         return this.d;
      }

      public cyo.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cyj.c<T> apply(Function<ajg<cya>, T> var1);
      }
   }
}
