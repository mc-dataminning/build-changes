public class csm extends cuc {
   public csm(cuc.a $$0) {
      super($$0);
   }

   @Override
   public cuh a(cuh $$0, dca $$1, bso $$2) {
      cuh $$3 = super.a($$0, $$1, $$2);
      if (!$$1.C) {
         for (int $$4 = 0; $$4 < 16; $$4++) {
            double $$5 = $$2.dz() + ($$2.et().j() - 0.5) * 16.0;
            double $$6 = aym.a($$2.dB() + (double)($$2.et().a(16) - 8), (double)$$1.J_(), (double)($$1.J_() + ((aqt)$$1).k() - 1));
            double $$7 = $$2.dF() + ($$2.et().j() - 0.5) * 16.0;
            if ($$2.bW()) {
               $$2.ae();
            }

            ewu $$8 = $$2.ds();
            if ($$2.b($$5, $$6, $$7, true)) {
               $$1.a(dxv.R, $$8, dxv.a.a($$2));
               avq $$10;
               avn $$9;
               if ($$2 instanceof ceo) {
                  $$9 = avo.jC;
                  $$10 = avq.g;
               } else {
                  $$9 = avo.fm;
                  $$10 = avq.h;
               }

               $$1.a(null, $$2.dz(), $$2.dB(), $$2.dF(), $$9, $$10);
               $$2.n();
               break;
            }
         }

         if ($$2 instanceof cly $$13) {
            $$13.gI().a(this, 20);
         }
      }

      return $$3;
   }
}
