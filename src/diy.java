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

public class diy {
   public static final Codec<diy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(diy.a.d.fieldOf("preset").forGetter($$0x -> $$0x.c), alx.c(mb.aI)).apply($$0, diy::new)
   );
   public static final Codec<jq<diy>> b = alv.a(mb.bc, a);
   private final diy.a c;
   private final dit.c<jq<dik>> d;

   public diy(diy.a $$0, jr<dik> $$1) {
      this.c = $$0;
      this.d = $$0.f.apply($$1::b);
   }

   public dit.c<jq<dik>> a() {
      return this.d;
   }

   public static Map<diy.a, dit.c<aly<dik>>> b() {
      return diy.a.g.values().stream().collect(Collectors.toMap($$0 -> (diy.a)$$0, $$0 -> $$0.c().apply($$0x -> $$0x)));
   }

   public static record a(alz e, diy.a.a f) {
      public static final diy.a a = new diy.a(
         alz.b("nether"),
         new diy.a.a() {
            @Override
            public <T> dit.c<T> apply(Function<aly<dik>, T> $$0) {
               return new dit.c<>(
                  List.of(
                     Pair.of(dit.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dir.ac)),
                     Pair.of(dit.a(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dir.af)),
                     Pair.of(dit.a(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), $$0.apply(dir.ae)),
                     Pair.of(dit.a(0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F), $$0.apply(dir.ad)),
                     Pair.of(dit.a(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.175F), $$0.apply(dir.ag))
                  )
               );
            }
         }
      );
      public static final diy.a b = new diy.a(alz.b("overworld"), new diy.a.a() {
         @Override
         public <T> dit.c<T> apply(Function<aly<dik>, T> $$0) {
            return diy.a.a($$0, dja.a.a);
         }
      });
      public static final diy.a c = new diy.a(alz.b("overworld_winter_drop"), new diy.a.a() {
         @Override
         public <T> dit.c<T> apply(Function<aly<dik>, T> $$0) {
            return diy.a.a($$0, dja.a.b);
         }
      });
      static final Map<alz, diy.a> g = Stream.of(a, b, c).collect(Collectors.toMap(diy.a::b, $$0 -> (diy.a)$$0));
      public static final Codec<diy.a> d = alz.a
         .flatXmap(
            $$0 -> Optional.ofNullable(g.get($$0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + $$0)),
            $$0 -> DataResult.success($$0.e)
         );

      static <T> dit.c<T> a(Function<aly<dik>, T> $$0, dja.a $$1) {
         Builder<Pair<dit.d, T>> $$2 = ImmutableList.builder();
         new dja($$1).a($$2x -> $$2.add($$2x.mapSecond($$0)));
         return new dit.c<>($$2.build());
      }

      public Stream<aly<dik>> a() {
         return this.f.apply($$0 -> $$0).a().stream().<aly<dik>>map(Pair::getSecond).distinct();
      }

      public alz b() {
         return this.e;
      }

      public diy.a.a c() {
         return this.f;
      }

      @FunctionalInterface
      interface a {
         <T> dit.c<T> apply(Function<aly<dik>, T> var1);
      }
   }
}
