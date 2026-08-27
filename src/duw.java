import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duw implements dtx {
   public static final Codec<duw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asv.b(ke.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dvy.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               dyj.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               dya.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bjf.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bjf.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, duw::new)
   );
   public final asv<cwp> b;
   public final dvy c;
   public final ih<dyj> d;
   public final dya e;
   public final bjf f;
   public final float g;
   public final int h;
   public final float i;
   public final bjf j;
   public final float k;

   public duw(asv<cwp> $$0, dvy $$1, ih<dyj> $$2, dya $$3, bjf $$4, float $$5, int $$6, float $$7, bjf $$8, float $$9) {
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
