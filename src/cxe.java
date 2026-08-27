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

public class cxe {
   public static final Codec<cxe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxe.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aiw.c(kg.at)).apply($$0, cxe::new)
   );
   public static final Codec<ij<cxe>> b = aiu.a(kg.aL, a);
   private final cxe.a c;
   private final cwz.c<ij<cwq>> d;

   public cxe(cxe.a $$0, ik<cwq> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cwz.c<ij<cwq>> a() {
      return this.d;
   }

   public static Map<cxe.a, cwz.c<aix<cwq>>> b() {
      return cxe.a.f.values().stream().collect(Collectors.toMap($$0 -> (cxe.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(aiy d, cxe.a.a e) {
      public static final cxe.a a = new cxe.a(
         new aiy("nether"),
         new cxe.a.a() {
            @Override
            public <T> cwz.c<T> apply(Function<aix<cwq>, T> $$0) {
               return new cwz.c<>(
                  List.of(
                     Pair.of(cwz.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cwx.ac)),
                     Pair.of(cwz.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cwx.af)),
                     Pair.of(cwz.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cwx.ae)),
                     Pair.of(cwz.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cwx.ad)),
                     Pair.of(cwz.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cwx.ag))
                  )
               );
            }
         }
      );
      public static final cxe.a b = new cxe.a(new aiy("overworld"), new cxe.a.a() {
         @Override
         public <T> cwz.c<T> apply(Function<aix<cwq>, T> $$0) {
            return cxe.a.a($$0);
         }
      });
      static final Map<aiy, cxe.a> f = Stream.of(a, b).collect(Collectors.toMap(cxe.a::b, $$0 -> (cxe.a)$$0));
      public static final Codec<cxe.a> c = aiy.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cwz.c<T> a(Function<aix<cwq>, T> $$0) {
         Builder<Pair<cwz.d, T>> $$1 = ImmutableList.builder();
         new cxg().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cwz.c<>($$1.build());
      }

      public Stream<aix<cwq>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<aix<cwq>>map(Pair::getSecond).distinct();
      }

      public aiy b() {
         return this.d;
      }

      public cxe.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cwz.c<T> apply(Function<aix<cwq>, T> var1);
      }
   }
}
