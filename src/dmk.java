import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmk extends dqe {
   public static final MapCodec<dmk> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dtj.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bgh.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dlg.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dml.b.optionalFieldOf("debug_settings", dml.a).forGetter($$0x -> $$0x.h),
               hs.a(jc.e).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dmk::new)
   );
   public final dtj e;
   public final bgh f;
   public final dlg g;
   public final dml h;
   public final hi<ctc> i;

   public dmk(float $$0, dtj $$1, bgh $$2, dlg $$3, dml $$4, hi<ctc> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
