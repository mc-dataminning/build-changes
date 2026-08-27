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

public class dbh {
   public static final Codec<dbh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dbh.a.c.fieldOf("preset").forGetter($$0x -> $$0x.c), akd.c(ld.ay)).apply($$0, dbh::new)
   );
   public static final Codec<iv<dbh>> b = akb.a(ld.aQ, a);
   private final dbh.a c;
   private final dbc.c<iv<dat>> d;

   public dbh(dbh.a $$0, iw<dat> $$1) {
      this.c = $$0;
      this.d = $$0.e.apply($$1::b);
   }

   public dbc.c<iv<dat>> a() {
      return this.d;
   }

   public static Map<dbh.a, dbc.c<ake<dat>>> b() {
      return dbh.a.f.values().stream().collect(Collectors.toMap($$0 -> (dbh.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(akf d, dbh.a.a e) {
      public static final dbh.a a = new dbh.a(
         new akf("nether"),
         new dbh.a.a() {
            @Override
            public <T> dbc.c<T> apply(Function<ake<dat>, T> $$0) {
               return new dbc.c<>(
                  List.of(
                     Pair.of(dbc.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dba.ac)),
                     Pair.of(dbc.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dba.af)),
                     Pair.of(dbc.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dba.ae)),
                     Pair.of(dbc.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dba.ad)),
                     Pair.of(dbc.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dba.ag))
                  )
               );
            }
         }
      );
      public static final dbh.a b = new dbh.a(new akf("overworld"), new dbh.a.a() {
         @Override
         public <T> dbc.c<T> apply(Function<ake<dat>, T> $$0) {
            return dbh.a.a($$0);
         }
      });
      static final Map<akf, dbh.a> f = Stream.of(a, b).collect(Collectors.toMap(dbh.a::b, $$0 -> (dbh.a)$$0));
      public static final Codec<dbh.a> c = akf.a
         .flatXmap(
            $$0 -> Optional.ofNullable(f.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.d)
         );

      static <T> dbc.c<T> a(Function<ake<dat>, T> $$0) {
         Builder<Pair<dbc.d, T>> $$1 = ImmutableList.builder();
         new dbj().a($$2 -> $$1.add($$2.mapSecond($$0)));
         return new dbc.c<>($$1.build());
      }

      public Stream<ake<dat>> a() {
         return this.e.apply($$0 -> $$0).a().stream().<ake<dat>>map(Pair::getSecond).distinct();
      }

      public akf b() {
         return this.d;
      }

      public dbh.a.a c() {
         return this.e;
      }

      @FunctionalInterface
      interface a {
         <T> dbc.c<T> apply(Function<ake<dat>, T> var1);
      }
   }
}
