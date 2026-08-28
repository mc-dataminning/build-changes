import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efn extends efp {
   public static final Codec<efn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efp.d.forGetter($$0x -> $$0x), bsm.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), efn.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, efn::new)
   );
   public final bsm b;
   public final efn.a c;

   public efn(float $$0, emr $$1, bsm $$2, eek $$3, efq $$4, ju<dkm> $$5, bsm $$6, efn.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public efn(efp $$0, bsm $$1, efn.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<efn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bsm.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bsm.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  azn.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bsm.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, efn.a::new)
      );
      public final bsm b;
      public final bsm c;
      public final int d;
      public final bsm e;
      public final float f;
      public final float g;

      public a(bsm $$0, bsm $$1, int $$2, bsm $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
