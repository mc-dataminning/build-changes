import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeq extends ees {
   public static final Codec<eeq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ees.d.forGetter($$0x -> $$0x), bro.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), eeq.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eeq::new)
   );
   public final bro b;
   public final eeq.a c;

   public eeq(float $$0, elu $$1, bro $$2, edn $$3, eet $$4, jv<djn> $$5, bro $$6, eeq.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public eeq(ees $$0, bro $$1, eeq.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<eeq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bro.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bro.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayi.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bro.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eeq.a::new)
      );
      public final bro b;
      public final bro c;
      public final int d;
      public final bro e;
      public final float f;
      public final float g;

      public a(bro $$0, bro $$1, int $$2, bro $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
