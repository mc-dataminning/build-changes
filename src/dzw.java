import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzw extends dzy {
   public static final Codec<dzw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzy.d.forGetter($$0x -> $$0x), bpg.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dzw.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dzw::new)
   );
   public final bpg b;
   public final dzw.a c;

   public dzw(float $$0, egx $$1, bpg $$2, dyt $$3, dzz $$4, jn<dff> $$5, bpg $$6, dzw.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dzw(dzy $$0, bpg $$1, dzw.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dzw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bpg.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bpg.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  axm.k.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bpg.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dzw.a::new)
      );
      public final bpg b;
      public final bpg c;
      public final int d;
      public final bpg e;
      public final float f;
      public final float g;

      public a(bpg $$0, bpg $$1, int $$2, bpg $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
