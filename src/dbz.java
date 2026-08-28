import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record dbz(Map<jf<dmr>, ebw<?>> c) {
   public static final dbz a = new dbz(Map.of());
   public static final Codec<dbz> b = Codec.dispatchedMap(mg.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         ebw<?> $$2 = ((dmr)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, ebw::f)).xmap(dbz::new, dbz::a);

   public dbz a(jf<dmr> $$0, ebw<?> $$1) {
      return new dbz(ag.a(this.c, $$0, $$1));
   }

   public Map<jf<dmr>, ebw<?>> a() {
      return this.c;
   }
}
