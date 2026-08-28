import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record dbk(Map<je<dma>, ebc<?>> c) {
   public static final dbk a = new dbk(Map.of());
   public static final Codec<dbk> b = Codec.dispatchedMap(mf.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         ebc<?> $$2 = ((dma)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, ebc::f)).xmap(dbk::new, dbk::a);

   public dbk a(je<dma> $$0, ebc<?> $$1) {
      return new dbk(af.a(this.c, $$0, $$1));
   }

   public Map<je<dma>, ebc<?>> a() {
      return this.c;
   }
}
