import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.function.Function;

public record cus(Map<iv<dcv>, drb<?>> c) {
   public static final cus a = new cus(Map.of());
   public static final Codec<cus> b = axe.c(lc.e.r(), (Function)($$0 -> Codec.STRING.comapFlatMap($$1 -> {
         drb<?> $$2 = ((dcv)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, drb::f))).xmap(cus::new, cus::a);

   public cus a(iv<dcv> $$0, drb<?> $$1) {
      return new cus(ac.a(this.c, $$0, $$1));
   }

   public Map<iv<dcv>, drb<?>> a() {
      return this.c;
   }
}
