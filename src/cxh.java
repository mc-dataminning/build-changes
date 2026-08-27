import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.function.Function;

public record cxh(Map<ja<dfc>, duf<?>> c) {
   public static final cxh a = new cxh(Map.of());
   public static final Codec<cxh> b = axu.c(lh.e.r(), (Function)($$0 -> Codec.STRING.comapFlatMap($$1 -> {
         duf<?> $$2 = ((dfc)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, duf::f))).xmap(cxh::new, cxh::a);

   public cxh a(ja<dfc> $$0, duf<?> $$1) {
      return new cxh(ad.a(this.c, $$0, $$1));
   }

   public Map<ja<dfc>, duf<?>> a() {
      return this.c;
   }
}
