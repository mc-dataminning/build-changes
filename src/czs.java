import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record czs(Map<jr<dke>, dyt<?>> c) {
   public static final czs a = new czs(Map.of());
   public static final Codec<czs> b = Codec.dispatchedMap(mb.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dyt<?> $$2 = ((dke)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dyt::f)).xmap(czs::new, czs::a);

   public czs a(jr<dke> $$0, dyt<?> $$1) {
      return new czs(af.a(this.c, $$0, $$1));
   }

   public Map<jr<dke>, dyt<?>> a() {
      return this.c;
   }
}
