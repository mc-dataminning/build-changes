import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehk extends ehm {
   public static final Codec<ehk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehm.d.forGetter($$0x -> $$0x), btb.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), ehk.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ehk::new)
   );
   public final btb b;
   public final ehk.a c;

   public ehk(float $$0, eop $$1, btb $$2, egh $$3, ehn $$4, ji<dlu> $$5, btb $$6, ehk.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public ehk(ehm $$0, btb $$1, ehk.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<ehk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  btb.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  btb.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ays.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  btb.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ehk.a::new)
      );
      public final btb b;
      public final btb c;
      public final int d;
      public final btb e;
      public final float f;
      public final float g;

      public a(btb $$0, btb $$1, int $$2, btb $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
