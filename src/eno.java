import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eno implements emp {
   public static final Codec<eno> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axt.b(mh.i).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               eoq.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               erf.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               eqv.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               btw.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               btw.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eno::new)
   );
   public final axt<dnc> b;
   public final eoq c;
   public final jf<erf> d;
   public final eqv e;
   public final btw f;
   public final float g;
   public final int h;
   public final float i;
   public final btw j;
   public final float k;

   public eno(axt<dnc> $$0, eoq $$1, jf<erf> $$2, eqv $$3, btw $$4, float $$5, int $$6, float $$7, btw $$8, float $$9) {
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
