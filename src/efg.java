import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efg extends efi {
   public static final Codec<efg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efi.d.forGetter($$0x -> $$0x), bsd.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), efg.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, efg::new)
   );
   public final bsd b;
   public final efg.a c;

   public efg(float $$0, emk $$1, bsd $$2, eed $$3, efj $$4, ju<dkd> $$5, bsd $$6, efg.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public efg(efi $$0, bsd $$1, efg.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<efg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bsd.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bsd.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  azd.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bsd.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, efg.a::new)
      );
      public final bsd b;
      public final bsd c;
      public final int d;
      public final bsd e;
      public final float f;
      public final float g;

      public a(bsd $$0, bsd $$1, int $$2, bsd $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
