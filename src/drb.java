import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drb implements dqc {
   public static final Codec<drb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqj.b(je.e).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dsd.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               duo.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               duf.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bgf.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bgf.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, drb::new)
   );
   public final aqj<csx> b;
   public final dsd c;
   public final hg<duo> d;
   public final duf e;
   public final bgf f;
   public final float g;
   public final int h;
   public final float i;
   public final bgf j;
   public final float k;

   public drb(aqj<csx> $$0, dsd $$1, hg<duo> $$2, duf $$3, bgf $$4, float $$5, int $$6, float $$7, bgf $$8, float $$9) {
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
