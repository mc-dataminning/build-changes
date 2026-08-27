import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmi extends dmk {
   public static final Codec<dmi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmk.d.forGetter($$0x -> $$0x), bgh.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dmi.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dmi::new)
   );
   public final bgh b;
   public final dmi.a c;

   public dmi(float $$0, dtj $$1, bgh $$2, dlg $$3, dml $$4, hi<ctc> $$5, bgh $$6, dmi.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dmi(dmk $$0, bgh $$1, dmi.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dmi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bgh.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bgh.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  arj.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bgh.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dmi.a::new)
      );
      public final bgh b;
      public final bgh c;
      public final int d;
      public final bgh e;
      public final float f;
      public final float g;

      public a(bgh $$0, bgh $$1, int $$2, bgh $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
