import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqz implements dqa {
   public static final Codec<dqz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqh.b(jc.e).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dsb.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               dum.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               dud.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bgd.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bgd.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dqz::new)
   );
   public final aqh<csv> b;
   public final dsb c;
   public final he<dum> d;
   public final dud e;
   public final bgd f;
   public final float g;
   public final int h;
   public final float i;
   public final bgd j;
   public final float k;

   public dqz(aqh<csv> $$0, dsb $$1, he<dum> $$2, dud $$3, bgd $$4, float $$5, int $$6, float $$7, bgd $$8, float $$9) {
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
