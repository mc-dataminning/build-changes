import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record csq(int c, float d, boolean e) implements czn {
   public static final Codec<csq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azd.l.fieldOf("nutrition").forGetter(csq::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(csq::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(csq::c)
            )
            .apply($$0, csq::new)
   );
   public static final zi<wv, csq> b = zi.a(zg.h, csq::a, zg.l, csq::b, zg.b, csq::c, csq::new);

   @Override
   public void a(dgz $$0, bvx $$1, cxg $$2, czm $$3) {
      bac $$4 = $$1.dZ();
      $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), $$3.e().a(), aww.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof cpo $$5) {
         $$5.gt().a(this);
         $$0.a(null, $$5.dB(), $$5.dD(), $$5.dH(), awv.uJ, aww.h, 0.5F, azu.b($$4, 0.9F, 1.0F));
      }
   }

   public int a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;

      public csq.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public csq.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public csq.a a() {
         this.c = true;
         return this;
      }

      public csq b() {
         float $$0 = cso.a(this.a, this.b);
         return new csq(this.a, $$0, this.c);
      }
   }
}
