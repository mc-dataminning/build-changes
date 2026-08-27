import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpu extends dpw {
   public static final Codec<dpu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpw.d.forGetter($$0x -> $$0x), bio.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dpu.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dpu::new)
   );
   public final bio b;
   public final dpu.a c;

   public dpu(float $$0, dwv $$1, bio $$2, dos $$3, dpx $$4, ij<cvz> $$5, bio $$6, dpu.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dpu(dpw $$0, bio $$1, dpu.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dpu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bio.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bio.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  atg.i.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bio.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dpu.a::new)
      );
      public final bio b;
      public final bio c;
      public final int d;
      public final bio e;
      public final float f;
      public final float g;

      public a(bio $$0, bio $$1, int $$2, bio $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
