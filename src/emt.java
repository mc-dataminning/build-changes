import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emt implements emr {
   public static final Codec<emt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eos.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               eos.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, emt::new)
   );
   public final eos b;
   public final eos c;
   public final int d;

   public emt(eos $$0, eos $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
