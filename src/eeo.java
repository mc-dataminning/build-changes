import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeo implements edp {
   public static final Codec<eeo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awm.b(lr.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               efq.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               eib.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               ehs.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bpm.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bpm.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eeo::new)
   );
   public final awm<dfi> b;
   public final efq c;
   public final jj<eib> d;
   public final ehs e;
   public final bpm f;
   public final float g;
   public final int h;
   public final float i;
   public final bpm j;
   public final float k;

   public eeo(awm<dfi> $$0, efq $$1, jj<eib> $$2, ehs $$3, bpm $$4, float $$5, int $$6, float $$7, bpm $$8, float $$9) {
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
