import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edc implements eda {
   public static final Codec<edc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efb.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               efb.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edc::new)
   );
   public final efb b;
   public final efb c;
   public final int d;

   public edc(efb $$0, efb $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
