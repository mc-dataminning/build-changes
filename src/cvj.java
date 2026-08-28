import java.util.List;

public class cvj extends cuj {
   private static final int a = 32;

   public cvj(cuj.a $$0) {
      super($$0);
   }

   @Override
   public cuo w() {
      cuo $$0 = super.w();
      $$0.b(kq.G, new cws(cwt.a));
      return $$0;
   }

   @Override
   public cuo a(cuo $$0, dcu $$1, btl $$2) {
      cmv $$3 = $$2 instanceof cmv ? (cmv)$$2 : null;
      if ($$3 instanceof aqu) {
         an.A.a((aqu)$$3, $$0);
      }

      if (!$$1.B) {
         cws $$4 = $$0.a(kq.G, cws.a);
         $$4.a($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$3, $$3, $$2, $$2x.e(), 1.0);
            } else {
               $$2.b($$2x);
            }
         });
      }

      if ($$3 != null) {
         $$3.b(avy.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fM()) {
         if ($$0.e()) {
            return new cuo(cur.sl);
         }

         if ($$3 != null) {
            $$3.fZ().f(new cuo(cur.sl));
         }
      }

      $$2.a(dxw.l);
      return $$0;
   }

   @Override
   public bqq a(cyd $$0) {
      dcu $$1 = $$0.q();
      jd $$2 = $$0.a();
      cmv $$3 = $$0.o();
      cuo $$4 = $$0.n();
      cws $$5 = $$4.a(kq.G, cws.a);
      dta $$6 = $$1.a_($$2);
      if ($$0.k() != ji.a && $$6.a(awd.ci) && $$5.a(cwt.a)) {
         $$1.a(null, $$2, avo.ki, avp.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cuq.a($$4, $$3, new cuo(cur.sl)));
         $$3.b(avy.c.b($$4.g()));
         if (!$$1.B) {
            aqt $$7 = (aqt)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lm.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, avo.cB, avp.e, 1.0F, 1.0F);
         $$1.a(null, dxw.z, $$2);
         $$1.b($$2, dfy.sI.o());
         return bqq.a($$1.B);
      } else {
         return bqq.e;
      }
   }

   @Override
   public int a(cuo $$0, btl $$1) {
      return 32;
   }

   @Override
   public cwm b(cuo $$0) {
      return cwm.c;
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      return cuq.a($$0, $$1, $$2);
   }

   @Override
   public String h(cuo $$0) {
      return cwq.a($$0.a(kq.G, cws.a).e(), this.a() + ".effect.");
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      cws $$4 = $$0.a(kq.G);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
