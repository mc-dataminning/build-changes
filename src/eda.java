import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eda implements ecb {
   public static final Codec<eda> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awl.b(lf.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               eec.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               egn.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               ege.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               boz.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               boz.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eda::new)
   );
   public final awl<ddy> b;
   public final eec c;
   public final ix<egn> d;
   public final ege e;
   public final boz f;
   public final float g;
   public final int h;
   public final float i;
   public final boz j;
   public final float k;

   public eda(awl<ddy> $$0, eec $$1, ix<egn> $$2, ege $$3, boz $$4, float $$5, int $$6, float $$7, boz $$8, float $$9) {
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
