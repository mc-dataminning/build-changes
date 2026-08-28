public class cyb extends cyo {
   public cyb(cyo.a $$0) {
      super($$0);
   }

   @Override
   public bty a(dip $$0, cqs $$1, btx $$2) {
      cys $$3 = $$1.b($$2);
      if ($$1.cj != null) {
         if (!$$0.C) {
            int $$4 = $$1.cj.a($$3);
            $$3.a($$4, $$1, bwz.d($$2));
         }

         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awl.jw, awm.g, 1.0F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
         $$1.a(eeo.C);
      } else {
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awl.jy, awm.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
         if ($$0 instanceof aro $$5) {
            int $$6 = (int)(dfh.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dfh.a($$5, $$3, $$1);
            crm.a(new cri($$1, $$0, $$7, $$6), $$5, $$3);
         }

         $$1.b(awv.c.b(this));
         $$1.a(eeo.D);
      }

      return bty.a;
   }
}
