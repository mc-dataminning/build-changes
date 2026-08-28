import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eip extends eir {
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eir.d.forGetter($$0x -> $$0x), btj.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), eip.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eip::new)
   );
   public final btj b;
   public final eip.a c;

   public eip(float $$0, epu $$1, btj $$2, ehm $$3, eis $$4, jj<dmr> $$5, btj $$6, eip.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public eip(eir $$0, btj $$1, eip.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<eip.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  btj.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  btj.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayu.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  btj.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eip.a::new)
      );
      public final btj b;
      public final btj c;
      public final int d;
      public final btj e;
      public final float f;
      public final float g;

      public a(btj $$0, btj $$1, int $$2, btj $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
