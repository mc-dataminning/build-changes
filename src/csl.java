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

public class csl {
   public static final Codec<csl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(csl.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), afu.c(jz.aq)).apply($$0, csl::new)
   );
   public static final Codec<ib<csl>> b = afs.a(jz.aH, a);
   private final csl.a c;
   private final csg.c<ib<crx>> d;

   public csl(csl.a $$0, ic<crx> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public csg.c<ib<crx>> a() {
      return this.d;
   }

   public static Map<csl.a, csg.c<afv<crx>>> b() {
      return csl.a.f.values().stream().collect(Collectors.toMap($$0 -> (csl.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(afw d, csl.a.a e) {
      public static final csl.a a = new csl.a(
         new afw("nether"),
         new csl.a.a() {
            @Override
            public <T> csg.c<T> apply(Function<afv<crx>, T> $$0) {
               return new csg.c<>(
                  List.of(
                     Pair.of(csg.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cse.ac)),
                     Pair.of(csg.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cse.af)),
                     Pair.of(csg.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cse.ae)),
                     Pair.of(csg.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cse.ad)),
                     Pair.of(csg.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cse.ag))
                  )
               );
            }
         }
      );
      public static final csl.a b = new csl.a(new afw("overworld"), new csl.a.a() {
         @Override
         public <T> csg.c<T> apply(Function<afv<crx>, T> $$0) {
            return csl.a.a($$0);
         }
      });
      static final Map<afw, csl.a> f = Stream.of(a, b).collect(Collectors.toMap(csl.a::b, $$0 -> (csl.a)$$0));
      public static final Codec<csl.a> c = afw.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> csg.c<T> a(Function<afv<crx>, T> $$0) {
         Builder<Pair<csg.d, T>> $$1 = ImmutableList.builder();
         new csn().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new csg.c<>($$1.build());
      }

      public Stream<afv<crx>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<afv<crx>>map(Pair::getSecond).distinct();
      }

      public afw b() {
         return this.d;
      }

      public csl.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> csg.c<T> apply(Function<afv<crx>, T> var1);
      }
   }
}
