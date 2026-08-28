import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cyj(Map<jo<dhm>, dvv<?>> c) {
   public static final cyj a = new cyj(Map.of());
   public static final Codec<cyj> b = Codec.dispatchedMap(lv.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dvv<?> $$2 = ((dhm)$$0.a()).k().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dvv::f)).xmap(cyj::new, cyj::a);

   public cyj a(jo<dhm> $$0, dvv<?> $$1) {
      return new cyj(ad.a(this.c, $$0, $$1));
   }

   public Map<jo<dhm>, dvv<?>> a() {
      return this.c;
   }
}
