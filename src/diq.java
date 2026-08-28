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

public class diq {
   public static final Codec<diq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(diq.a.d.fieldOf("preset").forGetter($$0x -> $$0x.c), alx.c(mb.aH)).apply($$0, diq::new)
   );
   public static final Codec<jq<diq>> b = alv.a(mb.bb, a);
   private final diq.a c;
   private final dil.c<jq<dic>> d;

   public diq(diq.a $$0, jr<dic> $$1) {
      this.c = $$0;
      this.d = $$0.f.apply($$1::b);
   }

   public dil.c<jq<dic>> a() {
      return this.d;
   }

   public static Map<diq.a, dil.c<aly<dic>>> b() {
      return diq.a.g.values().stream().collect(Collectors.toMap($$0 -> (diq.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alz e, diq.a.a f) {
      public static final diq.a a = new diq.a(
         alz.b("nether"),
         new diq.a.a() {
            @Override
            public <T> dil.c<T> apply(Function<aly<dic>, T> $$0) {
               return new dil.c<>(
                  List.of(
                     Pair.of(dil.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dij.ac)),
                     Pair.of(dil.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dij.af)),
                     Pair.of(dil.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dij.ae)),
                     Pair.of(dil.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dij.ad)),
                     Pair.of(dil.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dij.ag))
                  )
               );
            }
         }
      );
      public static final diq.a b = new diq.a(alz.b("overworld"), new diq.a.a() {
         @Override
         public <T> dil.c<T> apply(Function<aly<dic>, T> $$0) {
            return diq.a.a($$0, dis.a.a);
         }
      });
      public static final diq.a c = new diq.a(alz.b("overworld_winter_drop"), new diq.a.a() {
         @Override
         public <T> dil.c<T> apply(Function<aly<dic>, T> $$0) {
            return diq.a.a($$0, dis.a.b);
         }
      });
      static final Map<alz, diq.a> g = Stream.of(a, b, c).collect(Collectors.toMap(diq.a::b, $$0 -> (diq.a)$$0));
      public static final Codec<diq.a> d = alz.a
         .flatXmap(
            $$0 -> Optional.ofNullable(g.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.e)
         );

      static <T> dil.c<T> a(Function<aly<dic>, T> $$0, dis.a $$1) {
         Builder<Pair<dil.d, T>> $$2 = ImmutableList.builder();
         new dis($$1).a($$2x -> $$2.add($$2x.mapSecond($$0)));
         return new dil.c<>($$2.build());
      }

      public Stream<aly<dic>> a() {
         return this.f.apply($$0 -> $$0).a().stream().<aly<dic>>map(Pair::getSecond).distinct();
      }

      public alz b() {
         return this.e;
      }

      public diq.a.a c() {
         return this.f;
      }

      @FunctionalInterface
      interface a {
         <T> dil.c<T> apply(Function<aly<dic>, T> var1);
      }
   }
}
