import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eay implements dzz {
   public static final Codec<eay> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avr.b(ks.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               eca.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               eel.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               eec.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bnf.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bnf.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eay::new)
   );
   public final avr<dby> b;
   public final eca c;
   public final il<eel> d;
   public final eec e;
   public final bnf f;
   public final float g;
   public final int h;
   public final float i;
   public final bnf j;
   public final float k;

   public eay(avr<dby> $$0, eca $$1, il<eel> $$2, eec $$3, bnf $$4, float $$5, int $$6, float $$7, bnf $$8, float $$9) {
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
