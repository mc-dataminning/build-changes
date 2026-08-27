import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dux implements dty {
   public static final Codec<dux> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asw.b(ke.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dvz.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               dyk.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               dyb.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bjg.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bjg.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dux::new)
   );
   public final asw<cwq> b;
   public final dvz c;
   public final ih<dyk> d;
   public final dyb e;
   public final bjg f;
   public final float g;
   public final int h;
   public final float i;
   public final bjg j;
   public final float k;

   public dux(asw<cwq> $$0, dvz $$1, ih<dyk> $$2, dyb $$3, bjg $$4, float $$5, int $$6, float $$7, bjg $$8, float $$9) {
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
