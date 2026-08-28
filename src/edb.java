import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edb implements eda {
   public static final Codec<Double> a = Codec.doubleRange(0.0, 1.0);
   public static final Codec<edb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxp.i.fieldOf("blocks").forGetter($$0x -> $$0x.c),
               dxr.a.fieldOf("layers").forGetter($$0x -> $$0x.d),
               dxq.a.fieldOf("crack").forGetter($$0x -> $$0x.e),
               a.fieldOf("use_potential_placements_chance").orElse(0.35).forGetter($$0x -> $$0x.f),
               a.fieldOf("use_alternate_layer0_chance").orElse(0.0).forGetter($$0x -> $$0x.g),
               Codec.BOOL.fieldOf("placements_require_layer0_alternate").orElse(true).forGetter($$0x -> $$0x.h),
               bpx.b(1, 20).fieldOf("outer_wall_distance").orElse(bqd.a(4, 5)).forGetter($$0x -> $$0x.i),
               bpx.b(1, 20).fieldOf("distribution_points").orElse(bqd.a(3, 4)).forGetter($$0x -> $$0x.j),
               bpx.b(0, 10).fieldOf("point_offset").orElse(bqd.a(1, 2)).forGetter($$0x -> $$0x.k),
               Codec.INT.fieldOf("min_gen_offset").orElse(-16).forGetter($$0x -> $$0x.l),
               Codec.INT.fieldOf("max_gen_offset").orElse(16).forGetter($$0x -> $$0x.n),
               a.fieldOf("noise_multiplier").orElse(0.05).forGetter($$0x -> $$0x.o),
               Codec.INT.fieldOf("invalid_blocks_threshold").forGetter($$0x -> $$0x.p)
            )
            .apply($$0, edb::new)
   );
   public final dxp c;
   public final dxr d;
   public final dxq e;
   public final double f;
   public final double g;
   public final boolean h;
   public final bpx i;
   public final bpx j;
   public final bpx k;
   public final int l;
   public final int n;
   public final double o;
   public final int p;

   public edb(dxp $$0, dxr $$1, dxq $$2, double $$3, double $$4, boolean $$5, bpx $$6, bpx $$7, bpx $$8, int $$9, int $$10, double $$11, int $$12) {
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
