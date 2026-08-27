import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djg extends dji {
   public static final Codec<djg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dji.d.forGetter($$0x -> $$0x), bda.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), djg.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, djg::new)
   );
   public final bda b;
   public final djg.a c;

   public djg(float $$0, dqh $$1, bda $$2, die $$3, djj $$4, hi<cpn> $$5, bda $$6, djg.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public djg(dji $$0, bda $$1, djg.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<djg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bda.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bda.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  aoi.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bda.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, djg.a::new)
      );
      public final bda b;
      public final bda c;
      public final int d;
      public final bda e;
      public final float f;
      public final float g;

      public a(bda $$0, bda $$1, int $$2, bda $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
