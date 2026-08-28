import com.mojang.serialization.MapCodec;

public class dqj extends dkd {
   public static final MapCodec<dqj> a = b(dqj::new);
   public static final dyf b = dqm.d;

   @Override
   public MapCodec<dqj> a() {
      return a;
   }

   public dqj(dxn.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dxo $$0, dgz $$1, jh $$2, cpo $$3) {
      e($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, bvb $$3) {
      if (!$$3.ce()) {
         e($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         e($$1, $$2, $$3);
      }

      return (bta)($$0.h() instanceof cvm && new dax($$4, $$5, $$0, $$6).b() ? bta.e : bta.a);
   }

   private static void e(dxo $$0, dgz $$1, jh $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(dxo $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, cxg $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bsl.a(1, 5));
      }
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dgz $$0, jh $$1) {
      double $$2 = 0.5625;
      bac $$3 = $$0.A;

      for (jm $$4 : jm.values()) {
         jh $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            jm.a $$6 = $$4.o();
            double $$7 = $$6 == jm.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == jm.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == jm.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(ln.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }
}
