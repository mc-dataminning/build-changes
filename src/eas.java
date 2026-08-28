import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eas extends eau {
   public static final Codec<eas> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eau.d.forGetter($$0x -> $$0x), bpt.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), eas.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eas::new)
   );
   public final bpt b;
   public final eas.a c;

   public eas(float $$0, eht $$1, bpt $$2, dzp $$3, eav $$4, jq<dfw> $$5, bpt $$6, eas.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public eas(eau $$0, bpt $$1, eas.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<eas.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bpt.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bpt.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  axv.k.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bpt.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eas.a::new)
      );
      public final bpt b;
      public final bpt c;
      public final int d;
      public final bpt e;
      public final float f;
      public final float g;

      public a(bpt $$0, bpt $$1, int $$2, bpt $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
