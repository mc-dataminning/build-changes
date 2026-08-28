import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eed implements ede {
   public static final Codec<eed> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axf.b(lq.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               eff.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               ehq.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               ehh.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bqb.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bqb.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eed::new)
   );
   public final axf<dfb> b;
   public final eff c;
   public final ji<ehq> d;
   public final ehh e;
   public final bqb f;
   public final float g;
   public final int h;
   public final float i;
   public final bqb j;
   public final float k;

   public eed(axf<dfb> $$0, eff $$1, ji<ehq> $$2, ehh $$3, bqb $$4, float $$5, int $$6, float $$7, bqb $$8, float $$9) {
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
