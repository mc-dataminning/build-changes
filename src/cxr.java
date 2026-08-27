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

public class cxr {
   public static final Codec<cxr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxr.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aja.c(ki.au)).apply($$0, cxr::new)
   );
   public static final Codec<il<cxr>> b = aiy.a(ki.aM, a);
   private final cxr.a c;
   private final cxm.c<il<cxd>> d;

   public cxr(cxr.a $$0, im<cxd> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cxm.c<il<cxd>> a() {
      return this.d;
   }

   public static Map<cxr.a, cxm.c<ajb<cxd>>> b() {
      return cxr.a.f.values().stream().collect(Collectors.toMap($$0 -> (cxr.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(ajc d, cxr.a.a e) {
      public static final cxr.a a = new cxr.a(
         new ajc("nether"),
         new cxr.a.a() {
            @Override
            public <T> cxm.c<T> apply(Function<ajb<cxd>, T> $$0) {
               return new cxm.c<>(
                  List.of(
                     Pair.of(cxm.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cxk.ac)),
                     Pair.of(cxm.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cxk.af)),
                     Pair.of(cxm.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cxk.ae)),
                     Pair.of(cxm.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cxk.ad)),
                     Pair.of(cxm.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cxk.ag))
                  )
               );
            }
         }
      );
      public static final cxr.a b = new cxr.a(new ajc("overworld"), new cxr.a.a() {
         @Override
         public <T> cxm.c<T> apply(Function<ajb<cxd>, T> $$0) {
            return cxr.a.a($$0);
         }
      });
      static final Map<ajc, cxr.a> f = Stream.of(a, b).collect(Collectors.toMap(cxr.a::b, $$0 -> (cxr.a)$$0));
      public static final Codec<cxr.a> c = ajc.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cxm.c<T> a(Function<ajb<cxd>, T> $$0) {
         Builder<Pair<cxm.d, T>> $$1 = ImmutableList.builder();
         new cxt().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cxm.c<>($$1.build());
      }

      public Stream<ajb<cxd>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ajb<cxd>>map(Pair::getSecond).distinct();
      }

      public ajc b() {
         return this.d;
      }

      public cxr.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cxm.c<T> apply(Function<ajb<cxd>, T> var1);
      }
   }
}
