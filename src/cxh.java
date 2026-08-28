public class cxh extends cxu {
   public cxh(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      cxy $$3 = $$1.b($$2);
      if ($$1.ci != null) {
         if (!$$0.C) {
            int $$4 = $$1.ci.a($$3);
            $$3.a($$4, $$1, bwr.d($$2));
         }

         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awk.jw, awl.g, 1.0F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
         $$1.a(edm.C);
      } else {
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awk.jy, awl.g, 0.5F, 0.4F / ($$0.C_().i() * 0.4F + 0.8F));
         if ($$0 instanceof arn $$5) {
            int $$6 = (int)(dej.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dej.a($$5, $$3, $$1);
            crb.a(new cqx($$1, $$0, $$7, $$6), $$5, $$3);
         }

         $$1.b(awu.c.b(this));
         $$1.a(edm.D);
      }

      return btq.a;
   }
}
