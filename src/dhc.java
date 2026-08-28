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

public class dhc {
   public static final Codec<dhc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhc.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), alh.c(ma.aG)).apply($$0, dhc::new)
   );
   public static final Codec<jq<dhc>> b = alf.a(ma.ba, a);
   private final dhc.a c;
   private final dgx.c<jq<dgo>> d;

   public dhc(dhc.a $$0, jr<dgo> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dgx.c<jq<dgo>> a() {
      return this.d;
   }

   public static Map<dhc.a, dgx.c<ali<dgo>>> b() {
      return dhc.a.f.values().stream().collect(Collectors.toMap($$0 -> (dhc.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alj d, dhc.a.a e) {
      public static final dhc.a a = new dhc.a(
         alj.b("nether"),
         new dhc.a.a() {
            @Override
            public <T> dgx.c<T> apply(Function<ali<dgo>, T> $$0) {
               return new dgx.c<>(
                  List.of(
                     Pair.of(dgx.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dgv.ac)),
                     Pair.of(dgx.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dgv.af)),
                     Pair.of(dgx.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dgv.ae)),
                     Pair.of(dgx.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dgv.ad)),
                     Pair.of(dgx.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dgv.ag))
                  )
               );
            }
         }
      );
      public static final dhc.a b = new dhc.a(alj.b("overworld"), new dhc.a.a() {
         @Override
         public <T> dgx.c<T> apply(Function<ali<dgo>, T> $$0) {
            return dhc.a.a($$0);
         }
      });
      static final Map<alj, dhc.a> f = Stream.of(a, b).collect(Collectors.toMap(dhc.a::b, $$0 -> (dhc.a)$$0));
      public static final Codec<dhc.a> c = alj.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dgx.c<T> a(Function<ali<dgo>, T> $$0) {
         Builder<Pair<dgx.d, T>> $$1 = ImmutableList.builder();
         new dhe().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dgx.c<>($$1.build());
      }

      public Stream<ali<dgo>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ali<dgo>>map(Pair::getSecond).distinct();
      }

      public alj b() {
         return this.d;
      }

      public dhc.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dgx.c<T> apply(Function<ali<dgo>, T> var1);
      }
   }
}
