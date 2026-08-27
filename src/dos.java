import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dos extends dou {
   public static final Codec<dos> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dou.d.forGetter($$0x -> $$0x), bie.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dos.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dos::new)
   );
   public final bie b;
   public final dos.a c;

   public dos(float $$0, dvt $$1, bie $$2, dnq $$3, dov $$4, ik<cvf> $$5, bie $$6, dos.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dos(dou $$0, bie $$1, dos.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dos.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bie.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bie.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  asy.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bie.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dos.a::new)
      );
      public final bie b;
      public final bie c;
      public final int d;
      public final bie e;
      public final float f;
      public final float g;

      public a(bie $$0, bie $$1, int $$2, bie $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
