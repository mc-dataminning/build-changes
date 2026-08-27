import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dxb {
   public static final Codec<dxb> a = asy.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(agl.a(kd.aK), dkx.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, dxb::new)),
      dxb::a
   );
   public static final Codec<ig<dxb>> b = agi.a(kd.aH, a);
   private final Map<agl<dkx>, dkx> c;

   public dxb(Map<agl<dkx>, dkx> $$0) {
      this.c = $$0;
   }

   private is<dkx> c() {
      jb<dkx> $$0 = new io<>(kd.aK, Lifecycle.experimental());
      dnr.a(this.c.keySet().stream()).forEach($$1 -> {
         dkx $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((agl<dkx>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dnr a() {
      return new dnr(this.c());
   }

   public Optional<dkx> b() {
      return Optional.ofNullable(this.c.get(dkx.b));
   }

   private static DataResult<dxb> a(dxb $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
