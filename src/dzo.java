import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzo extends dzq {
   public static final Codec<dzo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzq.d.forGetter($$0x -> $$0x), bpv.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dzo.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dzo::new)
   );
   public final bpv b;
   public final dzo.a c;

   public dzo(float $$0, egp $$1, bpv $$2, dym $$3, dzr $$4, jm<dex> $$5, bpv $$6, dzo.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dzo(dzq $$0, bpv $$1, dzo.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dzo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bpv.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  bpv.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayf.k.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  bpv.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dzo.a::new)
      );
      public final bpv b;
      public final bpv c;
      public final int d;
      public final bpv e;
      public final float f;
      public final float g;

      public a(bpv $$0, bpv $$1, int $$2, bpv $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
