import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emp implements elq {
   public static final Codec<emp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axr.b(mg.i).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               enr.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               eqf.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               epv.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bti.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bti.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, emp::new)
   );
   public final axr<dmf> b;
   public final enr c;
   public final je<eqf> d;
   public final epv e;
   public final bti f;
   public final float g;
   public final int h;
   public final float i;
   public final bti j;
   public final float k;

   public emp(axr<dmf> $$0, enr $$1, je<eqf> $$2, epv $$3, bti $$4, float $$5, int $$6, float $$7, bti $$8, float $$9) {
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
