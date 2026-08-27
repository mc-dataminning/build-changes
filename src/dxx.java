import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxx implements dxw {
   public static final Codec<Double> a = Codec.doubleRange(0.0, 1.0);
   public static final Codec<dxx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsl.i.fieldOf("blocks").forGetter($$0x -> $$0x.c),
               dsn.a.fieldOf("layers").forGetter($$0x -> $$0x.d),
               dsm.a.fieldOf("crack").forGetter($$0x -> $$0x.e),
               a.fieldOf("use_potential_placements_chance").orElse(0.35).forGetter($$0x -> $$0x.f),
               a.fieldOf("use_alternate_layer0_chance").orElse(0.0).forGetter($$0x -> $$0x.g),
               Codec.BOOL.fieldOf("placements_require_layer0_alternate").orElse(true).forGetter($$0x -> $$0x.h),
               bmi.b(1, 20).fieldOf("outer_wall_distance").orElse(bmo.a(4, 5)).forGetter($$0x -> $$0x.i),
               bmi.b(1, 20).fieldOf("distribution_points").orElse(bmo.a(3, 4)).forGetter($$0x -> $$0x.j),
               bmi.b(0, 10).fieldOf("point_offset").orElse(bmo.a(1, 2)).forGetter($$0x -> $$0x.k),
               Codec.INT.fieldOf("min_gen_offset").orElse(-16).forGetter($$0x -> $$0x.l),
               Codec.INT.fieldOf("max_gen_offset").orElse(16).forGetter($$0x -> $$0x.n),
               a.fieldOf("noise_multiplier").orElse(0.05).forGetter($$0x -> $$0x.o),
               Codec.INT.fieldOf("invalid_blocks_threshold").forGetter($$0x -> $$0x.p)
            )
            .apply($$0, dxx::new)
   );
   public final dsl c;
   public final dsn d;
   public final dsm e;
   public final double f;
   public final double g;
   public final boolean h;
   public final bmi i;
   public final bmi j;
   public final bmi k;
   public final int l;
   public final int n;
   public final double o;
   public final int p;

   public dxx(dsl $$0, dsn $$1, dsm $$2, double $$3, double $$4, boolean $$5, bmi $$6, bmi $$7, bmi $$8, int $$9, int $$10, double $$11, int $$12) {
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
