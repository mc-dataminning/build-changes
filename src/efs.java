import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efs extends efp {
   public static final Codec<efs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efp.d.forGetter($$0x -> $$0x),
               bsm.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               bsm.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               bsm.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, efs::new)
   );
   public final bsm b;
   public final bsm c;
   final bsm j;

   public efs(float $$0, emr $$1, bsm $$2, eek $$3, efq $$4, ju<dkm> $$5, bsm $$6, bsm $$7, bsm $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public efs(float $$0, emr $$1, bsm $$2, eek $$3, ju<dkm> $$4, bsm $$5, bsm $$6, bsm $$7) {
      this($$0, $$1, $$2, $$3, efq.a, $$4, $$5, $$6, $$7);
   }

   public efs(efp $$0, bsm $$1, bsm $$2, bsm $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
