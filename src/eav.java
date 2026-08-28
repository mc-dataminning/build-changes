import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eav extends eax {
   public static final Codec<eav> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eax.d.forGetter($$0x -> $$0x), bpu.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), eav.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eav::new)
   );
   public final bpu b;
   public final eav.a c;

   public eav(float $$0, ehw $$1, bpu $$2, dzs $$3, eay $$4, jq<dfy> $$5, bpu $$6, eav.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public eav(eax $$0, bpu $$1, eav.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<eav.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bpu.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bpu.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  axw.k.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bpu.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eav.a::new)
      );
      public final bpu b;
      public final bpu c;
      public final int d;
      public final bpu e;
      public final float f;
      public final float g;

      public a(bpu $$0, bpu $$1, int $$2, bpu $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
