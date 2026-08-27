import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dur {
   public static final Codec<dur> a = arj.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(aey.a(jc.aJ), din.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, dur::new)),
      dur::a
   );
   public static final Codec<he<dur>> b = aev.a(jc.aG, a);
   private final Map<aey<din>, din> c;

   public dur(Map<aey<din>, din> $$0) {
      this.c = $$0;
   }

   private hq<din> c() {
      hz<din> $$0 = new hm<>(jc.aJ, Lifecycle.experimental());
      dlh.a(this.c.keySet().stream()).forEach($$1 -> {
         din $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((aey<din>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dlh a() {
      return new dlh(this.c());
   }

   public Optional<din> b() {
      return Optional.ofNullable(this.c.get(din.b));
   }

   private static DataResult<dur> a(dur $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
