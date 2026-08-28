import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cxg(Map<ji<dez>, dtf<?>> c) {
   public static final cxg a = new cxg(Map.of());
   public static final Codec<cxg> b = Codec.dispatchedMap(lp.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dtf<?> $$2 = ((dez)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dtf::f)).xmap(cxg::new, cxg::a);

   public cxg a(ji<dez> $$0, dtf<?> $$1) {
      return new cxg(ac.a(this.c, $$0, $$1));
   }

   public Map<ji<dez>, dtf<?>> a() {
      return this.c;
   }
}
