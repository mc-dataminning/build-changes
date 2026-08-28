import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efl extends efn {
   public static final Codec<efl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efn.d.forGetter($$0x -> $$0x), bsb.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), efl.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, efl::new)
   );
   public final bsb b;
   public final efl.a c;

   public efl(float $$0, emq $$1, bsb $$2, eei $$3, efo $$4, jv<dke> $$5, bsb $$6, efl.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public efl(efn $$0, bsb $$1, efl.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<efl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bsb.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bsb.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayi.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bsb.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, efl.a::new)
      );
      public final bsb b;
      public final bsb c;
      public final int d;
      public final bsb e;
      public final float f;
      public final float g;

      public a(bsb $$0, bsb $$1, int $$2, bsb $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
