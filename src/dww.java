import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dww extends dwy {
   public static final Codec<dww> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwy.d.forGetter($$0x -> $$0x), bni.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dww.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dww::new)
   );
   public final bni b;
   public final dww.a c;

   public dww(float $$0, edx $$1, bni $$2, dvu $$3, dwz $$4, ir<dch> $$5, bni $$6, dww.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dww(dwy $$0, bni $$1, dww.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dww.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bni.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bni.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  awu.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bni.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dww.a::new)
      );
      public final bni b;
      public final bni c;
      public final int d;
      public final bni e;
      public final float f;
      public final float g;

      public a(bni $$0, bni $$1, int $$2, bni $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
