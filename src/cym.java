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

public class cym {
   public static final Codec<cym> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cym.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ajf.c(kj.au)).apply($$0, cym::new)
   );
   public static final Codec<il<cym>> b = ajd.a(kj.aM, a);
   private final cym.a c;
   private final cyh.c<il<cxy>> d;

   public cym(cym.a $$0, im<cxy> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cyh.c<il<cxy>> a() {
      return this.d;
   }

   public static Map<cym.a, cyh.c<ajg<cxy>>> b() {
      return cym.a.f.values().stream().collect(Collectors.toMap($$0 -> (cym.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(ajh d, cym.a.a e) {
      public static final cym.a a = new cym.a(
         new ajh("nether"),
         new cym.a.a() {
            @Override
            public <T> cyh.c<T> apply(Function<ajg<cxy>, T> $$0) {
               return new cyh.c<>(
                  List.of(
                     Pair.of(cyh.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cyf.ac)),
                     Pair.of(cyh.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cyf.af)),
                     Pair.of(cyh.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cyf.ae)),
                     Pair.of(cyh.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cyf.ad)),
                     Pair.of(cyh.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cyf.ag))
                  )
               );
            }
         }
      );
      public static final cym.a b = new cym.a(new ajh("overworld"), new cym.a.a() {
         @Override
         public <T> cyh.c<T> apply(Function<ajg<cxy>, T> $$0) {
            return cym.a.a($$0);
         }
      });
      static final Map<ajh, cym.a> f = Stream.of(a, b).collect(Collectors.toMap(cym.a::b, $$0 -> (cym.a)$$0));
      public static final Codec<cym.a> c = ajh.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cyh.c<T> a(Function<ajg<cxy>, T> $$0) {
         Builder<Pair<cyh.d, T>> $$1 = ImmutableList.builder();
         new cyo().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cyh.c<>($$1.build());
      }

      public Stream<ajg<cxy>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ajg<cxy>>map(Pair::getSecond).distinct();
      }

      public ajh b() {
         return this.d;
      }

      public cym.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cyh.c<T> apply(Function<ajg<cxy>, T> var1);
      }
   }
}
