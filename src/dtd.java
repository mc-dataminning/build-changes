import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtd implements dse {
   public static final Codec<dtd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arz.b(kd.e).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               duf.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               dwq.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               dwh.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               big.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               big.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dtd::new)
   );
   public final arz<cvf> b;
   public final duf c;
   public final ig<dwq> d;
   public final dwh e;
   public final big f;
   public final float g;
   public final int h;
   public final float i;
   public final big j;
   public final float k;

   public dtd(arz<cvf> $$0, duf $$1, ig<dwq> $$2, dwh $$3, big $$4, float $$5, int $$6, float $$7, big $$8, float $$9) {
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
