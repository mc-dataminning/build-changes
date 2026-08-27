import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duk extends dum {
   public static final Codec<duk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dum.d.forGetter($$0x -> $$0x), bmg.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), duk.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, duk::new)
   );
   public final bmg b;
   public final duk.a c;

   public duk(float $$0, ebl $$1, bmg $$2, dti $$3, dun $$4, ip<dac> $$5, bmg $$6, duk.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public duk(dum $$0, bmg $$1, duk.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<duk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bmg.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bmg.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  awe.j.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bmg.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, duk.a::new)
      );
      public final bmg b;
      public final bmg c;
      public final int d;
      public final bmg e;
      public final float f;
      public final float g;

      public a(bmg $$0, bmg $$1, int $$2, bmg $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
