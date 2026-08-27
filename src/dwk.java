import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dwk {
   public static final Codec<dwk> a = asq.a(
      RecordCodecBuilder.create($$0 -> $$0.group(Codec.unboundedMap(agf.a(jz.aK), dkg.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, dwk::new)),
      dwk::a
   );
   public static final Codec<ib<dwk>> b = agc.a(jz.aH, a);
   private final Map<agf<dkg>, dkg> c;

   public dwk(Map<agf<dkg>, dkg> $$0) {
      this.c = $$0;
   }

   private io<dkg> c() {
      ix<dkg> $$0 = new ik<>(jz.aK, Lifecycle.experimental());
      dna.a(this.c.keySet().stream()).forEach($$1 -> {
         dkg $$2 = this.c.get($$1);
         if ($$2 != null) {
            $$0.a((agf<dkg>)$$1, $$2, Lifecycle.stable());
         }
      });
      return $$0.l();
   }

   public dna a() {
      return new dna(this.c());
   }

   public Optional<dkg> b() {
      return Optional.ofNullable(this.c.get(dkg.b));
   }

   private static DataResult<dwk> a(dwk $$0) {
      return $$0.b().isEmpty() ? DataResult.error(() -> "Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
