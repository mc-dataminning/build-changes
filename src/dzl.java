import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzl extends dzn {
   public static final Codec<dzl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzn.d.forGetter($$0x -> $$0x), bps.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dzl.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dzl::new)
   );
   public final bps b;
   public final dzl.a c;

   public dzl(float $$0, egm $$1, bps $$2, dyj $$3, dzo $$4, jm<deu> $$5, bps $$6, dzl.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dzl(dzn $$0, bps $$1, dzl.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dzl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bps.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bps.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayc.k.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bps.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dzl.a::new)
      );
      public final bps b;
      public final bps c;
      public final int d;
      public final bps e;
      public final float f;
      public final float g;

      public a(bps $$0, bps $$1, int $$2, bps $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
