import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmd extends dmf {
   public static final Codec<dmd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmf.d.forGetter($$0x -> $$0x), bfr.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dmd.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dmd::new)
   );
   public final bfr b;
   public final dmd.a c;

   public dmd(float $$0, dte $$1, bfr $$2, dlb $$3, dmg $$4, hj<csk> $$5, bfr $$6, dmd.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dmd(dmf $$0, bfr $$1, dmd.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dmd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bfr.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bfr.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  aqw.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bfr.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dmd.a::new)
      );
      public final bfr b;
      public final bfr c;
      public final int d;
      public final bfr e;
      public final float f;
      public final float g;

      public a(bfr $$0, bfr $$1, int $$2, bfr $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
