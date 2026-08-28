import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efm extends efo {
   public static final Codec<efm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efo.d.forGetter($$0x -> $$0x), bsl.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), efm.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, efm::new)
   );
   public final bsl b;
   public final efm.a c;

   public efm(float $$0, emq $$1, bsl $$2, eej $$3, efp $$4, ju<dkl> $$5, bsl $$6, efm.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public efm(efo $$0, bsl $$1, efm.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<efm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bsl.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bsl.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  azn.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bsl.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, efm.a::new)
      );
      public final bsl b;
      public final bsl c;
      public final int d;
      public final bsl e;
      public final float f;
      public final float g;

      public a(bsl $$0, bsl $$1, int $$2, bsl $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
