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

public class dix {
   public static final Codec<dix> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dix.a.d.fieldOf("preset").forGetter($$0x -> $$0x.c), alx.c(mb.aI)).apply($$0, dix::new)
   );
   public static final Codec<jq<dix>> b = alv.a(mb.bc, a);
   private final dix.a c;
   private final dis.c<jq<dij>> d;

   public dix(dix.a $$0, jr<dij> $$1) {
      this.c = $$0;
      this.d = $$0.f.apply($$1::b);
   }

   public dis.c<jq<dij>> a() {
      return this.d;
   }

   public static Map<dix.a, dis.c<aly<dij>>> b() {
      return dix.a.g.values().stream().collect(Collectors.toMap($$0 -> (dix.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alz e, dix.a.a f) {
      public static final dix.a a = new dix.a(
         alz.b("nether"),
         new dix.a.a() {
            @Override
            public <T> dis.c<T> apply(Function<aly<dij>, T> $$0) {
               return new dis.c<>(
                  List.of(
                     Pair.of(dis.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(diq.ac)),
                     Pair.of(dis.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(diq.af)),
                     Pair.of(dis.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(diq.ae)),
                     Pair.of(dis.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(diq.ad)),
                     Pair.of(dis.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(diq.ag))
                  )
               );
            }
         }
      );
      public static final dix.a b = new dix.a(alz.b("overworld"), new dix.a.a() {
         @Override
         public <T> dis.c<T> apply(Function<aly<dij>, T> $$0) {
            return dix.a.a($$0, diz.a.a);
         }
      });
      public static final dix.a c = new dix.a(alz.b("overworld_winter_drop"), new dix.a.a() {
         @Override
         public <T> dis.c<T> apply(Function<aly<dij>, T> $$0) {
            return dix.a.a($$0, diz.a.b);
         }
      });
      static final Map<alz, dix.a> g = Stream.of(a, b, c).collect(Collectors.toMap(dix.a::b, $$0 -> (dix.a)$$0));
      public static final Codec<dix.a> d = alz.a
         .flatXmap(
            $$0 -> Optional.ofNullable(g.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.e)
         );

      static <T> dis.c<T> a(Function<aly<dij>, T> $$0, diz.a $$1) {
         Builder<Pair<dis.d, T>> $$2 = ImmutableList.builder();
         new diz($$1).a($$2x -> $$2.add($$2x.mapSecond($$0)));
         return new dis.c<>($$2.build());
      }

      public Stream<aly<dij>> a() {
         return this.f.apply($$0 -> $$0).a().stream().<aly<dij>>map(Pair::getSecond).distinct();
      }

      public alz b() {
         return this.e;
      }

      public dix.a.a c() {
         return this.f;
      }

      @FunctionalInterface
      interface a {
         <T> dis.c<T> apply(Function<aly<dij>, T> var1);
      }
   }
}
