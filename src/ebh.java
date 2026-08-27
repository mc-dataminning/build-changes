import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebh implements eai {
   public static final Codec<ebh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avt.b(ku.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               ecj.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               eeu.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               eel.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bnk.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bnk.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ebh::new)
   );
   public final avt<dch> b;
   public final ecj c;
   public final in<eeu> d;
   public final eel e;
   public final bnk f;
   public final float g;
   public final int h;
   public final float i;
   public final bnk j;
   public final float k;

   public ebh(avt<dch> $$0, ecj $$1, in<eeu> $$2, eel $$3, bnk $$4, float $$5, int $$6, float $$7, bnk $$8, float $$9) {
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
