import com.mojang.serialization.MapCodec;

public class dqp extends dmg {
   public static final MapCodec<dqp> a = b(dqp::new);
   public static final dyf b = dye.w;
   public static final dyn e = dye.aD;

   @Override
   public MapCodec<dqp> a() {
      return a;
   }

   protected dqp(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jm.c).b(e, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$3.gj().e) {
         return bta.e;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bta.a;
      }
   }

   @Override
   protected int h(dxo $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dxo a(dax $$0) {
      dxo $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$4 == jm.a && !this.b($$1, $$5, $$6)) {
         return dkf.a.m();
      } else {
         return !$$1.B_() && $$4.o() != $$0.c(aF).o() ? $$0.b(b, Boolean.valueOf(this.c($$1, $$3, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean c(dhc $$0, jh $$1, dxo $$2) {
      return this.a((dhr)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if ($$0.c(d)) {
         jm $$4 = $$0.c(aF);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(e) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(ln.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(aF, e, b, d);
   }
}
