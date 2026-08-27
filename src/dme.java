import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dme extends dmg {
   public static final Codec<dme> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmg.d.forGetter($$0x -> $$0x), bft.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dme.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dme::new)
   );
   public final bft b;
   public final dme.a c;

   public dme(float $$0, dtf $$1, bft $$2, dlc $$3, dmh $$4, hi<csl> $$5, bft $$6, dme.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dme(dmg $$0, bft $$1, dme.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dme.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bft.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bft.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  aqy.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bft.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dme.a::new)
      );
      public final bft b;
      public final bft c;
      public final int d;
      public final bft e;
      public final float f;
      public final float g;

      public a(bft $$0, bft $$1, int $$2, bft $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
