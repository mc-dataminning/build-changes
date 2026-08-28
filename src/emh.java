import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emh implements eli {
   public static final Codec<emh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axr.b(mg.i).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               enj.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               epx.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               epn.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               btg.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               btg.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, emh::new)
   );
   public final axr<dma> b;
   public final enj c;
   public final je<epx> d;
   public final epn e;
   public final btg f;
   public final float g;
   public final int h;
   public final float i;
   public final btg j;
   public final float k;

   public emh(axr<dma> $$0, enj $$1, je<epx> $$2, epn $$3, btg $$4, float $$5, int $$6, float $$7, btg $$8, float $$9) {
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
