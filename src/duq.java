import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duq implements dtr {
   public static final Codec<duq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asq.b(ke.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dvs.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               dyd.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               dxu.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bja.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bja.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, duq::new)
   );
   public final asq<cwj> b;
   public final dvs c;
   public final ih<dyd> d;
   public final dxu e;
   public final bja f;
   public final float g;
   public final int h;
   public final float i;
   public final bja j;
   public final float k;

   public duq(asq<cwj> $$0, dvs $$1, ih<dyd> $$2, dxu $$3, bja $$4, float $$5, int $$6, float $$7, bja $$8, float $$9) {
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
