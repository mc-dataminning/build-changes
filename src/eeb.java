import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeb implements edc {
   public static final Codec<eeb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axf.b(lq.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               efd.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               eho.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               ehf.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bpz.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bpz.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eeb::new)
   );
   public final axf<dez> b;
   public final efd c;
   public final ji<eho> d;
   public final ehf e;
   public final bpz f;
   public final float g;
   public final int h;
   public final float i;
   public final bpz j;
   public final float k;

   public eeb(axf<dez> $$0, efd $$1, ji<eho> $$2, ehf $$3, bpz $$4, float $$5, int $$6, float $$7, bpz $$8, float $$9) {
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
