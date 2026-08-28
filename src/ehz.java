import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehz implements eha {
   public static final Codec<ehz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axs.b(ma.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               ejb.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               elm.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               elc.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               brp.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               brp.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ehz::new)
   );
   public final axs<diq> b;
   public final ejb c;
   public final jq<elm> d;
   public final elc e;
   public final brp f;
   public final float g;
   public final int h;
   public final float i;
   public final brp j;
   public final float k;

   public ehz(axs<diq> $$0, ejb $$1, jq<elm> $$2, elc $$3, brp $$4, float $$5, int $$6, float $$7, brp $$8, float $$9) {
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
