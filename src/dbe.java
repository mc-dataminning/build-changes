import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record dbe(Map<je<dlu>, ear<?>> c) {
   public static final dbe a = new dbe(Map.of());
   public static final Codec<dbe> b = Codec.dispatchedMap(mf.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         ear<?> $$2 = ((dlu)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, ear::f)).xmap(dbe::new, dbe::a);

   public dbe a(je<dlu> $$0, ear<?> $$1) {
      return new dbe(af.a(this.c, $$0, $$1));
   }

   public Map<je<dlu>, ear<?>> a() {
      return this.c;
   }
}
