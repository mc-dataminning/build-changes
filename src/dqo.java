import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqo implements dpp {
   public static final Codec<dqo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               apy.b(jd.e).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               drq.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               dub.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               dts.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bft.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bft.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dqo::new)
   );
   public final apy<csk> b;
   public final drq c;
   public final hf<dub> d;
   public final dts e;
   public final bft f;
   public final float g;
   public final int h;
   public final float i;
   public final bft j;
   public final float k;

   public dqo(apy<csk> $$0, drq $$1, hf<dub> $$2, dts $$3, bft $$4, float $$5, int $$6, float $$7, bft $$8, float $$9) {
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
