import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cyg(Map<jn<dhj>, dvr<?>> c) {
   public static final cyg a = new cyg(Map.of());
   public static final Codec<cyg> b = Codec.dispatchedMap(lu.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dvr<?> $$2 = ((dhj)$$0.a()).n().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dvr::f)).xmap(cyg::new, cyg::a);

   public cyg a(jn<dhj> $$0, dvr<?> $$1) {
      return new cyg(ad.a(this.c, $$0, $$1));
   }

   public Map<jn<dhj>, dvr<?>> a() {
      return this.c;
   }
}
