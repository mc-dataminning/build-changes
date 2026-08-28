import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ead extends eaf {
   public static final Codec<ead> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eaf.d.forGetter($$0x -> $$0x), bpk.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), ead.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ead::new)
   );
   public final bpk b;
   public final ead.a c;

   public ead(float $$0, ehe $$1, bpk $$2, dza $$3, eag $$4, jn<dfi> $$5, bpk $$6, ead.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public ead(eaf $$0, bpk $$1, ead.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<ead.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bpk.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bpk.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  axo.k.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bpk.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ead.a::new)
      );
      public final bpk b;
      public final bpk c;
      public final int d;
      public final bpk e;
      public final float f;
      public final float g;

      public a(bpk $$0, bpk $$1, int $$2, bpk $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
