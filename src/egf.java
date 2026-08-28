import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egf implements efg {
   public static final Codec<egf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axi.b(lv.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               ehh.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               ejs.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               eji.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bqp.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bqp.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, egf::new)
   );
   public final axi<dgv> b;
   public final ehh c;
   public final jn<ejs> d;
   public final eji e;
   public final bqp f;
   public final float g;
   public final int h;
   public final float i;
   public final bqp j;
   public final float k;

   public egf(axi<dgv> $$0, ehh $$1, jn<ejs> $$2, eji $$3, bqp $$4, float $$5, int $$6, float $$7, bqp $$8, float $$9) {
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
