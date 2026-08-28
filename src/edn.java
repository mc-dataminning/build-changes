import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edn extends edp {
   public static final Codec<edn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edp.d.forGetter($$0x -> $$0x), brn.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), edn.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, edn::new)
   );
   public final brn b;
   public final edn.a c;

   public edn(float $$0, ekp $$1, brn $$2, eck $$3, edq $$4, ju<diq> $$5, brn $$6, edn.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public edn(edp $$0, brn $$1, edn.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<edn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  brn.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  brn.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  ayv.l.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  brn.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, edn.a::new)
      );
      public final brn b;
      public final brn c;
      public final int d;
      public final brn e;
      public final float f;
      public final float g;

      public a(brn $$0, brn $$1, int $$2, brn $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
