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

public class dek {
   public static final Codec<dek> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dek.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), akp.c(lu.aF)).apply($$0, dek::new)
   );
   public static final Codec<jm<dek>> b = akn.a(lu.aZ, a);
   private final dek.a c;
   private final def.c<jm<ddw>> d;

   public dek(dek.a $$0, jn<ddw> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public def.c<jm<ddw>> a() {
      return this.d;
   }

   public static Map<dek.a, def.c<akq<ddw>>> b() {
      return dek.a.f.values().stream().collect(Collectors.toMap($$0 -> (dek.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(akr d, dek.a.a e) {
      public static final dek.a a = new dek.a(
         akr.b("nether"),
         new dek.a.a() {
            @Override
            public <T> def.c<T> apply(Function<akq<ddw>, T> $$0) {
               return new def.c<>(
                  List.of(
                     Pair.of(def.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ded.ac)),
                     Pair.of(def.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ded.af)),
                     Pair.of(def.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ded.ae)),
                     Pair.of(def.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(ded.ad)),
                     Pair.of(def.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(ded.ag))
                  )
               );
            }
         }
      );
      public static final dek.a b = new dek.a(akr.b("overworld"), new dek.a.a() {
         @Override
         public <T> def.c<T> apply(Function<akq<ddw>, T> $$0) {
            return dek.a.a($$0);
         }
      });
      static final Map<akr, dek.a> f = Stream.of(a, b).collect(Collectors.toMap(dek.a::b, $$0 -> (dek.a)$$0));
      public static final Codec<dek.a> c = akr.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> def.c<T> a(Function<akq<ddw>, T> $$0) {
         Builder<Pair<def.d, T>> $$1 = ImmutableList.builder();
         new dem().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new def.c<>($$1.build());
      }

      public Stream<akq<ddw>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<akq<ddw>>map(Pair::getSecond).distinct();
      }

      public akr b() {
         return this.d;
      }

      public dek.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> def.c<T> apply(Function<akq<ddw>, T> var1);
      }
   }
}
