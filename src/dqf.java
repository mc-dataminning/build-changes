import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqf extends dqh {
   public static final Codec<dqf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dqh.d.forGetter($$0x -> $$0x), biy.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dqf.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dqf::new)
   );
   public final biy b;
   public final dqf.a c;

   public dqf(float $$0, dxg $$1, biy $$2, dpd $$3, dqi $$4, il<cwj> $$5, biy $$6, dqf.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dqf(dqh $$0, biy $$1, dqf.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dqf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  biy.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  biy.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  atq.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  biy.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dqf.a::new)
      );
      public final biy b;
      public final biy c;
      public final int d;
      public final biy e;
      public final float f;
      public final float g;

      public a(biy $$0, biy $$1, int $$2, biy $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
