import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cyo(Map<jq<die>, dwm<?>> c) {
   public static final cyo a = new cyo(Map.of());
   public static final Codec<cyo> b = Codec.dispatchedMap(ly.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dwm<?> $$2 = ((die)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dwm::f)).xmap(cyo::new, cyo::a);

   public cyo a(jq<die> $$0, dwm<?> $$1) {
      return new cyo(ae.a(this.c, $$0, $$1));
   }

   public Map<jq<die>, dwm<?>> a() {
      return this.c;
   }
}
