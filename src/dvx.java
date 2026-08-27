import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvx implements dvw {
   public static final Codec<Double> a = Codec.doubleRange(0.0, 1.0);
   public static final Codec<dvx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dql.i.fieldOf("blocks").forGetter($$0x -> $$0x.c),
               dqn.a.fieldOf("layers").forGetter($$0x -> $$0x.d),
               dqm.a.fieldOf("crack").forGetter($$0x -> $$0x.e),
               a.fieldOf("use_potential_placements_chance").orElse(0.35).forGetter($$0x -> $$0x.f),
               a.fieldOf("use_alternate_layer0_chance").orElse(0.0).forGetter($$0x -> $$0x.g),
               Codec.BOOL.fieldOf("placements_require_layer0_alternate").orElse(true).forGetter($$0x -> $$0x.h),
               bkz.b(1, 20).fieldOf("outer_wall_distance").orElse(blf.a(4, 5)).forGetter($$0x -> $$0x.i),
               bkz.b(1, 20).fieldOf("distribution_points").orElse(blf.a(3, 4)).forGetter($$0x -> $$0x.j),
               bkz.b(0, 10).fieldOf("point_offset").orElse(blf.a(1, 2)).forGetter($$0x -> $$0x.k),
               Codec.INT.fieldOf("min_gen_offset").orElse(-16).forGetter($$0x -> $$0x.l),
               Codec.INT.fieldOf("max_gen_offset").orElse(16).forGetter($$0x -> $$0x.n),
               a.fieldOf("noise_multiplier").orElse(0.05).forGetter($$0x -> $$0x.o),
               Codec.INT.fieldOf("invalid_blocks_threshold").forGetter($$0x -> $$0x.p)
            )
            .apply($$0, dvx::new)
   );
   public final dql c;
   public final dqn d;
   public final dqm e;
   public final double f;
   public final double g;
   public final boolean h;
   public final bkz i;
   public final bkz j;
   public final bkz k;
   public final int l;
   public final int n;
   public final double o;
   public final int p;

   public dvx(dql $$0, dqn $$1, dqm $$2, double $$3, double $$4, boolean $$5, bkz $$6, bkz $$7, bkz $$8, int $$9, int $$10, double $$11, int $$12) {
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
