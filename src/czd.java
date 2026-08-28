import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record czd(Map<jr<djn>, dya<?>> c) {
   public static final czd a = new czd(Map.of());
   public static final Codec<czd> b = Codec.dispatchedMap(mb.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dya<?> $$2 = ((djn)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dya::f)).xmap(czd::new, czd::a);

   public czd a(jr<djn> $$0, dya<?> $$1) {
      return new czd(af.a(this.c, $$0, $$1));
   }

   public Map<jr<djn>, dya<?>> a() {
      return this.c;
   }
}
