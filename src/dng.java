import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dng extends dni {
   public static final Codec<dng> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dni.d.forGetter($$0x -> $$0x), bhe.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dng.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dng::new)
   );
   public final bhe b;
   public final dng.a c;

   public dng(float $$0, duh $$1, bhe $$2, dme $$3, dnj $$4, ig<cua> $$5, bhe $$6, dng.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dng(dni $$0, bhe $$1, dng.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dng.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bhe.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bhe.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  asg.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bhe.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dng.a::new)
      );
      public final bhe b;
      public final bhe c;
      public final int d;
      public final bhe e;
      public final float f;
      public final float g;

      public a(bhe $$0, bhe $$1, int $$2, bhe $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
