import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejc implements eid {
   public static final Codec<ejc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axf.b(mc.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               eke.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               emr.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               emh.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               brq.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               brq.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ejc::new)
   );
   public final axf<djn> b;
   public final eke c;
   public final jr<emr> d;
   public final emh e;
   public final brq f;
   public final float g;
   public final int h;
   public final float i;
   public final brq j;
   public final float k;

   public ejc(axf<djn> $$0, eke $$1, jr<emr> $$2, emh $$3, brq $$4, float $$5, int $$6, float $$7, brq $$8, float $$9) {
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
