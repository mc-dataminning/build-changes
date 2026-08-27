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

public class cul {
   public static final Codec<cul> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cul.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), agr.c(kc.as)).apply($$0, cul::new)
   );
   public static final Codec<ie<cul>> b = agp.a(kc.aK, a);
   private final cul.a c;
   private final cug.c<ie<ctx>> d;

   public cul(cul.a $$0, ig<ctx> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cug.c<ie<ctx>> a() {
      return this.d;
   }

   public static Map<cul.a, cug.c<ags<ctx>>> b() {
      return cul.a.f.values().stream().collect(Collectors.toMap($$0 -> (cul.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(agt d, cul.a.a e) {
      public static final cul.a a = new cul.a(
         new agt("nether"),
         new cul.a.a() {
            @Override
            public <T> cug.c<T> apply(Function<ags<ctx>, T> $$0) {
               return new cug.c<>(
                  List.of(
                     Pair.of(cug.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cue.ac)),
                     Pair.of(cug.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cue.af)),
                     Pair.of(cug.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cue.ae)),
                     Pair.of(cug.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cue.ad)),
                     Pair.of(cug.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cue.ag))
                  )
               );
            }
         }
      );
      public static final cul.a b = new cul.a(new agt("overworld"), new cul.a.a() {
         @Override
         public <T> cug.c<T> apply(Function<ags<ctx>, T> $$0) {
            return cul.a.a($$0);
         }
      });
      static final Map<agt, cul.a> f = Stream.of(a, b).collect(Collectors.toMap(cul.a::b, $$0 -> (cul.a)$$0));
      public static final Codec<cul.a> c = agt.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cug.c<T> a(Function<ags<ctx>, T> $$0) {
         Builder<Pair<cug.d, T>> $$1 = ImmutableList.builder();
         new cun().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cug.c<>($$1.build());
      }

      public Stream<ags<ctx>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ags<ctx>>map(Pair::getSecond).distinct();
      }

      public agt b() {
         return this.d;
      }

      public cul.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cug.c<T> apply(Function<ags<ctx>, T> var1);
      }
   }
}
