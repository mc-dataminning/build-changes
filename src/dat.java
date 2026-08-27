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

public class dat {
   public static final Codec<dat> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dat.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), ajt.c(ku.aw)).apply($$0, dat::new)
   );
   public static final Codec<in<dat>> b = ajr.a(ku.aO, a);
   private final dat.a c;
   private final dao.c<in<daf>> d;

   public dat(dat.a $$0, io<daf> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dao.c<in<daf>> a() {
      return this.d;
   }

   public static Map<dat.a, dao.c<aju<daf>>> b() {
      return dat.a.f.values().stream().collect(Collectors.toMap($$0 -> (dat.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(ajv d, dat.a.a e) {
      public static final dat.a a = new dat.a(
         new ajv("nether"),
         new dat.a.a() {
            @Override
            public <T> dao.c<T> apply(Function<aju<daf>, T> $$0) {
               return new dao.c<>(
                  List.of(
                     Pair.of(dao.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dam.ac)),
                     Pair.of(dao.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dam.af)),
                     Pair.of(dao.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dam.ae)),
                     Pair.of(dao.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dam.ad)),
                     Pair.of(dao.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dam.ag))
                  )
               );
            }
         }
      );
      public static final dat.a b = new dat.a(new ajv("overworld"), new dat.a.a() {
         @Override
         public <T> dao.c<T> apply(Function<aju<daf>, T> $$0) {
            return dat.a.a($$0);
         }
      });
      static final Map<ajv, dat.a> f = Stream.of(a, b).collect(Collectors.toMap(dat.a::b, $$0 -> (dat.a)$$0));
      public static final Codec<dat.a> c = ajv.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dao.c<T> a(Function<aju<daf>, T> $$0) {
         Builder<Pair<dao.d, T>> $$1 = ImmutableList.builder();
         new dav().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dao.c<>($$1.build());
      }

      public Stream<aju<daf>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<aju<daf>>map(Pair::getSecond).distinct();
      }

      public ajv b() {
         return this.d;
      }

      public dat.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dao.c<T> apply(Function<aju<daf>, T> var1);
      }
   }
}
