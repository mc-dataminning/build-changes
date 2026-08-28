import java.util.List;

public class cvl extends cul {
   private static final int a = 32;

   public cvl(cul.a $$0) {
      super($$0);
   }

   @Override
   public cuq w() {
      cuq $$0 = super.w();
      $$0.b(kq.G, new cwu(cwv.a));
      return $$0;
   }

   @Override
   public cuq a(cuq $$0, dcw $$1, btn $$2) {
      cmx $$3 = $$2 instanceof cmx ? (cmx)$$2 : null;
      if ($$3 instanceof aqv) {
         an.A.a((aqv)$$3, $$0);
      }

      if (!$$1.B) {
         cwu $$4 = $$0.a(kq.G, cwu.a);
         $$4.a($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$3, $$3, $$2, $$2x.e(), 1.0);
            } else {
               $$2.b($$2x);
            }
         });
      }

      if ($$3 != null) {
         $$3.b(avz.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fM()) {
         if ($$0.e()) {
            return new cuq(cut.sl);
         }

         if ($$3 != null) {
            $$3.fZ().f(new cuq(cut.sl));
         }
      }

      $$2.a(dxz.l);
      return $$0;
   }

   @Override
   public bqr a(cyf $$0) {
      dcw $$1 = $$0.q();
      jd $$2 = $$0.a();
      cmx $$3 = $$0.o();
      cuq $$4 = $$0.n();
      cwu $$5 = $$4.a(kq.G, cwu.a);
      dtc $$6 = $$1.a_($$2);
      if ($$0.k() != ji.a && $$6.a(awe.ci) && $$5.a(cwv.a)) {
         $$1.a(null, $$2, avp.ki, avq.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cus.a($$4, $$3, new cuq(cut.sl)));
         $$3.b(avz.c.b($$4.g()));
         if (!$$1.B) {
            aqu $$7 = (aqu)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lm.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, avp.cB, avq.e, 1.0F, 1.0F);
         $$1.a(null, dxz.z, $$2);
         $$1.b($$2, dga.sI.o());
         return bqr.a($$1.B);
      } else {
         return bqr.e;
      }
   }

   @Override
   public int a(cuq $$0, btn $$1) {
      return 32;
   }

   @Override
   public cwo b(cuq $$0) {
      return cwo.c;
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      return cus.a($$0, $$1, $$2);
   }

   @Override
   public String h(cuq $$0) {
      return cws.a($$0.a(kq.G, cwu.a).e(), this.a() + ".effect.");
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      cwu $$4 = $$0.a(kq.G);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}
