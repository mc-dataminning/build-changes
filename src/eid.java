import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eid extends eif {
   public static final Codec<eid> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eif.d.forGetter($$0x -> $$0x), btg.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), eid.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eid::new)
   );
   public final btg b;
   public final eid.a c;

   public eid(float $$0, epi $$1, btg $$2, eha $$3, eig $$4, ji<dmf> $$5, btg $$6, eid.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public eid(eif $$0, btg $$1, eid.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<eid.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  btg.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  btg.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayu.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  btg.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eid.a::new)
      );
      public final btg b;
      public final btg c;
      public final int d;
      public final btg e;
      public final float f;
      public final float g;

      public a(btg $$0, btg $$1, int $$2, btg $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
