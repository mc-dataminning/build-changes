import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dux {
   public static final Codec<dux> a = arf.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(aev.a(jc.aI), dit.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, dux::new)),
      dux::a
   );
   public static final Codec<he<dux>> b = aes.a(jc.aF, a);
   private final Map<aev<dit>, dit> c;

   public dux(Map<aev<dit>, dit> $$0) {
      this.c = $$0;
   }

   private hq<dit> c() {
      hz<dit> $$0 = new hm<>(jc.aI, Lifecycle.experimental());
      dln.a(this.c.keySet().stream()).forEach($$1 -> {
         dit $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((aev<dit>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dln a() {
      return new dln(this.c());
   }

   public Optional<dit> b() {
      return Optional.ofNullable(this.c.get(dit.b));
   }

   private static DataResult<dux> a(dux $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
