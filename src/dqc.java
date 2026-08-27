import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqc implements dqa {
   public static final Codec<dqc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsb.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dsb.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dqc::new)
   );
   public final dsb b;
   public final dsb c;
   public final int d;

   public dqc(dsb $$0, dsb $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
