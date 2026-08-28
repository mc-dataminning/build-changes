import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiz implements eia {
   public static final Codec<eiz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.b(mc.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               ekb.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               emo.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               eme.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               brn.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               brn.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eiz::new)
   );
   public final axe<djk> b;
   public final ekb c;
   public final jr<emo> d;
   public final eme e;
   public final brn f;
   public final float g;
   public final int h;
   public final float i;
   public final brn j;
   public final float k;

   public eiz(axe<djk> $$0, ekb $$1, jr<emo> $$2, eme $$3, brn $$4, float $$5, int $$6, float $$7, brn $$8, float $$9) {
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
