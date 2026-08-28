import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record dbp(Map<je<dmf>, ebk<?>> c) {
   public static final dbp a = new dbp(Map.of());
   public static final Codec<dbp> b = Codec.dispatchedMap(mf.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         ebk<?> $$2 = ((dmf)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, ebk::f)).xmap(dbp::new, dbp::a);

   public dbp a(je<dmf> $$0, ebk<?> $$1) {
      return new dbp(af.a(this.c, $$0, $$1));
   }

   public Map<je<dmf>, ebk<?>> a() {
      return this.c;
   }
}
