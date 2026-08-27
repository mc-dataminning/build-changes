public class coc extends cou {
   public coc(cou.a $$0) {
      super($$0);
   }

   @Override
   public blu a(cri $$0) {
      cvn $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlf $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!czc.h($$3) && !czd.g($$3) && !cze.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (cyb.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, cyb.a($$1, $$2));
            $$1.a($$0.o(), dpp.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(dlv.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), dpp.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return blu.a($$1.B);
      } else {
         return blu.e;
      }
   }

   private void a(cvn $$0, hz $$1) {
      awo $$2 = $$0.F_();
      $$0.a(null, $$1, atk.iv, atl.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
