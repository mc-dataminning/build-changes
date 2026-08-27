import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dps implements dpq {
   public static final Codec<dps> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drr.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               drr.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dps::new)
   );
   public final drr b;
   public final drr c;
   public final int d;

   public dps(drr $$0, drr $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
