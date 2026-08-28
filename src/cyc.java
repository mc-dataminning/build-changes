import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record cyc(Map<jn<dgv>, dvd<?>> c) {
   public static final cyc a = new cyc(Map.of());
   public static final Codec<cyc> b = Codec.dispatchedMap(lu.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
         dvd<?> $$2 = ((dgv)$$0.a()).l().a($$1);
         return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
      }, dvd::f)).xmap(cyc::new, cyc::a);

   public cyc a(jn<dgv> $$0, dvd<?> $$1) {
      return new cyc(ad.a(this.c, $$0, $$1));
   }

   public Map<jn<dgv>, dvd<?>> a() {
      return this.c;
   }
}
