import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxc implements dwd {
   public static final Codec<dxc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aup.b(kg.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dye.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               eap.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               eag.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               blb.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               blb.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dxc::new)
   );
   public final aup<cys> b;
   public final dye c;
   public final ij<eap> d;
   public final eag e;
   public final blb f;
   public final float g;
   public final int h;
   public final float i;
   public final blb j;
   public final float k;

   public dxc(aup<cys> $$0, dye $$1, ij<eap> $$2, eag $$3, blb $$4, float $$5, int $$6, float $$7, blb $$8, float $$9) {
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
