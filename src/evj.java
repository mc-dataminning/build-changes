import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class evj extends eug {
   private static final Map<kq<?>, evj.a<?>> b = Stream.of(
         new evj.a<>(kr.M, cxq::a),
         new evj.a<>(kr.B, cyd::a),
         new evj.a<>(kr.k, dbc::a),
         new evj.a<>(kr.A, dbc::a),
         new evj.a<>(kr.f, cys::a),
         new evj.a<>(kr.m, csz::a),
         new evj.a<>(kr.l, csz::a),
         new evj.a<>(kr.n, cyg::a),
         new evj.a<>(kr.T, cvp::a)
      )
      .collect(Collectors.toMap(evj.a::a, $$0 -> (evj.a<?>)$$0));
   private static final Codec<evj.a<?>> c = lu.ap.q().comapFlatMap($$0 -> {
      evj.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + lu.ap.b($$0));
   }, evj.a::a);
   public static final MapCodec<evj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, evj::new)
   );
   private final Map<evj.a<?>, Boolean> d;

   private evj(List<ewe> $$0, Map<evj.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected cvl a(cvl $$0, est $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public eui<evj> b() {
      return euj.P;
   }

   static record a<T>(kq<T> a, evj.b<T> b) {
      public void a(cvl $$0, boolean $$1) {
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
