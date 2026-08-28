import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emd implements emc {
   public static final Codec<Double> a = Codec.doubleRange(0.0, 1.0);
   public static final Codec<emd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egp.i.fieldOf("blocks").forGetter($$0x -> $$0x.c),
               egr.a.fieldOf("layers").forGetter($$0x -> $$0x.d),
               egq.a.fieldOf("crack").forGetter($$0x -> $$0x.e),
               a.fieldOf("use_potential_placements_chance").orElse(0.35).forGetter($$0x -> $$0x.f),
               a.fieldOf("use_alternate_layer0_chance").orElse(0.0).forGetter($$0x -> $$0x.g),
               Codec.BOOL.fieldOf("placements_require_layer0_alternate").orElse(true).forGetter($$0x -> $$0x.h),
               btl.b(1, 20).fieldOf("outer_wall_distance").orElse(btr.a(4, 5)).forGetter($$0x -> $$0x.i),
               btl.b(1, 20).fieldOf("distribution_points").orElse(btr.a(3, 4)).forGetter($$0x -> $$0x.j),
               btl.b(0, 10).fieldOf("point_offset").orElse(btr.a(1, 2)).forGetter($$0x -> $$0x.k),
               Codec.INT.fieldOf("min_gen_offset").orElse(-16).forGetter($$0x -> $$0x.l),
               Codec.INT.fieldOf("max_gen_offset").orElse(16).forGetter($$0x -> $$0x.n),
               a.fieldOf("noise_multiplier").orElse(0.05).forGetter($$0x -> $$0x.o),
               Codec.INT.fieldOf("invalid_blocks_threshold").forGetter($$0x -> $$0x.p)
            )
            .apply($$0, emd::new)
   );
   public final egp c;
   public final egr d;
   public final egq e;
   public final double f;
   public final double g;
   public final boolean h;
   public final btl i;
   public final btl j;
   public final btl k;
   public final int l;
   public final int n;
   public final double o;
   public final int p;

   public emd(egp $$0, egr $$1, egq $$2, double $$3, double $$4, boolean $$5, btl $$6, btl $$7, btl $$8, int $$9, int $$10, double $$11, int $$12) {
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
