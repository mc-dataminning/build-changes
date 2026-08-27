import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebx implements eay {
   public static final Codec<ebx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awd.b(ld.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               ecz.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               efk.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               efb.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bnv.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bnv.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ebx::new)
   );
   public final awd<dcv> b;
   public final ecz c;
   public final iv<efk> d;
   public final efb e;
   public final bnv f;
   public final float g;
   public final int h;
   public final float i;
   public final bnv j;
   public final float k;

   public ebx(awd<dcv> $$0, ecz $$1, iv<efk> $$2, efb $$3, bnv $$4, float $$5, int $$6, float $$7, bnv $$8, float $$9) {
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
