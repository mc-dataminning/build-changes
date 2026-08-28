import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebt extends ebv {
   public static final Codec<ebt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebv.d.forGetter($$0x -> $$0x), bqn.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), ebt.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, ebt::new)
   );
   public final bqn b;
   public final ebt.a c;

   public ebt(float $$0, eiv $$1, bqn $$2, eaq $$3, ebw $$4, jr<dgv> $$5, bqn $$6, ebt.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public ebt(ebv $$0, bqn $$1, ebt.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<ebt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bqn.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bqn.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayl.k.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bqn.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ebt.a::new)
      );
      public final bqn b;
      public final bqn c;
      public final int d;
      public final bqn e;
      public final float f;
      public final float g;

      public a(bqn $$0, bqn $$1, int $$2, bqn $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
