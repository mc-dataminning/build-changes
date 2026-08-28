import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record dbw(Map<jf<dmm>, ebr<?>> c) {
   public static final dbw a = new dbw(Map.of());
   public static final Codec<dbw> b = Codec.dispatchedMap(mg.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         ebr<?> $$2 = ((dmm)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, ebr::f)).xmap(dbw::new, dbw::a);

   public dbw a(jf<dmm> $$0, ebr<?> $$1) {
      return new dbw(ag.a(this.c, $$0, $$1));
   }

   public Map<jf<dmm>, ebr<?>> a() {
      return this.c;
   }
}
