import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eja implements eib {
   public static final Codec<eja> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axf.b(mc.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               ekc.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               emp.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               emf.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bro.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bro.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eja::new)
   );
   public final axf<djl> b;
   public final ekc c;
   public final jr<emp> d;
   public final emf e;
   public final bro f;
   public final float g;
   public final int h;
   public final float i;
   public final bro j;
   public final float k;

   public eja(axf<djl> $$0, ekc $$1, jr<emp> $$2, emf $$3, bro $$4, float $$5, int $$6, float $$7, bro $$8, float $$9) {
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
