import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class don extends dop {
   public static final Codec<don> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dop.d.forGetter($$0x -> $$0x), bia.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), don.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, don::new)
   );
   public final bia b;
   public final don.a c;

   public don(float $$0, dvo $$1, bia $$2, dnl $$3, doq $$4, ig<cva> $$5, bia $$6, don.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public don(dop $$0, bia $$1, don.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<don.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bia.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bia.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  asu.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bia.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, don.a::new)
      );
      public final bia b;
      public final bia c;
      public final int d;
      public final bia e;
      public final float f;
      public final float g;

      public a(bia $$0, bia $$1, int $$2, bia $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
