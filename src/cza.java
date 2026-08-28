import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cza(Map<jr<djk>, dxx<?>> c) {
   public static final cza a = new cza(Map.of());
   public static final Codec<cza> b = Codec.dispatchedMap(mb.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dxx<?> $$2 = ((djk)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dxx::f)).xmap(cza::new, cza::a);

   public cza a(jr<djk> $$0, dxx<?> $$1) {
      return new cza(af.a(this.c, $$0, $$1));
   }

   public Map<jr<djk>, dxx<?>> a() {
      return this.c;
   }
}
