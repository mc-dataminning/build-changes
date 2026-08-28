import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eho implements egp {
   public static final Codec<eho> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axq.b(lz.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               eiq.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               elb.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               ekr.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bri.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bri.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eho::new)
   );
   public final axq<die> b;
   public final eiq c;
   public final jq<elb> d;
   public final ekr e;
   public final bri f;
   public final float g;
   public final int h;
   public final float i;
   public final bri j;
   public final float k;

   public eho(axq<die> $$0, eiq $$1, jq<elb> $$2, ekr $$3, bri $$4, float $$5, int $$6, float $$7, bri $$8, float $$9) {
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
