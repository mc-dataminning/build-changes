import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxx implements dwy {
   public static final Codec<dxx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aut.b(ki.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dyz.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               ebk.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               ebb.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               blq.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               blq.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dxx::new)
   );
   public final aut<czf> b;
   public final dyz c;
   public final il<ebk> d;
   public final ebb e;
   public final blq f;
   public final float g;
   public final int h;
   public final float i;
   public final blq j;
   public final float k;

   public dxx(aut<czf> $$0, dyz $$1, il<ebk> $$2, ebb $$3, blq $$4, float $$5, int $$6, float $$7, blq $$8, float $$9) {
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
