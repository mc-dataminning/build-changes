public class cec extends cfu {
   public cec(cfu.a $$0) {
      super($$0);
   }

   @Override
   public cfz a(cfz $$0, cmm $$1, bfz $$2) {
      cfz $$3 = super.a($$0, $$1, $$2);
      if (!$$1.B) {
         double $$4 = $$2.dn();
         double $$5 = $$2.dp();
         double $$6 = $$2.dt();

         for (int $$7 = 0; $$7 < 16; $$7++) {
            double $$8 = $$2.dn() + ($$2.ec().j() - 0.5) * 16.0;
            double $$9 = apa.a($$2.dp() + (double)($$2.ec().a(16) - 8), (double)$$1.C_(), (double)($$1.C_() + ((aif)$$1).j() - 1));
            double $$10 = $$2.dt() + ($$2.ec().j() - 0.5) * 16.0;
            if ($$2.bM()) {
               $$2.Y();
            }

            eei $$11 = $$2.dg();
            if ($$2.b($$8, $$9, $$10, true)) {
               $$1.a(dgl.S, $$11, dgl.a.a($$2));
               amg $$12 = $$2 instanceof brv ? amh.ii : amh.eA;
               $$1.a(null, $$4, $$5, $$6, $$12, ami.h, 1.0F, 1.0F);
               $$2.a($$12, 1.0F, 1.0F);
               break;
            }
         }

         if ($$2 instanceof byo) {
            ((byo)$$2).gi().a(this, 20);
         }
      }

      return $$3;
   }
}
