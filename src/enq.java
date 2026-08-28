import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enq implements emr {
   public static final Codec<enq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axv.b(mi.i).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               eos.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               erh.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               eqx.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bty.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bty.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, enq::new)
   );
   public final axv<dne> b;
   public final eos c;
   public final jg<erh> d;
   public final eqx e;
   public final bty f;
   public final float g;
   public final int h;
   public final float i;
   public final bty j;
   public final float k;

   public enq(axv<dne> $$0, eos $$1, jg<erh> $$2, eqx $$3, bty $$4, float $$5, int $$6, float $$7, bty $$8, float $$9) {
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
