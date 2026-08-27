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

public class dck {
   public static final Codec<dck> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dck.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), akk.c(lf.az)).apply($$0, dck::new)
   );
   public static final Codec<ix<dck>> b = aki.a(lf.aR, a);
   private final dck.a c;
   private final dcf.c<ix<dbw>> d;

   public dck(dck.a $$0, iy<dbw> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dcf.c<ix<dbw>> a() {
      return this.d;
   }

   public static Map<dck.a, dcf.c<akl<dbw>>> b() {
      return dck.a.f.values().stream().collect(Collectors.toMap($$0 -> (dck.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(akm d, dck.a.a e) {
      public static final dck.a a = new dck.a(
         new akm("nether"),
         new dck.a.a() {
            @Override
            public <T> dcf.c<T> apply(Function<akl<dbw>, T> $$0) {
               return new dcf.c<>(
                  List.of(
                     Pair.of(dcf.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dcd.ac)),
                     Pair.of(dcf.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dcd.af)),
                     Pair.of(dcf.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dcd.ae)),
                     Pair.of(dcf.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dcd.ad)),
                     Pair.of(dcf.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dcd.ag))
                  )
               );
            }
         }
      );
      public static final dck.a b = new dck.a(new akm("overworld"), new dck.a.a() {
         @Override
         public <T> dcf.c<T> apply(Function<akl<dbw>, T> $$0) {
            return dck.a.a($$0);
         }
      });
      static final Map<akm, dck.a> f = Stream.of(a, b).collect(Collectors.toMap(dck.a::b, $$0 -> (dck.a)$$0));
      public static final Codec<dck.a> c = akm.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dcf.c<T> a(Function<akl<dbw>, T> $$0) {
         Builder<Pair<dcf.d, T>> $$1 = ImmutableList.builder();
         new dcm().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dcf.c<>($$1.build());
      }

      public Stream<akl<dbw>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<akl<dbw>>map(Pair::getSecond).distinct();
      }

      public akm b() {
         return this.d;
      }

      public dck.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dcf.c<T> apply(Function<akl<dbw>, T> var1);
      }
   }
}
