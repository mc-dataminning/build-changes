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

public class dgq {
   public static final Codec<dgq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dgq.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), alg.c(lz.aG)).apply($$0, dgq::new)
   );
   public static final Codec<jq<dgq>> b = ale.a(lz.ba, a);
   private final dgq.a c;
   private final dgl.c<jq<dgc>> d;

   public dgq(dgq.a $$0, jr<dgc> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dgl.c<jq<dgc>> a() {
      return this.d;
   }

   public static Map<dgq.a, dgl.c<alh<dgc>>> b() {
      return dgq.a.f.values().stream().collect(Collectors.toMap($$0 -> (dgq.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(ali d, dgq.a.a e) {
      public static final dgq.a a = new dgq.a(
         ali.b("nether"),
         new dgq.a.a() {
            @Override
            public <T> dgl.c<T> apply(Function<alh<dgc>, T> $$0) {
               return new dgl.c<>(
                  List.of(
                     Pair.of(dgl.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dgj.ac)),
                     Pair.of(dgl.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dgj.af)),
                     Pair.of(dgl.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dgj.ae)),
                     Pair.of(dgl.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dgj.ad)),
                     Pair.of(dgl.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dgj.ag))
                  )
               );
            }
         }
      );
      public static final dgq.a b = new dgq.a(ali.b("overworld"), new dgq.a.a() {
         @Override
         public <T> dgl.c<T> apply(Function<alh<dgc>, T> $$0) {
            return dgq.a.a($$0);
         }
      });
      static final Map<ali, dgq.a> f = Stream.of(a, b).collect(Collectors.toMap(dgq.a::b, $$0 -> (dgq.a)$$0));
      public static final Codec<dgq.a> c = ali.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dgl.c<T> a(Function<alh<dgc>, T> $$0) {
         Builder<Pair<dgl.d, T>> $$1 = ImmutableList.builder();
         new dgs().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dgl.c<>($$1.build());
      }

      public Stream<alh<dgc>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<alh<dgc>>map(Pair::getSecond).distinct();
      }

      public ali b() {
         return this.d;
      }

      public dgq.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dgl.c<T> apply(Function<alh<dgc>, T> var1);
      }
   }
}
