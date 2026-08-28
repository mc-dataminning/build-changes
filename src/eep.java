import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eep extends eer {
   public static final Codec<eep> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eer.d.forGetter($$0x -> $$0x), brm.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), eep.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eep::new)
   );
   public final brm b;
   public final eep.a c;

   public eep(float $$0, elt $$1, brm $$2, edm $$3, ees $$4, jv<djm> $$5, brm $$6, eep.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public eep(eer $$0, brm $$1, eep.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<eep.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  brm.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  brm.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayi.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  brm.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eep.a::new)
      );
      public final brm b;
      public final brm c;
      public final int d;
      public final brm e;
      public final float f;
      public final float g;

      public a(brm $$0, brm $$1, int $$2, brm $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
