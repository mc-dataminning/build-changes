import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emw implements elx {
   public static final Codec<emw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axr.b(mh.i).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               eny.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               eqm.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               eqc.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               btl.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               btl.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, emw::new)
   );
   public final axr<dmm> b;
   public final eny c;
   public final jf<eqm> d;
   public final eqc e;
   public final btl f;
   public final float g;
   public final int h;
   public final float i;
   public final btl j;
   public final float k;

   public emw(axr<dmm> $$0, eny $$1, jf<eqm> $$2, eqc $$3, btl $$4, float $$5, int $$6, float $$7, btl $$8, float $$9) {
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
