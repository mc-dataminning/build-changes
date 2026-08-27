import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsk extends dsm {
   public static final Codec<dsk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsm.d.forGetter($$0x -> $$0x), bkx.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dsk.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dsk::new)
   );
   public final bkx b;
   public final dsk.a c;

   public dsk(float $$0, dzl $$1, bkx $$2, dri $$3, dsn $$4, in<cyo> $$5, bkx $$6, dsk.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dsk(dsm $$0, bkx $$1, dsk.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dsk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bkx.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bkx.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  avp.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bkx.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dsk.a::new)
      );
      public final bkx b;
      public final bkx c;
      public final int d;
      public final bkx e;
      public final float f;
      public final float g;

      public a(bkx $$0, bkx $$1, int $$2, bkx $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
