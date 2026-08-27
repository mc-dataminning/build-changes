public class coq extends cpl {
   public coq(cpl.a $$0) {
      super($$0);
   }

   @Override
   public bml a(crz $$0) {
      cwe $$1 = $$0.q();
      ib $$2 = $$0.a();
      dme $$3 = $$1.a_($$2);
      if (!$$3.a(czh.fy) || $$3.c(dbu.c)) {
         return bml.d;
      } else if ($$1.B) {
         return bml.a;
      } else {
         dme $$4 = $$3.a(dbu.c, Boolean.valueOf(true));
         czf.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, czh.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dmj.b $$5 = dbu.b().a($$1, $$2);
         if ($$5 != null) {
            ib $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), czh.fx.o(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bml.b;
      }
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      eor $$4 = a($$0, $$1, cvn.b.a);
      if ($$4.c() == eot.a.b && $$0.a_($$4.a()).a(czh.fy)) {
         return bmm.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof apa $$5) {
            ib $$6 = $$5.a(aup.a, $$1.dj(), 100, false);
            if ($$6 != null) {
               cil $$7 = new cil($$0, $$1.do(), $$1.e(0.5), $$1.du());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dqr.K, $$7.dh(), dqr.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof apb) {
                  am.n.a((apb)$$1, $$6);
               }

               $$0.a(null, $$1.do(), $$1.dq(), $$1.du(), atp.hU, atq.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dj(), 0);
               if (!$$1.fW().d) {
                  $$3.h(1);
               }

               $$1.b(atz.c.b(this));
               $$1.a($$2, true);
               return bmm.a($$3);
            }
         }

         return bmm.b($$3);
      }
   }
}
