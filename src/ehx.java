import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehx extends els {
   public static final MapCodec<ehx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               epa.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bte.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               egs.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               ehy.b.optionalFieldOf("debug_settings", ehy.a).forGetter($$0x -> $$0x.h),
               jt.a(mg.i).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, ehx::new)
   );
   public final epa e;
   public final bte f;
   public final egs g;
   public final ehy h;
   public final ji<dma> i;

   public ehx(float $$0, epa $$1, bte $$2, egs $$3, ehy $$4, ji<dma> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
