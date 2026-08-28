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

public class ddt {
   public static final Codec<ddt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddt.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aki.c(lr.aE)).apply($$0, ddt::new)
   );
   public static final Codec<jj<ddt>> b = akg.a(lr.aY, a);
   private final ddt.a c;
   private final ddo.c<jj<ddf>> d;

   public ddt(ddt.a $$0, jk<ddf> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public ddo.c<jj<ddf>> a() {
      return this.d;
   }

   public static Map<ddt.a, ddo.c<akj<ddf>>> b() {
      return ddt.a.f.values().stream().collect(Collectors.toMap($$0 -> (ddt.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(akk d, ddt.a.a e) {
      public static final ddt.a a = new ddt.a(
         new akk("nether"),
         new ddt.a.a() {
            @Override
            public <T> ddo.c<T> apply(Function<akj<ddf>, T> $$0) {
               return new ddo.c<>(
                  List.of(
                     Pair.of(ddo.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddm.ac)),
                     Pair.of(ddo.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddm.af)),
                     Pair.of(ddo.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddm.ae)),
                     Pair.of(ddo.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(ddm.ad)),
                     Pair.of(ddo.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(ddm.ag))
                  )
               );
            }
         }
      );
      public static final ddt.a b = new ddt.a(new akk("overworld"), new ddt.a.a() {
         @Override
         public <T> ddo.c<T> apply(Function<akj<ddf>, T> $$0) {
            return ddt.a.a($$0);
         }
      });
      static final Map<akk, ddt.a> f = Stream.of(a, b).collect(Collectors.toMap(ddt.a::b, $$0 -> (ddt.a)$$0));
      public static final Codec<ddt.a> c = akk.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> ddo.c<T> a(Function<akj<ddf>, T> $$0) {
         Builder<Pair<ddo.d, T>> $$1 = ImmutableList.builder();
         new ddv().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new ddo.c<>($$1.build());
      }

      public Stream<akj<ddf>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<akj<ddf>>map(Pair::getSecond).distinct();
      }

      public akk b() {
         return this.d;
      }

      public ddt.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> ddo.c<T> apply(Function<akj<ddf>, T> var1);
      }
   }
}
