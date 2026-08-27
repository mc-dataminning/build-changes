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

public class ctm {
   public static final Codec<ctm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctm.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), agg.c(jz.ar)).apply($$0, ctm::new)
   );
   public static final Codec<ib<ctm>> b = age.a(jz.aI, a);
   private final ctm.a c;
   private final cth.c<ib<csy>> d;

   public ctm(ctm.a $$0, ic<csy> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cth.c<ib<csy>> a() {
      return this.d;
   }

   public static Map<ctm.a, cth.c<agh<csy>>> b() {
      return ctm.a.f.values().stream().collect(Collectors.toMap($$0 -> (ctm.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(agi d, ctm.a.a e) {
      public static final ctm.a a = new ctm.a(
         new agi("nether"),
         new ctm.a.a() {
            @Override
            public <T> cth.c<T> apply(Function<agh<csy>, T> $$0) {
               return new cth.c<>(
                  List.of(
                     Pair.of(cth.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ctf.ac)),
                     Pair.of(cth.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ctf.af)),
                     Pair.of(cth.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ctf.ae)),
                     Pair.of(cth.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(ctf.ad)),
                     Pair.of(cth.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(ctf.ag))
                  )
               );
            }
         }
      );
      public static final ctm.a b = new ctm.a(new agi("overworld"), new ctm.a.a() {
         @Override
         public <T> cth.c<T> apply(Function<agh<csy>, T> $$0) {
            return ctm.a.a($$0);
         }
      });
      static final Map<agi, ctm.a> f = Stream.of(a, b).collect(Collectors.toMap(ctm.a::b, $$0 -> (ctm.a)$$0));
      public static final Codec<ctm.a> c = agi.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cth.c<T> a(Function<agh<csy>, T> $$0) {
         Builder<Pair<cth.d, T>> $$1 = ImmutableList.builder();
         new cto().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cth.c<>($$1.build());
      }

      public Stream<agh<csy>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<agh<csy>>map(Pair::getSecond).distinct();
      }

      public agi b() {
         return this.d;
      }

      public ctm.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cth.c<T> apply(Function<agh<csy>, T> var1);
      }
   }
}
