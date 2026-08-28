import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eku implements ejv {
   public static final Codec<eku> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axp.b(me.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               elw.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               eok.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               eoa.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bsv.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bsv.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eku::new)
   );
   public final axp<dku> b;
   public final elw c;
   public final js<eok> d;
   public final eoa e;
   public final bsv f;
   public final float g;
   public final int h;
   public final float i;
   public final bsv j;
   public final float k;

   public eku(axp<dku> $$0, elw $$1, js<eok> $$2, eoa $$3, bsv $$4, float $$5, int $$6, float $$7, bsv $$8, float $$9) {
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
