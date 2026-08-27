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

public class crj {
   public static final Codec<crj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(crj.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aew.c(je.ap)).apply($$0, crj::new)
   );
   public static final Codec<hg<crj>> b = aeu.a(je.aG, a);
   private final crj.a c;
   private final cre.c<hg<cqv>> d;

   public crj(crj.a $$0, hh<cqv> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cre.c<hg<cqv>> a() {
      return this.d;
   }

   public static Map<crj.a, cre.c<aex<cqv>>> b() {
      return crj.a.f.values().stream().collect(Collectors.toMap($$0 -> (crj.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(aey d, crj.a.a e) {
      public static final crj.a a = new crj.a(
         new aey("nether"),
         new crj.a.a() {
            @Override
            public <T> cre.c<T> apply(Function<aex<cqv>, T> $$0) {
               return new cre.c<>(
                  List.of(
                     Pair.of(cre.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(crc.ac)),
                     Pair.of(cre.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(crc.af)),
                     Pair.of(cre.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(crc.ae)),
                     Pair.of(cre.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(crc.ad)),
                     Pair.of(cre.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(crc.ag))
                  )
               );
            }
         }
      );
      public static final crj.a b = new crj.a(new aey("overworld"), new crj.a.a() {
         @Override
         public <T> cre.c<T> apply(Function<aex<cqv>, T> $$0) {
            return crj.a.a($$0);
         }
      });
      static final Map<aey, crj.a> f = Stream.of(a, b).collect(Collectors.toMap(crj.a::b, $$0 -> (crj.a)$$0));
      public static final Codec<crj.a> c = aey.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cre.c<T> a(Function<aex<cqv>, T> $$0) {
         Builder<Pair<cre.d, T>> $$1 = ImmutableList.builder();
         new crl().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cre.c<>($$1.build());
      }

      public Stream<aex<cqv>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<aex<cqv>>map(Pair::getSecond).distinct();
      }

      public aey b() {
         return this.d;
      }

      public crj.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cre.c<T> apply(Function<aex<cqv>, T> var1);
      }
   }
}
