import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnr implements dms {
   public static final Codec<dnr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               anl.b(jc.e).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dot.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               dre.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               dqv.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bdc.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bdc.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dnr::new)
   );
   public final anl<cpn> b;
   public final dot c;
   public final he<dre> d;
   public final dqv e;
   public final bdc f;
   public final float g;
   public final int h;
   public final float i;
   public final bdc j;
   public final float k;

   public dnr(anl<cpn> $$0, dot $$1, he<dre> $$2, dqv $$3, bdc $$4, float $$5, int $$6, float $$7, bdc $$8, float $$9) {
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
