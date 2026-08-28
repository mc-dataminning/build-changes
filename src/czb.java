import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record czb(Map<jr<djl>, dxy<?>> c) {
   public static final czb a = new czb(Map.of());
   public static final Codec<czb> b = Codec.dispatchedMap(mb.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dxy<?> $$2 = ((djl)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dxy::f)).xmap(czb::new, czb::a);

   public czb a(jr<djl> $$0, dxy<?> $$1) {
      return new czb(af.a(this.c, $$0, $$1));
   }

   public Map<jr<djl>, dxy<?>> a() {
      return this.c;
   }
}
