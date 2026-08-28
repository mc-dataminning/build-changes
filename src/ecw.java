import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecw extends ecy {
   public static final Codec<ecw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecy.d.forGetter($$0x -> $$0x), brb.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), ecw.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ecw::new)
   );
   public final brb b;
   public final ecw.a c;

   public ecw(float $$0, ejy $$1, brb $$2, ebt $$3, ecz $$4, jt<dhy> $$5, brb $$6, ecw.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public ecw(ecy $$0, brb $$1, ecw.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<ecw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  brb.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  brb.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ays.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  brb.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ecw.a::new)
      );
      public final brb b;
      public final brb c;
      public final int d;
      public final brb e;
      public final float f;
      public final float g;

      public a(brb $$0, brb $$1, int $$2, brb $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
