import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmq extends dms {
   public static final Codec<dmq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dms.d.forGetter($$0x -> $$0x), bgd.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dmq.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dmq::new)
   );
   public final bgd b;
   public final dmq.a c;

   public dmq(float $$0, dtr $$1, bgd $$2, dlo $$3, dmt $$4, hk<csx> $$5, bgd $$6, dmq.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dmq(dms $$0, bgd $$1, dmq.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dmq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bgd.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bgd.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  arh.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bgd.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dmq.a::new)
      );
      public final bgd b;
      public final bgd c;
      public final int d;
      public final bgd e;
      public final float f;
      public final float g;

      public a(bgd $$0, bgd $$1, int $$2, bgd $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
