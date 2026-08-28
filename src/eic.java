import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eic implements eia {
   public static final Codec<eic> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekb.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               ekb.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eic::new)
   );
   public final ekb b;
   public final ekb c;
   public final int d;

   public eic(ekb $$0, ekb $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
