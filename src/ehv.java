import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehv extends ehx {
   public static final Codec<ehv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehx.d.forGetter($$0x -> $$0x), bte.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), ehv.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ehv::new)
   );
   public final bte b;
   public final ehv.a c;

   public ehv(float $$0, epa $$1, bte $$2, egs $$3, ehy $$4, ji<dma> $$5, bte $$6, ehv.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public ehv(ehx $$0, bte $$1, ehv.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<ehv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bte.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bte.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayu.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bte.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ehv.a::new)
      );
      public final bte b;
      public final bte c;
      public final int d;
      public final bte e;
      public final float f;
      public final float g;

      public a(bte $$0, bte $$1, int $$2, bte $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
