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

public class ddn {
   public static final Codec<ddn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddn.a.d.fieldOf("preset").forGetter($$0x -> $$0x.c), akr.c(li.az)).apply($$0, ddn::new)
   );
   public static final Codec<ja<ddn>> b = akp.a(li.aR, a);
   private final ddn.a c;
   private final ddi.c<ja<dcz>> d;

   public ddn(ddn.a $$0, jb<dcz> $$1) {
      this.c = $$0;
      this.d = $$0.f.apply($$1::b);
   }

   public ddi.c<ja<dcz>> a() {
      return this.d;
   }

   public static Map<ddn.a, ddi.c<aks<dcz>>> b() {
      return ddn.a.g.values().stream().collect(Collectors.toMap($$0 -> (ddn.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(akt e, ddn.a.a f) {
      public static final ddn.a a = new ddn.a(
         new akt("nether"),
         new ddn.a.a() {
            @Override
            public <T> ddi.c<T> apply(Function<aks<dcz>, T> $$0) {
               return new ddi.c<>(
                  List.of(
                     Pair.of(ddi.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddg.ah)),
                     Pair.of(ddi.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddg.ak)),
                     Pair.of(ddi.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddg.aj)),
                     Pair.of(ddi.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(ddg.ai)),
                     Pair.of(ddi.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(ddg.al))
                  )
               );
            }
         }
      );
      public static final ddn.a b = new ddn.a(
         new akt("potato"),
         new ddn.a.a() {
            @Override
            public <T> ddi.c<T> apply(Function<aks<dcz>, T> $$0) {
               return new ddi.c<>(
                  List.of(
                     Pair.of(ddi.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddg.d)),
                     Pair.of(ddi.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddg.f)),
                     Pair.of(ddi.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ddg.e)),
                     Pair.of(ddi.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(ddg.g)),
                     Pair.of(ddi.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(ddg.h))
                  )
               );
            }
         }
      );
      public static final ddn.a c = new ddn.a(new akt("overworld"), new ddn.a.a() {
         @Override
         public <T> ddi.c<T> apply(Function<aks<dcz>, T> $$0) {
            return ddn.a.a($$0);
         }
      });
      static final Map<akt, ddn.a> g = Stream.of(a, c, b).collect(Collectors.toMap(ddn.a::b, $$0 -> (ddn.a)$$0));
      public static final Codec<ddn.a> d = akt.a
         .flatXmap(
            $$0 -> Optional.ofNullable(g.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.e)
         );

      static <T> ddi.c<T> a(Function<aks<dcz>, T> $$0) {
         Builder<Pair<ddi.d, T>> $$1 = ImmutableList.builder();
         new ddp().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new ddi.c<>($$1.build());
      }

      public Stream<aks<dcz>> a() {
         return this.f.apply($$0 -> $$0).a().stream().<aks<dcz>>map(Pair::getSecond).distinct();
      }

      public akt b() {
         return this.e;
      }

      public ddn.a.a c() {
         return this.f;
      }

      @FunctionalInterface
      interface a {
         <T> ddi.c<T> apply(Function<aks<dcz>, T> var1);
      }
   }
}
