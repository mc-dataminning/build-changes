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

public class crc {
   public static final Codec<crc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(crc.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), aes.c(je.ap)).apply($$0, crc::new)
   );
   public static final Codec<hg<crc>> b = aeq.a(je.aG, a);
   private final crc.a c;
   private final cqx.c<hg<cqo>> d;

   public crc(crc.a $$0, hh<cqo> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public cqx.c<hg<cqo>> a() {
      return this.d;
   }

   public static Map<crc.a, cqx.c<aet<cqo>>> b() {
      return crc.a.f.values().stream().collect(Collectors.toMap($$0 -> (crc.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(aeu d, crc.a.a e) {
      public static final crc.a a = new crc.a(
         new aeu("nether"),
         new crc.a.a() {
            @Override
            public <T> cqx.c<T> apply(Function<aet<cqo>, T> $$0) {
               return new cqx.c<>(
                  List.of(
                     Pair.of(cqx.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cqv.ac)),
                     Pair.of(cqx.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cqv.af)),
                     Pair.of(cqx.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(cqv.ae)),
                     Pair.of(cqx.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(cqv.ad)),
                     Pair.of(cqx.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(cqv.ag))
                  )
               );
            }
         }
      );
      public static final crc.a b = new crc.a(new aeu("overworld"), new crc.a.a() {
         @Override
         public <T> cqx.c<T> apply(Function<aet<cqo>, T> $$0) {
            return crc.a.a($$0);
         }
      });
      static final Map<aeu, crc.a> f = Stream.of(a, b).collect(Collectors.toMap(crc.a::b, $$0 -> (crc.a)$$0));
      public static final Codec<crc.a> c = aeu.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> cqx.c<T> a(Function<aet<cqo>, T> $$0) {
         Builder<Pair<cqx.d, T>> $$1 = ImmutableList.builder();
         new cre().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new cqx.c<>($$1.build());
      }

      public Stream<aet<cqo>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<aet<cqo>>map(Pair::getSecond).distinct();
      }

      public aeu b() {
         return this.d;
      }

      public crc.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> cqx.c<T> apply(Function<aet<cqo>, T> var1);
      }
   }
}
