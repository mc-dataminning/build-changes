import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwv implements dvw {
   public static final Codec<dwv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               auo.b(kg.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dxx.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               eai.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               dzz.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bkz.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bkz.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dwv::new)
   );
   public final auo<cyo> b;
   public final dxx c;
   public final ij<eai> d;
   public final dzz e;
   public final bkz f;
   public final float g;
   public final int h;
   public final float i;
   public final bkz j;
   public final float k;

   public dwv(auo<cyo> $$0, dxx $$1, ij<eai> $$2, dzz $$3, bkz $$4, float $$5, int $$6, float $$7, bkz $$8, float $$9) {
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
