import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duf implements dtg {
   public static final Codec<duf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asg.b(kc.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dvh.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               dxs.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               dxj.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               biq.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               biq.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, duf::new)
   );
   public final asg<cvz> b;
   public final dvh c;
   public final ie<dxs> d;
   public final dxj e;
   public final biq f;
   public final float g;
   public final int h;
   public final float i;
   public final biq j;
   public final float k;

   public duf(asg<cvz> $$0, dvh $$1, ie<dxs> $$2, dxj $$3, biq $$4, float $$5, int $$6, float $$7, biq $$8, float $$9) {
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
