import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyp extends dyr {
   public static final Codec<dyp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyr.d.forGetter($$0x -> $$0x), box.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dyp.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dyp::new)
   );
   public final box b;
   public final dyp.a c;

   public dyp(float $$0, efq $$1, box $$2, dxn $$3, dys $$4, jb<ddy> $$5, box $$6, dyp.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dyp(dyr $$0, box $$1, dyp.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dyp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  box.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  box.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  axm.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  box.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dyp.a::new)
      );
      public final box b;
      public final box c;
      public final int d;
      public final box e;
      public final float f;
      public final float g;

      public a(box $$0, box $$1, int $$2, box $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
