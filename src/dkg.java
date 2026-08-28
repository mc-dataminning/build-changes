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

public class dkg {
   public static final Codec<dkg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dkg.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), alc.c(mg.aG)).apply($$0, dkg::new)
   );
   public static final Codec<je<dkg>> b = ala.a(mg.aU, a);
   private final dkg.a c;
   private final dkb.c<je<djs>> d;

   public dkg(dkg.a $$0, jf<djs> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dkb.c<je<djs>> a() {
      return this.d;
   }

   public static Map<dkg.a, dkb.c<ald<djs>>> b() {
      return dkg.a.f.values().stream().collect(Collectors.toMap($$0 -> (dkg.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(ale d, dkg.a.a e) {
      public static final dkg.a a = new dkg.a(
         ale.b("nether"),
         new dkg.a.a() {
            @Override
            public <T> dkb.c<T> apply(Function<ald<djs>, T> $$0) {
               return new dkb.c<>(
                  List.of(
                     Pair.of(dkb.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(djz.ad)),
                     Pair.of(dkb.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(djz.ag)),
                     Pair.of(dkb.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(djz.af)),
                     Pair.of(dkb.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(djz.ae)),
                     Pair.of(dkb.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(djz.ah))
                  )
               );
            }
         }
      );
      public static final dkg.a b = new dkg.a(ale.b("overworld"), new dkg.a.a() {
         @Override
         public <T> dkb.c<T> apply(Function<ald<djs>, T> $$0) {
            return dkg.a.a($$0);
         }
      });
      static final Map<ale, dkg.a> f = Stream.of(a, b).collect(Collectors.toMap(dkg.a::b, $$0 -> (dkg.a)$$0));
      public static final Codec<dkg.a> c = ale.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dkb.c<T> a(Function<ald<djs>, T> $$0) {
         Builder<Pair<dkb.d, T>> $$1 = ImmutableList.builder();
         new dki().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dkb.c<>($$1.build());
      }

      public Stream<ald<djs>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ald<djs>>map(Pair::getSecond).distinct();
      }

      public ale b() {
         return this.d;
      }

      public dkg.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dkb.c<T> apply(Function<ald<djs>, T> var1);
      }
   }
}
