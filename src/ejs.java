import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejs implements eit {
   public static final Codec<ejs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aya.b(mb.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               eku.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               enh.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               emx.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bsf.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bsf.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ejs::new)
   );
   public final aya<dkd> b;
   public final eku c;
   public final jq<enh> d;
   public final emx e;
   public final bsf f;
   public final float g;
   public final int h;
   public final float i;
   public final bsf j;
   public final float k;

   public ejs(aya<dkd> $$0, eku $$1, jq<enh> $$2, emx $$3, bsf $$4, float $$5, int $$6, float $$7, bsf $$8, float $$9) {
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
