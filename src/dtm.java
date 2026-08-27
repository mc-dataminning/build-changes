import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtm extends dto {
   public static final Codec<dtm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dto.d.forGetter($$0x -> $$0x), blo.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dtm.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dtm::new)
   );
   public final blo b;
   public final dtm.a c;

   public dtm(float $$0, ean $$1, blo $$2, dsk $$3, dtp $$4, ip<czf> $$5, blo $$6, dtm.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dtm(dto $$0, blo $$1, dtm.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dtm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  blo.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  blo.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  avu.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  blo.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dtm.a::new)
      );
      public final blo b;
      public final blo c;
      public final int d;
      public final blo e;
      public final float f;
      public final float g;

      public a(blo $$0, blo $$1, int $$2, blo $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
