import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cst(int c, float d, boolean e) implements czm {
   public static final Codec<cst> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.l.fieldOf("nutrition").forGetter(cst::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(cst::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cst::c)
            )
            .apply($$0, cst::new)
   );
   public static final yn<wa, cst> b = yn.a(yl.h, cst::a, yl.l, cst::b, yl.b, cst::c, cst::new);

   @Override
   public void a(dgz $$0, bvy $$1, cxh $$2, czl $$3) {
      azh $$4 = $$1.dX();
      $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), $$3.e().a(), awb.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof cpr $$5) {
         $$5.gw().a(this);
         $$0.a(null, $$5.dz(), $$5.dB(), $$5.dF(), awa.uT, awb.h, 0.5F, ayz.b($$4, 0.9F, 1.0F));
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

      public cst.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cst.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cst.a a() {
         this.c = true;
         return this;
      }

      public cst b() {
         float $$0 = csr.a(this.a, this.b);
         return new cst(this.a, $$0, this.c);
      }
   }
}
