import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsy implements drz {
   public static final Codec<dsy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arv.b(jz.e).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dua.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               dwl.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               dwc.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bic.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bic.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dsy::new)
   );
   public final arv<cva> b;
   public final dua c;
   public final ib<dwl> d;
   public final dwc e;
   public final bic f;
   public final float g;
   public final int h;
   public final float i;
   public final bic j;
   public final float k;

   public dsy(arv<cva> $$0, dua $$1, ib<dwl> $$2, dwc $$3, bic $$4, float $$5, int $$6, float $$7, bic $$8, float $$9) {
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
