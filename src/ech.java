import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ech extends ecj {
   public static final Codec<ech> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecj.d.forGetter($$0x -> $$0x), bqs.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), ech.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ech::new)
   );
   public final bqs b;
   public final ech.a c;

   public ech(float $$0, ejj $$1, bqs $$2, ebe $$3, eck $$4, jr<dhj> $$5, bqs $$6, ech.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public ech(ecj $$0, bqs $$1, ech.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<ech.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bqs.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bqs.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  aym.k.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bqs.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ech.a::new)
      );
      public final bqs b;
      public final bqs c;
      public final int d;
      public final bqs e;
      public final float f;
      public final float g;

      public a(bqs $$0, bqs $$1, int $$2, bqs $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
