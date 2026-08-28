import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egx implements efy {
   public static final Codec<egx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axl.b(lw.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               ehz.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               ekk.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               eka.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bqx.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bqx.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, egx::new)
   );
   public final axl<dhm> b;
   public final ehz c;
   public final jo<ekk> d;
   public final eka e;
   public final bqx f;
   public final float g;
   public final int h;
   public final float i;
   public final bqx j;
   public final float k;

   public egx(axl<dhm> $$0, ehz $$1, jo<ekk> $$2, eka $$3, bqx $$4, float $$5, int $$6, float $$7, bqx $$8, float $$9) {
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
