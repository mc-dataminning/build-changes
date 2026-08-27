public class coj extends coy {
   public coj(coy.a $$0) {
      super($$0);
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      cpd $$3 = $$1.b($$2);
      if ($$1.co != null) {
         if (!$$0.B) {
            int $$4 = $$1.co.a($$3);
            $$3.a($$4, $$1, boi.d($$2));
         }

         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), atl.iI, atm.g, 1.0F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         $$1.b(dpw.C);
      } else {
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), atl.iK, atm.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = ctn.c($$3);
            int $$6 = ctn.b($$3);
            $$0.b(new chz($$1, $$0, $$6, $$5));
         }

         $$1.b(atv.c.b(this));
         $$1.b(dpw.D);
      }

      return blx.a($$3, $$0.y_());
   }

   @Override
   public int an_() {
      return 1;
   }
}
