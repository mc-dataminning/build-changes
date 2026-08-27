import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eaq extends eas {
   public static final Codec<eaq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eas.d.forGetter($$0x -> $$0x), bpd.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), eaq.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eaq::new)
   );
   public final bpd b;
   public final eaq.a c;

   public eaq(float $$0, ehz $$1, bpd $$2, dzo $$3, eat $$4, je<dfc> $$5, bpd $$6, eaq.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public eaq(eas $$0, bpd $$1, eaq.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<eaq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bpd.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bpd.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  axu.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bpd.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eaq.a::new)
      );
      public final bpd b;
      public final bpd c;
      public final int d;
      public final bpd e;
      public final float f;
      public final float g;

      public a(bpd $$0, bpd $$1, int $$2, bpd $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
