import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eim extends emh {
   public static final MapCodec<eim> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               epp.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               btj.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               ehh.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               ein.b.optionalFieldOf("debug_settings", ein.a).forGetter($$0x -> $$0x.h),
               ju.a(mh.i).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, eim::new)
   );
   public final epp e;
   public final btj f;
   public final ehh g;
   public final ein h;
   public final jj<dmm> i;

   public eim(float $$0, epp $$1, btj $$2, ehh $$3, ein $$4, jj<dmm> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
