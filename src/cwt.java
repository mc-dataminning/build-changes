public class cwt extends cxg {
   public cwt(cxg.a $$0) {
      super($$0);
   }

   @Override
   public bte a(dha $$0, cps $$1, btd $$2) {
      cxk $$3 = $$1.b($$2);
      if ($$1.cv != null) {
         if (!$$0.C) {
            int $$4 = $$1.cv.a($$3);
            $$3.a($$4, $$1, bwb.d($$2));
         }

         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), axf.jp, axg.g, 1.0F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
         $$1.a(ecj.C);
      } else {
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), axf.jr, axg.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
         if ($$0 instanceof ash $$5) {
            int $$6 = (int)(ddt.b($$5, $$3, $$1) * 20.0F);
            int $$7 = ddt.a($$5, $$3, $$1);
            cql.a(new cqh($$1, $$0, $$7, $$6, $$3), $$5, $$3);
         }

         $$1.b(axp.c.b(this));
         $$1.a(ecj.D);
      }

      return bte.a;
   }
}
