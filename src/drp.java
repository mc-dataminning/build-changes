import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class drp {
   public static final Codec<drp> a = aoi.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(acp.a(jc.aI), dfl.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, drp::new)),
      drp::a
   );
   public static final Codec<he<drp>> b = acm.a(jc.aF, a);
   private final Map<acp<dfl>, dfl> c;

   public drp(Map<acp<dfl>, dfl> $$0) {
      this.c = $$0;
   }

   private hr<dfl> c() {
      ia<dfl> $$0 = new hm<>(jc.aI, Lifecycle.experimental());
      dif.a(this.c.keySet().stream()).forEach($$1 -> {
         dfl $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((acp<dfl>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dif a() {
      return new dif(this.c());
   }

   public Optional<dfl> b() {
      return Optional.ofNullable(this.c.get(dfl.b));
   }

   private static DataResult<drp> a(drp $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
