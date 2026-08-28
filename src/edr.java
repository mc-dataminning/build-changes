import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edr implements edp {
   public static final Codec<edr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efq.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               efq.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edr::new)
   );
   public final efq b;
   public final efq c;
   public final int d;

   public edr(efq $$0, efq $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
