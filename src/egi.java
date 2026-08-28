import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egi extends egk {
   public static final Codec<egi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egk.d.forGetter($$0x -> $$0x), bst.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), egi.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, egi::new)
   );
   public final bst b;
   public final egi.a c;

   public egi(float $$0, enn $$1, bst $$2, eff $$3, egl $$4, jw<dku> $$5, bst $$6, egi.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public egi(egk $$0, bst $$1, egi.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<egi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bst.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bst.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ays.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bst.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, egi.a::new)
      );
      public final bst b;
      public final bst c;
      public final int d;
      public final bst e;
      public final float f;
      public final float g;

      public a(bst $$0, bst $$1, int $$2, bst $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
