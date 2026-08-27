import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwn extends dwp {
   public static final Codec<dwn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwp.d.forGetter($$0x -> $$0x), bnd.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dwn.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dwn::new)
   );
   public final bnd b;
   public final dwn.a c;

   public dwn(float $$0, edo $$1, bnd $$2, dvl $$3, dwq $$4, ip<dby> $$5, bnd $$6, dwn.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dwn(dwp $$0, bnd $$1, dwn.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dwn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bnd.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bnd.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  aws.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bnd.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dwn.a::new)
      );
      public final bnd b;
      public final bnd c;
      public final int d;
      public final bnd e;
      public final float f;
      public final float g;

      public a(bnd $$0, bnd $$1, int $$2, bnd $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
