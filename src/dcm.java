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

public class dcm {
   public static final Codec<dcm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dcm.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), akl.c(lf.az)).apply($$0, dcm::new)
   );
   public static final Codec<ix<dcm>> b = akj.a(lf.aR, a);
   private final dcm.a c;
   private final dch.c<ix<dby>> d;

   public dcm(dcm.a $$0, iy<dby> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dch.c<ix<dby>> a() {
      return this.d;
   }

   public static Map<dcm.a, dch.c<akm<dby>>> b() {
      return dcm.a.f.values().stream().collect(Collectors.toMap($$0 -> (dcm.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(akn d, dcm.a.a e) {
      public static final dcm.a a = new dcm.a(
         new akn("nether"),
         new dcm.a.a() {
            @Override
            public <T> dch.c<T> apply(Function<akm<dby>, T> $$0) {
               return new dch.c<>(
                  List.of(
                     Pair.of(dch.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dcf.ac)),
                     Pair.of(dch.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dcf.af)),
                     Pair.of(dch.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dcf.ae)),
                     Pair.of(dch.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dcf.ad)),
                     Pair.of(dch.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dcf.ag))
                  )
               );
            }
         }
      );
      public static final dcm.a b = new dcm.a(new akn("overworld"), new dcm.a.a() {
         @Override
         public <T> dch.c<T> apply(Function<akm<dby>, T> $$0) {
            return dcm.a.a($$0);
         }
      });
      static final Map<akn, dcm.a> f = Stream.of(a, b).collect(Collectors.toMap(dcm.a::b, $$0 -> (dcm.a)$$0));
      public static final Codec<dcm.a> c = akn.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dch.c<T> a(Function<akm<dby>, T> $$0) {
         Builder<Pair<dch.d, T>> $$1 = ImmutableList.builder();
         new dco().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dch.c<>($$1.build());
      }

      public Stream<akm<dby>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<akm<dby>>map(Pair::getSecond).distinct();
      }

      public akn b() {
         return this.d;
      }

      public dcm.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dch.c<T> apply(Function<akm<dby>, T> var1);
      }
   }
}
