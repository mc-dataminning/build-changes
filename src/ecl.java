import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecl extends ecn {
   public static final Codec<ecl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecn.d.forGetter($$0x -> $$0x), bqv.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), ecl.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ecl::new)
   );
   public final bqv b;
   public final ecl.a c;

   public ecl(float $$0, ejn $$1, bqv $$2, ebi $$3, eco $$4, js<dhm> $$5, bqv $$6, ecl.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public ecl(ecn $$0, bqv $$1, ecl.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<ecl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bqv.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bqv.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayo.k.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bqv.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ecl.a::new)
      );
      public final bqv b;
      public final bqv c;
      public final int d;
      public final bqv e;
      public final float f;
      public final float g;

      public a(bqv $$0, bqv $$1, int $$2, bqv $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
