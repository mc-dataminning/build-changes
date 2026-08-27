import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqm extends dqo {
   public static final Codec<dqm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dqo.d.forGetter($$0x -> $$0x), bje.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dqm.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dqm::new)
   );
   public final bje b;
   public final dqm.a c;

   public dqm(float $$0, dxn $$1, bje $$2, dpk $$3, dqp $$4, il<cwq> $$5, bje $$6, dqm.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dqm(dqo $$0, bje $$1, dqm.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dqm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bje.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bje.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  atw.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bje.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dqm.a::new)
      );
      public final bje b;
      public final bje c;
      public final int d;
      public final bje e;
      public final float f;
      public final float g;

      public a(bje $$0, bje $$1, int $$2, bje $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
