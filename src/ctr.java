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

public class ctr {
   public static final Codec<ctr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctr.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), agk.c(kd.ar)).apply($$0, ctr::new)
   );
   public static final Codec<ig<ctr>> b = agi.a(kd.aI, a);
   private final ctr.a c;
   private final ctm.c<ig<ctd>> d;

   public ctr(ctr.a $$0, ih<ctd> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public ctm.c<ig<ctd>> a() {
      return this.d;
   }

   public static Map<ctr.a, ctm.c<agl<ctd>>> b() {
      return ctr.a.f.values().stream().collect(Collectors.toMap($$0 -> (ctr.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(agm d, ctr.a.a e) {
      public static final ctr.a a = new ctr.a(
         new agm("nether"),
         new ctr.a.a() {
            @Override
            public <T> ctm.c<T> apply(Function<agl<ctd>, T> $$0) {
               return new ctm.c<>(
                  List.of(
                     Pair.of(ctm.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ctk.ac)),
                     Pair.of(ctm.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ctk.af)),
                     Pair.of(ctm.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(ctk.ae)),
                     Pair.of(ctm.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(ctk.ad)),
                     Pair.of(ctm.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(ctk.ag))
                  )
               );
            }
         }
      );
      public static final ctr.a b = new ctr.a(new agm("overworld"), new ctr.a.a() {
         @Override
         public <T> ctm.c<T> apply(Function<agl<ctd>, T> $$0) {
            return ctr.a.a($$0);
         }
      });
      static final Map<agm, ctr.a> f = Stream.of(a, b).collect(Collectors.toMap(ctr.a::b, $$0 -> (ctr.a)$$0));
      public static final Codec<ctr.a> c = agm.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> ctm.c<T> a(Function<agl<ctd>, T> $$0) {
         Builder<Pair<ctm.d, T>> $$1 = ImmutableList.builder();
         new ctt().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new ctm.c<>($$1.build());
      }

      public Stream<agl<ctd>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<agl<ctd>>map(Pair::getSecond).distinct();
      }

      public agm b() {
         return this.d;
      }

      public ctr.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> ctm.c<T> apply(Function<agl<ctd>, T> var1);
      }
   }
}
