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

public class dbq {
   public static final Codec<dbq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dbq.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), akf.c(le.az)).apply($$0, dbq::new)
   );
   public static final Codec<iw<dbq>> b = akd.a(le.aR, a);
   private final dbq.a c;
   private final dbl.c<iw<dbc>> d;

   public dbq(dbq.a $$0, ix<dbc> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dbl.c<iw<dbc>> a() {
      return this.d;
   }

   public static Map<dbq.a, dbl.c<akg<dbc>>> b() {
      return dbq.a.f.values().stream().collect(Collectors.toMap($$0 -> (dbq.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(akh d, dbq.a.a e) {
      public static final dbq.a a = new dbq.a(
         new akh("nether"),
         new dbq.a.a() {
            @Override
            public <T> dbl.c<T> apply(Function<akg<dbc>, T> $$0) {
               return new dbl.c<>(
                  List.of(
                     Pair.of(dbl.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dbj.ac)),
                     Pair.of(dbl.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dbj.af)),
                     Pair.of(dbl.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dbj.ae)),
                     Pair.of(dbl.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dbj.ad)),
                     Pair.of(dbl.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dbj.ag))
                  )
               );
            }
         }
      );
      public static final dbq.a b = new dbq.a(new akh("overworld"), new dbq.a.a() {
         @Override
         public <T> dbl.c<T> apply(Function<akg<dbc>, T> $$0) {
            return dbq.a.a($$0);
         }
      });
      static final Map<akh, dbq.a> f = Stream.of(a, b).collect(Collectors.toMap(dbq.a::b, $$0 -> (dbq.a)$$0));
      public static final Codec<dbq.a> c = akh.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dbl.c<T> a(Function<akg<dbc>, T> $$0) {
         Builder<Pair<dbl.d, T>> $$1 = ImmutableList.builder();
         new dbs().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dbl.c<>($$1.build());
      }

      public Stream<akg<dbc>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<akg<dbc>>map(Pair::getSecond).distinct();
      }

      public akh b() {
         return this.d;
      }

      public dbq.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dbl.c<T> apply(Function<akg<dbc>, T> var1);
      }
   }
}
