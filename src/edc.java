import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edc implements ecd {
   public static final Codec<edc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awm.b(lf.f).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               eee.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               egp.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               egg.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bpb.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bpb.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, edc::new)
   );
   public final awm<dea> b;
   public final eee c;
   public final ix<egp> d;
   public final egg e;
   public final bpb f;
   public final float g;
   public final int h;
   public final float i;
   public final bpb j;
   public final float k;

   public edc(awm<dea> $$0, eee $$1, ix<egp> $$2, egg $$3, bpb $$4, float $$5, int $$6, float $$7, bpb $$8, float $$9) {
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
