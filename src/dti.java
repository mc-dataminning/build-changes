import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dti implements dtg {
   public static final Codec<dti> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvh.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dvh.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dti::new)
   );
   public final dvh b;
   public final dvh c;
   public final int d;

   public dti(dvh $$0, dvh $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
