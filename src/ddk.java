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

public class ddk {
   public static final Codec<ddk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddk.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), alc.c(lq.az)).apply($$0, ddk::new)
   );
   public static final Codec<ji<ddk>> b = ala.a(lq.aR, a);
   private final ddk.a c;
   private final ddf.c<ji<dcw>> d;

   public ddk(ddk.a $$0, jj<dcw> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public ddf.c<ji<dcw>> a() {
      return this.d;
   }

   public static Map<ddk.a, ddf.c<ald<dcw>>> b() {
      return ddk.a.f.values().stream().collect(Collectors.toMap($$0 -> (ddk.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(ale d, ddk.a.a e) {
      public static final ddk.a a = new ddk.a(
         new ale("nether"),
         new ddk.a.a() {
            @Override
            public <T> ddf.c<T> apply(Function<ald<dcw>, T> $$0) {
               return new ddf.c<>(
                  List.of(
                     Pair.of(ddf.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddd.ac)),
                     Pair.of(ddf.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddd.af)),
                     Pair.of(ddf.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddd.ae)),
                     Pair.of(ddf.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(ddd.ad)),
                     Pair.of(ddf.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(ddd.ag))
                  )
               );
            }
         }
      );
      public static final ddk.a b = new ddk.a(new ale("overworld"), new ddk.a.a() {
         @Override
         public <T> ddf.c<T> apply(Function<ald<dcw>, T> $$0) {
            return ddk.a.a($$0);
         }
      });
      static final Map<ale, ddk.a> f = Stream.of(a, b).collect(Collectors.toMap(ddk.a::b, $$0 -> (ddk.a)$$0));
      public static final Codec<ddk.a> c = ale.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> ddf.c<T> a(Function<ald<dcw>, T> $$0) {
         Builder<Pair<ddf.d, T>> $$1 = ImmutableList.builder();
         new ddm().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new ddf.c<>($$1.build());
      }

      public Stream<ald<dcw>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ald<dcw>>map(Pair::getSecond).distinct();
      }

      public ale b() {
         return this.d;
      }

      public ddk.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> ddf.c<T> apply(Function<ald<dcw>, T> var1);
      }
   }
}
