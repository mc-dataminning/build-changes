import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edc extends ede {
   public static final Codec<edc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ede.d.forGetter($$0x -> $$0x), brg.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), edc.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, edc::new)
   );
   public final brg b;
   public final edc.a c;

   public edc(float $$0, eke $$1, brg $$2, ebz $$3, edf $$4, ju<die> $$5, brg $$6, edc.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public edc(ede $$0, brg $$1, edc.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<edc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  brg.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  brg.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayt.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  brg.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, edc.a::new)
      );
      public final brg b;
      public final brg c;
      public final int d;
      public final brg e;
      public final float f;
      public final float g;

      public a(brg $$0, brg $$1, int $$2, brg $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
