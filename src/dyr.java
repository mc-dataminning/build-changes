import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyr extends dyt {
   public static final Codec<dyr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyt.d.forGetter($$0x -> $$0x), boz.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dyr.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dyr::new)
   );
   public final boz b;
   public final dyr.a c;

   public dyr(float $$0, efs $$1, boz $$2, dxp $$3, dyu $$4, jb<dea> $$5, boz $$6, dyr.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dyr(dyt $$0, boz $$1, dyr.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dyr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  boz.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  boz.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  axn.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  boz.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dyr.a::new)
      );
      public final boz b;
      public final boz c;
      public final int d;
      public final boz e;
      public final float f;
      public final float g;

      public a(boz $$0, boz $$1, int $$2, boz $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
