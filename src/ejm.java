import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejm extends ejo {
   public static final Codec<ejm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ejo.d.forGetter($$0x -> $$0x), buf.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), ejm.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ejm::new)
   );
   public final buf b;
   public final ejm.a c;

   public ejm(float $$0, equ $$1, buf $$2, eij $$3, ejp $$4, jk<dno> $$5, buf $$6, ejm.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public ejm(ejo $$0, buf $$1, ejm.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<ejm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  buf.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  buf.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  azg.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  buf.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ejm.a::new)
      );
      public final buf b;
      public final buf c;
      public final int d;
      public final buf e;
      public final float f;
      public final float g;

      public a(buf $$0, buf $$1, int $$2, buf $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
