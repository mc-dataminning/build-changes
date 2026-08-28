import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cxj(Map<jm<dfy>, duf<?>> c) {
   public static final cxj a = new cxj(Map.of());
   public static final Codec<cxj> b = Codec.dispatchedMap(lt.e.s(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         duf<?> $$2 = ((dfy)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, duf::f)).xmap(cxj::new, cxj::a);

   public cxj a(jm<dfy> $$0, duf<?> $$1) {
      return new cxj(ad.a(this.c, $$0, $$1));
   }

   public Map<jm<dfy>, duf<?>> a() {
      return this.c;
   }
}
