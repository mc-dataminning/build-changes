import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eea implements edb {
   public static final Codec<eea> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.b(lq.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               efc.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               ehn.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               ehe.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bpy.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bpy.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eea::new)
   );
   public final axe<dey> b;
   public final efc c;
   public final ji<ehn> d;
   public final ehe e;
   public final bpy f;
   public final float g;
   public final int h;
   public final float i;
   public final bpy j;
   public final float k;

   public eea(axe<dey> $$0, efc $$1, ji<ehn> $$2, ehe $$3, bpy $$4, float $$5, int $$6, float $$7, bpy $$8, float $$9) {
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
