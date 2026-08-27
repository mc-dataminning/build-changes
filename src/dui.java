import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dui extends duk {
   public static final Codec<dui> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               duk.d.forGetter($$0x -> $$0x), bmf.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dui.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dui::new)
   );
   public final bmf b;
   public final dui.a c;

   public dui(float $$0, ebj $$1, bmf $$2, dtg $$3, dul $$4, ip<daa> $$5, bmf $$6, dui.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dui(duk $$0, bmf $$1, dui.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dui.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bmf.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bmf.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  awe.j.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bmf.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dui.a::new)
      );
      public final bmf b;
      public final bmf c;
      public final int d;
      public final bmf e;
      public final float f;
      public final float g;

      public a(bmf $$0, bmf $$1, int $$2, bmf $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
