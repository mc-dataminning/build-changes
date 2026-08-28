import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edc implements edb {
   public static final Codec<Double> a = Codec.doubleRange(0.0, 1.0);
   public static final Codec<edc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxq.i.fieldOf("blocks").forGetter($$0x -> $$0x.c),
               dxs.a.fieldOf("layers").forGetter($$0x -> $$0x.d),
               dxr.a.fieldOf("crack").forGetter($$0x -> $$0x.e),
               a.fieldOf("use_potential_placements_chance").orElse(0.35).forGetter($$0x -> $$0x.f),
               a.fieldOf("use_alternate_layer0_chance").orElse(0.0).forGetter($$0x -> $$0x.g),
               Codec.BOOL.fieldOf("placements_require_layer0_alternate").orElse(true).forGetter($$0x -> $$0x.h),
               bpy.b(1, 20).fieldOf("outer_wall_distance").orElse(bqe.a(4, 5)).forGetter($$0x -> $$0x.i),
               bpy.b(1, 20).fieldOf("distribution_points").orElse(bqe.a(3, 4)).forGetter($$0x -> $$0x.j),
               bpy.b(0, 10).fieldOf("point_offset").orElse(bqe.a(1, 2)).forGetter($$0x -> $$0x.k),
               Codec.INT.fieldOf("min_gen_offset").orElse(-16).forGetter($$0x -> $$0x.l),
               Codec.INT.fieldOf("max_gen_offset").orElse(16).forGetter($$0x -> $$0x.n),
               a.fieldOf("noise_multiplier").orElse(0.05).forGetter($$0x -> $$0x.o),
               Codec.INT.fieldOf("invalid_blocks_threshold").forGetter($$0x -> $$0x.p)
            )
            .apply($$0, edc::new)
   );
   public final dxq c;
   public final dxs d;
   public final dxr e;
   public final double f;
   public final double g;
   public final boolean h;
   public final bpy i;
   public final bpy j;
   public final bpy k;
   public final int l;
   public final int n;
   public final double o;
   public final int p;

   public edc(dxq $$0, dxs $$1, dxr $$2, double $$3, double $$4, boolean $$5, bpy $$6, bpy $$7, bpy $$8, int $$9, int $$10, double $$11, int $$12) {
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
