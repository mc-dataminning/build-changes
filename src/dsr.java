import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsr extends dst {
   public static final Codec<dsr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dst.d.forGetter($$0x -> $$0x), bkz.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dsr.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dsr::new)
   );
   public final bkz b;
   public final dsr.a c;

   public dsr(float $$0, dzs $$1, bkz $$2, drp $$3, dsu $$4, in<cys> $$5, bkz $$6, dsr.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dsr(dst $$0, bkz $$1, dsr.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dsr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bkz.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bkz.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  avq.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bkz.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dsr.a::new)
      );
      public final bkz b;
      public final bkz c;
      public final int d;
      public final bkz e;
      public final float f;
      public final float g;

      public a(bkz $$0, bkz $$1, int $$2, bkz $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
