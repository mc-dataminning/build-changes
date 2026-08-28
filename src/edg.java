import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edg extends edi {
   public static final Codec<edg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edi.d.forGetter($$0x -> $$0x), brk.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), edg.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, edg::new)
   );
   public final brk b;
   public final edg.a c;

   public edg(float $$0, eki $$1, brk $$2, ecd $$3, edj $$4, ju<dij> $$5, brk $$6, edg.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public edg(edi $$0, brk $$1, edg.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<edg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  brk.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  brk.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayw.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  brk.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, edg.a::new)
      );
      public final brk b;
      public final brk c;
      public final int d;
      public final brk e;
      public final float f;
      public final float g;

      public a(brk $$0, brk $$1, int $$2, brk $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
