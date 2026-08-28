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

public class dgv {
   public static final Codec<dgv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dgv.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), alj.c(ma.aG)).apply($$0, dgv::new)
   );
   public static final Codec<jq<dgv>> b = alh.a(ma.ba, a);
   private final dgv.a c;
   private final dgq.c<jq<dgh>> d;

   public dgv(dgv.a $$0, jr<dgh> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dgq.c<jq<dgh>> a() {
      return this.d;
   }

   public static Map<dgv.a, dgq.c<alk<dgh>>> b() {
      return dgv.a.f.values().stream().collect(Collectors.toMap($$0 -> (dgv.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(all d, dgv.a.a e) {
      public static final dgv.a a = new dgv.a(
         all.b("nether"),
         new dgv.a.a() {
            @Override
            public <T> dgq.c<T> apply(Function<alk<dgh>, T> $$0) {
               return new dgq.c<>(
                  List.of(
                     Pair.of(dgq.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dgo.ac)),
                     Pair.of(dgq.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dgo.af)),
                     Pair.of(dgq.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dgo.ae)),
                     Pair.of(dgq.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dgo.ad)),
                     Pair.of(dgq.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dgo.ag))
                  )
               );
            }
         }
      );
      public static final dgv.a b = new dgv.a(all.b("overworld"), new dgv.a.a() {
         @Override
         public <T> dgq.c<T> apply(Function<alk<dgh>, T> $$0) {
            return dgv.a.a($$0);
         }
      });
      static final Map<all, dgv.a> f = Stream.of(a, b).collect(Collectors.toMap(dgv.a::b, $$0 -> (dgv.a)$$0));
      public static final Codec<dgv.a> c = all.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dgq.c<T> a(Function<alk<dgh>, T> $$0) {
         Builder<Pair<dgq.d, T>> $$1 = ImmutableList.builder();
         new dgx().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dgq.c<>($$1.build());
      }

      public Stream<alk<dgh>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<alk<dgh>>map(Pair::getSecond).distinct();
      }

      public all b() {
         return this.d;
      }

      public dgv.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dgq.c<T> apply(Function<alk<dgh>, T> var1);
      }
   }
}
