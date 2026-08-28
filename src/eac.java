import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eac extends eae {
   public static final Codec<eac> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eae.d.forGetter($$0x -> $$0x), bpj.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), eac.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eac::new)
   );
   public final bpj b;
   public final eac.a c;

   public eac(float $$0, ehd $$1, bpj $$2, dyz $$3, eaf $$4, jn<dfh> $$5, bpj $$6, eac.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public eac(eae $$0, bpj $$1, eac.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<eac.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bpj.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bpj.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  axo.k.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bpj.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eac.a::new)
      );
      public final bpj b;
      public final bpj c;
      public final int d;
      public final bpj e;
      public final float f;
      public final float g;

      public a(bpj $$0, bpj $$1, int $$2, bpj $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
