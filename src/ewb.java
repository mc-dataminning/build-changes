import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ewb extends euy {
   private static final Map<kr<?>, ewb.a<?>> b = Stream.of(
         new ewb.a<>(ks.P, cxu::a),
         new ewb.a<>(ks.E, cyk::a),
         new ewb.a<>(ks.k, dbt::a),
         new ewb.a<>(ks.D, dbt::a),
         new ewb.a<>(ks.f, cza::a),
         new ewb.a<>(ks.m, cti::a),
         new ewb.a<>(ks.l, cti::a),
         new ewb.a<>(ks.n, cyn::a),
         new ewb.a<>(ks.W, cvx::a)
      )
      .collect(Collectors.toMap(ewb.a::a, $$0 -> (ewb.a<?>)$$0));
   private static final Codec<ewb.a<?>> c = lv.ap.q().comapFlatMap($$0 -> {
      ewb.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lv.ap.b($$0));
   }, ewb.a::a);
   public static final MapCodec<ewb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, ewb::new)
   );
   private final Map<ewb.a<?>, Boolean> d;

   private ewb(List<eww> $$0, Map<ewb.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cvs a(cvs $$0, etl $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public eva<ewb> b() {
      return evb.P;
   }

   static record a<T>(kr<T> a, ewb.b<T> b) {
      public void a(cvs $$0, boolean $$1) {
         T $$2 = $$0.a(this.a);
         if ($$2 != null) {
            $$0.b(this.a, this.b.withTooltip($$2, $$1));
         }
      }
   }

   @FunctionalInterface
   interface b<T> {
      T withTooltip(T var1, boolean var2);
   }
}
