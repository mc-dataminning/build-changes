import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dql extends dqn {
   public static final Codec<dql> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dqn.d.forGetter($$0x -> $$0x), bjd.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dql.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dql::new)
   );
   public final bjd b;
   public final dql.a c;

   public dql(float $$0, dxm $$1, bjd $$2, dpj $$3, dqo $$4, il<cwp> $$5, bjd $$6, dql.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dql(dqn $$0, bjd $$1, dql.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dql.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bjd.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bjd.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  atv.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bjd.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dql.a::new)
      );
      public final bjd b;
      public final bjd c;
      public final int d;
      public final bjd e;
      public final float f;
      public final float g;

      public a(bjd $$0, bjd $$1, int $$2, bjd $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
