import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eir extends emm {
   public static final MapCodec<eir> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               epu.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               btj.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               ehm.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               eis.b.optionalFieldOf("debug_settings", eis.a).forGetter($$0x -> $$0x.h),
               ju.a(mh.i).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, eir::new)
   );
   public final epu e;
   public final btj f;
   public final ehm g;
   public final eis h;
   public final jj<dmr> i;

   public eir(float $$0, epu $$1, btj $$2, ehm $$3, eis $$4, jj<dmr> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
