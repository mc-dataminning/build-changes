import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cxh(Map<jm<dfw>, dud<?>> c) {
   public static final cxh a = new cxh(Map.of());
   public static final Codec<cxh> b = Codec.dispatchedMap(lt.e.s(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dud<?> $$2 = ((dfw)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dud::f)).xmap(cxh::new, cxh::a);

   public cxh a(jm<dfw> $$0, dud<?> $$1) {
      return new cxh(ad.a(this.c, $$0, $$1));
   }

   public Map<jm<dfw>, dud<?>> a() {
      return this.c;
   }
}
