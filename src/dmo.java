import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmo extends dmq {
   public static final Codec<dmo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmq.d.forGetter($$0x -> $$0x), bgb.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dmo.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dmo::new)
   );
   public final bgb b;
   public final dmo.a c;

   public dmo(float $$0, dtp $$1, bgb $$2, dlm $$3, dmr $$4, hk<csv> $$5, bgb $$6, dmo.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dmo(dmq $$0, bgb $$1, dmo.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dmo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bgb.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bgb.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  arg.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bgb.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dmo.a::new)
      );
      public final bgb b;
      public final bgb c;
      public final int d;
      public final bgb e;
      public final float f;
      public final float g;

      public a(bgb $$0, bgb $$1, int $$2, bgb $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
