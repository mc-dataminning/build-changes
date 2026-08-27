import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.function.Function;

public record cvo(Map<iw<dde>, drk<?>> c) {
   public static final cvo a = new cvo(Map.of());
   public static final Codec<cvo> b = axh.c(ld.e.r(), (Function)($$0 -> Codec.STRING.comapFlatMap($$1 -> {
         drk<?> $$2 = ((dde)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, drk::f))).xmap(cvo::new, cvo::a);

   public cvo a(iw<dde> $$0, drk<?> $$1) {
      return new cvo(ac.a(this.c, $$0, $$1));
   }

   public Map<iw<dde>, drk<?>> a() {
      return this.c;
   }
}
