import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dob extends dod {
   public static final Codec<dob> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dod.d.forGetter($$0x -> $$0x), bht.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dob.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dob::new)
   );
   public final bht b;
   public final dob.a c;

   public dob(float $$0, dvc $$1, bht $$2, dmz $$3, doe $$4, ig<cut> $$5, bht $$6, dob.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dob(dod $$0, bht $$1, dob.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dob.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bht.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bht.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  asq.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bht.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dob.a::new)
      );
      public final bht b;
      public final bht c;
      public final int d;
      public final bht e;
      public final float f;
      public final float g;

      public a(bht $$0, bht $$1, int $$2, bht $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
