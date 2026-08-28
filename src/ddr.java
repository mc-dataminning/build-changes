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

public class ddr {
   public static final Codec<ddr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddr.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aki.c(lr.aE)).apply($$0, ddr::new)
   );
   public static final Codec<jj<ddr>> b = akg.a(lr.aY, a);
   private final ddr.a c;
   private final ddm.c<jj<ddd>> d;

   public ddr(ddr.a $$0, jk<ddd> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public ddm.c<jj<ddd>> a() {
      return this.d;
   }

   public static Map<ddr.a, ddm.c<akj<ddd>>> b() {
      return ddr.a.f.values().stream().collect(Collectors.toMap($$0 -> (ddr.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(akk d, ddr.a.a e) {
      public static final ddr.a a = new ddr.a(
         new akk("nether"),
         new ddr.a.a() {
            @Override
            public <T> ddm.c<T> apply(Function<akj<ddd>, T> $$0) {
               return new ddm.c<>(
                  List.of(
                     Pair.of(ddm.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddk.ac)),
                     Pair.of(ddm.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddk.af)),
                     Pair.of(ddm.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddk.ae)),
                     Pair.of(ddm.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(ddk.ad)),
                     Pair.of(ddm.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(ddk.ag))
                  )
               );
            }
         }
      );
      public static final ddr.a b = new ddr.a(new akk("overworld"), new ddr.a.a() {
         @Override
         public <T> ddm.c<T> apply(Function<akj<ddd>, T> $$0) {
            return ddr.a.a($$0);
         }
      });
      static final Map<akk, ddr.a> f = Stream.of(a, b).collect(Collectors.toMap(ddr.a::b, $$0 -> (ddr.a)$$0));
      public static final Codec<ddr.a> c = akk.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> ddm.c<T> a(Function<akj<ddd>, T> $$0) {
         Builder<Pair<ddm.d, T>> $$1 = ImmutableList.builder();
         new ddt().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new ddm.c<>($$1.build());
      }

      public Stream<akj<ddd>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<akj<ddd>>map(Pair::getSecond).distinct();
      }

      public akk b() {
         return this.d;
      }

      public ddr.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> ddm.c<T> apply(Function<akj<ddd>, T> var1);
      }
   }
}
