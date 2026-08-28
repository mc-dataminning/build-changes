import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cxf(Map<ji<dey>, dte<?>> c) {
   public static final cxf a = new cxf(Map.of());
   public static final Codec<cxf> b = Codec.dispatchedMap(lp.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dte<?> $$2 = ((dey)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dte::f)).xmap(cxf::new, cxf::a);

   public cxf a(ji<dey> $$0, dte<?> $$1) {
      return new cxf(ac.a(this.c, $$0, $$1));
   }

   public Map<ji<dey>, dte<?>> a() {
      return this.c;
   }
}
