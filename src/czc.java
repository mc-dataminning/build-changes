import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record czc(Map<jr<djm>, dxz<?>> c) {
   public static final czc a = new czc(Map.of());
   public static final Codec<czc> b = Codec.dispatchedMap(mb.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dxz<?> $$2 = ((djm)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dxz::f)).xmap(czc::new, czc::a);

   public czc a(jr<djm> $$0, dxz<?> $$1) {
      return new czc(af.a(this.c, $$0, $$1));
   }

   public Map<jr<djm>, dxz<?>> a() {
      return this.c;
   }
}
