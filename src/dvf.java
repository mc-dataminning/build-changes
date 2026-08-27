import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvf implements dug {
   public static final Codec<dvf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asx.b(ke.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dwh.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               dys.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               dyj.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bjh.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bjh.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dvf::new)
   );
   public final asx<cwy> b;
   public final dwh c;
   public final ih<dys> d;
   public final dyj e;
   public final bjh f;
   public final float g;
   public final int h;
   public final float i;
   public final bjh j;
   public final float k;

   public dvf(asx<cwy> $$0, dwh $$1, ih<dys> $$2, dyj $$3, bjh $$4, float $$5, int $$6, float $$7, bjh $$8, float $$9) {
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
