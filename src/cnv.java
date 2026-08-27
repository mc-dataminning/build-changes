public class cnv extends cpl {
   public cnv(cpl.a $$0) {
      super($$0);
   }

   @Override
   public cpq a(cpq $$0, cwe $$1, box $$2) {
      cpq $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.do() + ($$2.ef().j() - 0.5) * 16.0;
            double $$6 = awm.a($$2.dq() + (double)($$2.ef().a(16) - 8), (double)$$1.J_(), (double)($$1.J_() + ((apa)$$1).k() - 1));
            double $$7 = $$2.du() + ($$2.ef().j() - 0.5) * 16.0;
            if ($$2.bL()) {
               $$2.ac();
            }

            eov $$8 = $$2.dh();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dqr.R, $$8, dqr.a.a($$2));
               atq $$10;
               ato $$9;
               if ($$2 instanceof caw) {
                  $$9 = atp.jb;
                  $$10 = atq.g;
               } else {
                  $$9 = atp.eZ;
                  $$10 = atq.h;
               }

               $$1.a(null, $$2.do(), $$2.dq(), $$2.du(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cia $$13) {
            $$13.gq().a(this, 20);
         }
      }

      return $$3;
   }
}
