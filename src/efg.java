import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efg implements eeh {
   public static final Codec<efg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.b(lu.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               egi.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               eit.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               eik.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bpw.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bpw.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, efg::new)
   );
   public final awu<dfy> b;
   public final egi c;
   public final jm<eit> d;
   public final eik e;
   public final bpw f;
   public final float g;
   public final int h;
   public final float i;
   public final bpw j;
   public final float k;

   public efg(awu<dfy> $$0, egi $$1, jm<eit> $$2, eik $$3, bpw $$4, float $$5, int $$6, float $$7, bpw $$8, float $$9) {
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
