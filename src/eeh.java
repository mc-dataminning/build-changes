import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeh implements edi {
   public static final Codec<eeh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awk.b(lr.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               efj.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               ehu.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               ehl.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bpi.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bpi.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eeh::new)
   );
   public final awk<dff> b;
   public final efj c;
   public final jj<ehu> d;
   public final ehl e;
   public final bpi f;
   public final float g;
   public final int h;
   public final float i;
   public final bpi j;
   public final float k;

   public eeh(awk<dff> $$0, efj $$1, jj<ehu> $$2, ehl $$3, bpi $$4, float $$5, int $$6, float $$7, bpi $$8, float $$9) {
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
