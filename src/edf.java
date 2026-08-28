import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edf implements edd {
   public static final Codec<edf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efe.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               efe.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edf::new)
   );
   public final efe b;
   public final efe c;
   public final int d;

   public edf(efe $$0, efe $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
