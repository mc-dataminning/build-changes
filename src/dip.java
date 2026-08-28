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

public class dip {
   public static final Codec<dip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dip.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aln.c(mb.aI)).apply($$0, dip::new)
   );
   public static final Codec<jq<dip>> b = all.a(mb.bc, a);
   private final dip.a c;
   private final dik.c<jq<dib>> d;

   public dip(dip.a $$0, jr<dib> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dik.c<jq<dib>> a() {
      return this.d;
   }

   public static Map<dip.a, dik.c<alo<dib>>> b() {
      return dip.a.f.values().stream().collect(Collectors.toMap($$0 -> (dip.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alp d, dip.a.a e) {
      public static final dip.a a = new dip.a(
         alp.b("nether"),
         new dip.a.a() {
            @Override
            public <T> dik.c<T> apply(Function<alo<dib>, T> $$0) {
               return new dik.c<>(
                  List.of(
                     Pair.of(dik.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dii.ad)),
                     Pair.of(dik.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dii.ag)),
                     Pair.of(dik.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dii.af)),
                     Pair.of(dik.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dii.ae)),
                     Pair.of(dik.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dii.ah))
                  )
               );
            }
         }
      );
      public static final dip.a b = new dip.a(alp.b("overworld"), new dip.a.a() {
         @Override
         public <T> dik.c<T> apply(Function<alo<dib>, T> $$0) {
            return dip.a.a($$0);
         }
      });
      static final Map<alp, dip.a> f = Stream.of(a, b).collect(Collectors.toMap(dip.a::b, $$0 -> (dip.a)$$0));
      public static final Codec<dip.a> c = alp.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dik.c<T> a(Function<alo<dib>, T> $$0) {
         Builder<Pair<dik.d, T>> $$1 = ImmutableList.builder();
         new dir().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dik.c<>($$1.build());
      }

      public Stream<alo<dib>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<alo<dib>>map(Pair::getSecond).distinct();
      }

      public alp b() {
         return this.d;
      }

      public dip.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dik.c<T> apply(Function<alo<dib>, T> var1);
      }
   }
}
