import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmf extends dmh {
   public static final Codec<dmf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmh.d.forGetter($$0x -> $$0x), bft.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dmf.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dmf::new)
   );
   public final bft b;
   public final dmf.a c;

   public dmf(float $$0, dtg $$1, bft $$2, dld $$3, dmi $$4, hi<csm> $$5, bft $$6, dmf.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dmf(dmh $$0, bft $$1, dmf.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dmf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bft.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bft.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  aqy.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bft.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dmf.a::new)
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
