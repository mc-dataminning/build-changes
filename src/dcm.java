import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record dcm(Map<jg<dne>, ecj<?>> c) {
   public static final dcm a = new dcm(Map.of());
   public static final Codec<dcm> b = Codec.dispatchedMap(mh.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         ecj<?> $$2 = ((dne)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, ecj::f)).xmap(dcm::new, dcm::a);

   public dcm a(jg<dne> $$0, ecj<?> $$1) {
      return new dcm(ag.a(this.c, $$0, $$1));
   }

   public Map<jg<dne>, ecj<?>> a() {
      return this.c;
   }
}
