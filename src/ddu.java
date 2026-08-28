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

public class ddu {
   public static final Codec<ddu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddu.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aki.c(lr.aE)).apply($$0, ddu::new)
   );
   public static final Codec<jj<ddu>> b = akg.a(lr.aY, a);
   private final ddu.a c;
   private final ddp.c<jj<ddg>> d;

   public ddu(ddu.a $$0, jk<ddg> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public ddp.c<jj<ddg>> a() {
      return this.d;
   }

   public static Map<ddu.a, ddp.c<akj<ddg>>> b() {
      return ddu.a.f.values().stream().collect(Collectors.toMap($$0 -> (ddu.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(akk d, ddu.a.a e) {
      public static final ddu.a a = new ddu.a(
         new akk("nether"),
         new ddu.a.a() {
            @Override
            public <T> ddp.c<T> apply(Function<akj<ddg>, T> $$0) {
               return new ddp.c<>(
                  List.of(
                     Pair.of(ddp.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddn.ac)),
                     Pair.of(ddp.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddn.af)),
                     Pair.of(ddp.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddn.ae)),
                     Pair.of(ddp.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(ddn.ad)),
                     Pair.of(ddp.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(ddn.ag))
                  )
               );
            }
         }
      );
      public static final ddu.a b = new ddu.a(new akk("overworld"), new ddu.a.a() {
         @Override
         public <T> ddp.c<T> apply(Function<akj<ddg>, T> $$0) {
            return ddu.a.a($$0);
         }
      });
      static final Map<akk, ddu.a> f = Stream.of(a, b).collect(Collectors.toMap(ddu.a::b, $$0 -> (ddu.a)$$0));
      public static final Codec<ddu.a> c = akk.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> ddp.c<T> a(Function<akj<ddg>, T> $$0) {
         Builder<Pair<ddp.d, T>> $$1 = ImmutableList.builder();
         new ddw().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new ddp.c<>($$1.build());
      }

      public Stream<akj<ddg>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<akj<ddg>>map(Pair::getSecond).distinct();
      }

      public akk b() {
         return this.d;
      }

      public ddu.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> ddp.c<T> apply(Function<akj<ddg>, T> var1);
      }
   }
}
