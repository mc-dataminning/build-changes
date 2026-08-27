import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqu extends dqw {
   public static final Codec<dqu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dqw.d.forGetter($$0x -> $$0x), bjf.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dqu.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dqu::new)
   );
   public final bjf b;
   public final dqu.a c;

   public dqu(float $$0, dxv $$1, bjf $$2, dps $$3, dqx $$4, il<cwy> $$5, bjf $$6, dqu.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dqu(dqw $$0, bjf $$1, dqu.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dqu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bjf.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bjf.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  atx.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bjf.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dqu.a::new)
      );
      public final bjf b;
      public final bjf c;
      public final int d;
      public final bjf e;
      public final float f;
      public final float g;

      public a(bjf $$0, bjf $$1, int $$2, bjf $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
