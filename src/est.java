import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class est extends erp {
   private static final Map<kl<?>, est.a<?>> b = Stream.of(
         new est.a<>(km.J, cwo::a),
         new est.a<>(km.y, cxc::a),
         new est.a<>(km.j, daa::a),
         new est.a<>(km.x, daa::a),
         new est.a<>(km.e, cxr::a),
         new est.a<>(km.l, crw::a),
         new est.a<>(km.k, crw::a),
         new est.a<>(km.m, cxf::a)
      )
      .collect(Collectors.toMap(est.a::a, $$0 -> (est.a<?>)$$0));
   private static final Codec<est.a<?>> c = lp.as.q().comapFlatMap($$0 -> {
      est.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lp.as.b($$0));
   }, est.a::a);
   public static final MapCodec<est> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, est::new)
   );
   private final Map<est.a<?>, Boolean> d;

   private est(List<etn> $$0, Map<est.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cuk a(cuk $$0, eqd $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public err<est> b() {
      return ers.P;
   }

   static record a<T>(kl<T> a, est.b<T> b) {
      public void a(cuk $$0, boolean $$1) {
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
