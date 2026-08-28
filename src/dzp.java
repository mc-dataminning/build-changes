import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzp extends dzr {
   public static final Codec<dzp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzr.d.forGetter($$0x -> $$0x), bpw.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dzp.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dzp::new)
   );
   public final bpw b;
   public final dzp.a c;

   public dzp(float $$0, egq $$1, bpw $$2, dyn $$3, dzs $$4, jm<dey> $$5, bpw $$6, dzp.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dzp(dzr $$0, bpw $$1, dzp.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dzp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bpw.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bpw.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayg.k.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bpw.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dzp.a::new)
      );
      public final bpw b;
      public final bpw c;
      public final int d;
      public final bpw e;
      public final float f;
      public final float g;

      public a(bpw $$0, bpw $$1, int $$2, bpw $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
