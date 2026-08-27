import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eaj implements eai {
   public static final Codec<Double> a = Codec.doubleRange(0.0, 1.0);
   public static final Codec<eaj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dux.i.fieldOf("blocks").forGetter($$0x -> $$0x.c),
               duz.a.fieldOf("layers").forGetter($$0x -> $$0x.d),
               duy.a.fieldOf("crack").forGetter($$0x -> $$0x.e),
               a.fieldOf("use_potential_placements_chance").orElse(0.35).forGetter($$0x -> $$0x.f),
               a.fieldOf("use_alternate_layer0_chance").orElse(0.0).forGetter($$0x -> $$0x.g),
               Codec.BOOL.fieldOf("placements_require_layer0_alternate").orElse(true).forGetter($$0x -> $$0x.h),
               bnk.b(1, 20).fieldOf("outer_wall_distance").orElse(bnq.a(4, 5)).forGetter($$0x -> $$0x.i),
               bnk.b(1, 20).fieldOf("distribution_points").orElse(bnq.a(3, 4)).forGetter($$0x -> $$0x.j),
               bnk.b(0, 10).fieldOf("point_offset").orElse(bnq.a(1, 2)).forGetter($$0x -> $$0x.k),
               Codec.INT.fieldOf("min_gen_offset").orElse(-16).forGetter($$0x -> $$0x.l),
               Codec.INT.fieldOf("max_gen_offset").orElse(16).forGetter($$0x -> $$0x.n),
               a.fieldOf("noise_multiplier").orElse(0.05).forGetter($$0x -> $$0x.o),
               Codec.INT.fieldOf("invalid_blocks_threshold").forGetter($$0x -> $$0x.p)
            )
            .apply($$0, eaj::new)
   );
   public final dux c;
   public final duz d;
   public final duy e;
   public final double f;
   public final double g;
   public final boolean h;
   public final bnk i;
   public final bnk j;
   public final bnk k;
   public final int l;
   public final int n;
   public final double o;
   public final int p;

   public eaj(dux $$0, duz $$1, duy $$2, double $$3, double $$4, boolean $$5, bnk $$6, bnk $$7, bnk $$8, int $$9, int $$10, double $$11, int $$12) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
      this.k = $$8;
      this.l = $$9;
      this.n = $$10;
      this.o = $$11;
      this.p = $$12;
   }
}
