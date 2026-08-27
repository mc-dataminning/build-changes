public class cpt extends cqh {
   public cpt(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      cqm $$3 = $$1.b($$2);
      if ($$1.cr != null) {
         if (!$$0.B) {
            int $$4 = $$1.cr.a($$3);
            $$3.a($$4, $$1, bpp.d($$2));
         }

         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aty.iP, atz.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.b(drp.C);
      } else {
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aty.iR, atz.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cux.c($$3);
            int $$6 = cux.b($$3);
            $$0.b(new cji($$1, $$0, $$6, $$5));
         }

         $$1.b(aui.c.b(this));
         $$1.b(drp.D);
      }

      return bne.a($$3, $$0.x_());
   }

   @Override
   public int e() {
      return 1;
   }
}
