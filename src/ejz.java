import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejz implements eja {
   public static final Codec<ejz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayk.b(mb.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               elb.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               eno.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               ene.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bso.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bso.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ejz::new)
   );
   public final ayk<dkm> b;
   public final elb c;
   public final jq<eno> d;
   public final ene e;
   public final bso f;
   public final float g;
   public final int h;
   public final float i;
   public final bso j;
   public final float k;

   public ejz(ayk<dkm> $$0, elb $$1, jq<eno> $$2, ene $$3, bso $$4, float $$5, int $$6, float $$7, bso $$8, float $$9) {
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
