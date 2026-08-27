import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsm implements drn {
   public static final Codec<dsm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arr.b(jz.e).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dto.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               dvz.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               dvq.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bhv.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bhv.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dsm::new)
   );
   public final arr<cut> b;
   public final dto c;
   public final ib<dvz> d;
   public final dvq e;
   public final bhv f;
   public final float g;
   public final int h;
   public final float i;
   public final bhv j;
   public final float k;

   public dsm(arr<cut> $$0, dto $$1, ib<dvz> $$2, dvq $$3, bhv $$4, float $$5, int $$6, float $$7, bhv $$8, float $$9) {
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
