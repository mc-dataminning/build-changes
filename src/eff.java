import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eff extends efh {
   public static final Codec<eff> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efh.d.forGetter($$0x -> $$0x), bsh.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), eff.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eff::new)
   );
   public final bsh b;
   public final eff.a c;

   public eff(float $$0, emj $$1, bsh $$2, eec $$3, efi $$4, ju<dke> $$5, bsh $$6, eff.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public eff(efh $$0, bsh $$1, eff.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<eff.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bsh.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bsh.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  azn.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bsh.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eff.a::new)
      );
      public final bsh b;
      public final bsh c;
      public final int d;
      public final bsh e;
      public final float f;
      public final float g;

      public a(bsh $$0, bsh $$1, int $$2, bsh $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
