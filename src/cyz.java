import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cyz(Map<jq<diq>, dwx<?>> c) {
   public static final cyz a = new cyz(Map.of());
   public static final Codec<cyz> b = Codec.dispatchedMap(lz.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dwx<?> $$2 = ((diq)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dwx::f)).xmap(cyz::new, cyz::a);

   public cyz a(jq<diq> $$0, dwx<?> $$1) {
      return new cyz(ae.a(this.c, $$0, $$1));
   }

   public Map<jq<diq>, dwx<?>> a() {
      return this.c;
   }
}
