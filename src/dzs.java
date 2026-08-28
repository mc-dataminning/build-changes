import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzs extends dzu {
   public static final Codec<dzs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzu.d.forGetter($$0x -> $$0x), bpz.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dzs.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dzs::new)
   );
   public final bpz b;
   public final dzs.a c;

   public dzs(float $$0, egt $$1, bpz $$2, dyq $$3, dzv $$4, jm<dfb> $$5, bpz $$6, dzs.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dzs(dzu $$0, bpz $$1, dzs.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dzs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bpz.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bpz.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayh.k.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bpz.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dzs.a::new)
      );
      public final bpz b;
      public final bpz c;
      public final int d;
      public final bpz e;
      public final float f;
      public final float g;

      public a(bpz $$0, bpz $$1, int $$2, bpz $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
