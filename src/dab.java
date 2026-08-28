import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record dab(Map<jq<dkl>, dyw<?>> c) {
   public static final dab a = new dab(Map.of());
   public static final Codec<dab> b = Codec.dispatchedMap(ma.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dyw<?> $$2 = ((dkl)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dyw::f)).xmap(dab::new, dab::a);

   public dab a(jq<dkl> $$0, dyw<?> $$1) {
      return new dab(ae.a(this.c, $$0, $$1));
   }

   public Map<jq<dkl>, dyw<?>> a() {
      return this.c;
   }
}
