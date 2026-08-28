import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eja extends ejc {
   public static final Codec<eja> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ejc.d.forGetter($$0x -> $$0x), btu.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), eja.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eja::new)
   );
   public final btu b;
   public final eja.a c;

   public eja(float $$0, eqi $$1, btu $$2, ehx $$3, ejd $$4, jj<dnc> $$5, btu $$6, eja.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public eja(ejc $$0, btu $$1, eja.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<eja.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  btu.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  btu.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayw.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  btu.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eja.a::new)
      );
      public final btu b;
      public final btu c;
      public final int d;
      public final btu e;
      public final float f;
      public final float g;

      public a(btu $$0, btu $$1, int $$2, btu $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
