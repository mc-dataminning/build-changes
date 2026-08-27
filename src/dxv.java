import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxv extends dxx {
   public static final Codec<dxv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxx.d.forGetter($$0x -> $$0x), bop.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dxv.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dxv::new)
   );
   public final bop b;
   public final dxv.a c;

   public dxv(float $$0, eew $$1, bop $$2, dwt $$3, dxy $$4, ja<dde> $$5, bop $$6, dxv.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dxv(dxx $$0, bop $$1, dxv.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dxv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bop.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bop.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  axh.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bop.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dxv.a::new)
      );
      public final bop b;
      public final bop c;
      public final int d;
      public final bop e;
      public final float f;
      public final float g;

      public a(bop $$0, bop $$1, int $$2, bop $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
