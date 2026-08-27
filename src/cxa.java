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

public class cxa {
   public static final Codec<cxa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxa.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aiw.c(kg.at)).apply($$0, cxa::new)
   );
   public static final Codec<ij<cxa>> b = aiu.a(kg.aL, a);
   private final cxa.a c;
   private final cwv.c<ij<cwm>> d;

   public cxa(cxa.a $$0, ik<cwm> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cwv.c<ij<cwm>> a() {
      return this.d;
   }

   public static Map<cxa.a, cwv.c<aix<cwm>>> b() {
      return cxa.a.f.values().stream().collect(Collectors.toMap($$0 -> (cxa.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(aiy d, cxa.a.a e) {
      public static final cxa.a a = new cxa.a(
         new aiy("nether"),
         new cxa.a.a() {
            @Override
            public <T> cwv.c<T> apply(Function<aix<cwm>, T> $$0) {
               return new cwv.c<>(
                  List.of(
                     Pair.of(cwv.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cwt.ac)),
                     Pair.of(cwv.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cwt.af)),
                     Pair.of(cwv.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cwt.ae)),
                     Pair.of(cwv.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cwt.ad)),
                     Pair.of(cwv.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cwt.ag))
                  )
               );
            }
         }
      );
      public static final cxa.a b = new cxa.a(new aiy("overworld"), new cxa.a.a() {
         @Override
         public <T> cwv.c<T> apply(Function<aix<cwm>, T> $$0) {
            return cxa.a.a($$0);
         }
      });
      static final Map<aiy, cxa.a> f = Stream.of(a, b).collect(Collectors.toMap(cxa.a::b, $$0 -> (cxa.a)$$0));
      public static final Codec<cxa.a> c = aiy.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cwv.c<T> a(Function<aix<cwm>, T> $$0) {
         Builder<Pair<cwv.d, T>> $$1 = ImmutableList.builder();
         new cxc().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cwv.c<>($$1.build());
      }

      public Stream<aix<cwm>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<aix<cwm>>map(Pair::getSecond).distinct();
      }

      public aiy b() {
         return this.d;
      }

      public cxa.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cwv.c<T> apply(Function<aix<cwm>, T> var1);
      }
   }
}
