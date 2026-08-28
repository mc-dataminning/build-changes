import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejc extends eje {
   public static final Codec<ejc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eje.d.forGetter($$0x -> $$0x), btw.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), ejc.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ejc::new)
   );
   public final btw b;
   public final ejc.a c;

   public ejc(float $$0, eqk $$1, btw $$2, ehz $$3, ejf $$4, jk<dne> $$5, btw $$6, ejc.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public ejc(eje $$0, btw $$1, ejc.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<ejc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  btw.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  btw.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayy.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  btw.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ejc.a::new)
      );
      public final btw b;
      public final btw c;
      public final int d;
      public final btw e;
      public final float f;
      public final float g;

      public a(btw $$0, btw $$1, int $$2, btw $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
