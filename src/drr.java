import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drr implements dqs {
   public static final Codec<drr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arh.b(jz.e).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dst.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               dve.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               duv.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bhg.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bhg.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, drr::new)
   );
   public final arh<cua> b;
   public final dst c;
   public final ib<dve> d;
   public final duv e;
   public final bhg f;
   public final float g;
   public final int h;
   public final float i;
   public final bhg j;
   public final float k;

   public drr(arh<cua> $$0, dst $$1, ib<dve> $$2, duv $$3, bhg $$4, float $$5, int $$6, float $$7, bhg $$8, float $$9) {
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
