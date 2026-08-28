import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cyi(Map<jp<dhy>, dwg<?>> c) {
   public static final cyi a = new cyi(Map.of());
   public static final Codec<cyi> b = Codec.dispatchedMap(lx.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dwg<?> $$2 = ((dhy)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dwg::f)).xmap(cyi::new, cyi::a);

   public cyi a(jp<dhy> $$0, dwg<?> $$1) {
      return new cyi(ad.a(this.c, $$0, $$1));
   }

   public Map<jp<dhy>, dwg<?>> a() {
      return this.c;
   }
}
