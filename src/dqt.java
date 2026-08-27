import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqt implements dpu {
   public static final Codec<dqt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqk.b(jc.e).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               drv.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               dug.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               dtx.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bgj.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bgj.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dqt::new)
   );
   public final aqk<ctc> b;
   public final drv c;
   public final he<dug> d;
   public final dtx e;
   public final bgj f;
   public final float g;
   public final int h;
   public final float i;
   public final bgj j;
   public final float k;

   public dqt(aqk<ctc> $$0, drv $$1, he<dug> $$2, dtx $$3, bgj $$4, float $$5, int $$6, float $$7, bgj $$8, float $$9) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
      this.k = $$9;
   }
}
