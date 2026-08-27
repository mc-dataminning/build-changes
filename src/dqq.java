import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqq implements dpr {
   public static final Codec<dqq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqa.b(jc.e).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               drs.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               dud.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               dtu.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bfv.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bfv.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dqq::new)
   );
   public final aqa<csm> b;
   public final drs c;
   public final he<dud> d;
   public final dtu e;
   public final bfv f;
   public final float g;
   public final int h;
   public final float i;
   public final bfv j;
   public final float k;

   public dqq(aqa<csm> $$0, drs $$1, he<dud> $$2, dtu $$3, bfv $$4, float $$5, int $$6, float $$7, bfv $$8, float $$9) {
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
