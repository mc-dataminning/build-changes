public class cjr extends clj {
   public cjr(clj.a $$0) {
      super($$0);
   }

   @Override
   public clo a(clo $$0, csf $$1, bll $$2) {
      clo $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.ds() + ($$2.eh().j() - 0.5) * 16.0;
            double $$6 = atq.a($$2.du() + (double)($$2.eh().a(16) - 8), (double)$$1.J_(), (double)($$1.J_() + ((ami)$$1).j() - 1));
            double $$7 = $$2.dy() + ($$2.eh().j() - 0.5) * 16.0;
            if ($$2.bO()) {
               $$2.ac();
            }

            ejz $$8 = $$2.dl();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dlx.R, $$8, dlx.a.a($$2));
               aqw $$10;
               aqu $$9;
               if ($$2 instanceof bxg) {
                  $$9 = aqv.iC;
                  $$10 = aqw.g;
               } else {
                  $$9 = aqv.eA;
                  $$10 = aqw.h;
               }

               $$1.a(null, $$2.ds(), $$2.du(), $$2.dy(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cdz $$13) {
            $$13.go().a(this, 20);
         }
      }

      return $$3;
   }
}
