import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cqt(int c, float d, boolean e) implements cyc {
   public static final Codec<cqt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aym.k.fieldOf("nutrition").forGetter(cqt::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(cqt::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cqt::c)
            )
            .apply($$0, cqt::new)
   );
   public static final zb<wo, cqt> b = zb.a(yz.g, cqt::a, yz.i, cqt::b, yz.b, cqt::c, cqt::new);

   @Override
   public void a(deg $$0, buk $$1, cvp $$2, cyb $$3) {
      azl $$4 = $$1.dV();
      $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), $$3.e().a(), awf.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof cnu $$5) {
         $$5.gm().a(this);
         $$0.a(null, $$5.dx(), $$5.dz(), $$5.dD(), awe.uk, awf.h, 0.5F, azd.b($$4, 0.9F, 1.0F));
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

      public cqt.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cqt.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cqt.a a() {
         this.c = true;
         return this;
      }

      public cqt b() {
         float $$0 = cqr.a(this.a, this.b);
         return new cqt(this.a, $$0, this.c);
      }
   }
}
