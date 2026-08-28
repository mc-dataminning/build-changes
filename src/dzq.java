import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzq extends dzs {
   public static final Codec<dzq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzs.d.forGetter($$0x -> $$0x), bpx.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dzq.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dzq::new)
   );
   public final bpx b;
   public final dzq.a c;

   public dzq(float $$0, egr $$1, bpx $$2, dyo $$3, dzt $$4, jm<dez> $$5, bpx $$6, dzq.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dzq(dzs $$0, bpx $$1, dzq.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dzq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bpx.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bpx.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayh.k.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bpx.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dzq.a::new)
      );
      public final bpx b;
      public final bpx c;
      public final int d;
      public final bpx e;
      public final float f;
      public final float g;

      public a(bpx $$0, bpx $$1, int $$2, bpx $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
