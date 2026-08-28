public class cvx extends cwk {
   public cvx(cwk.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dgh $$0, cow $$1, bsi $$2) {
      cwo $$3 = $$1.b($$2);
      if ($$1.cw != null) {
         if (!$$0.C) {
            int $$4 = $$1.cw.a($$3);
            $$3.a($$4, $$1, bvg.d($$2));
         }

         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awa.jw, awb.g, 1.0F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
         $$1.a(ebs.C);
      } else {
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awa.jy, awb.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
         if ($$0 instanceof ard $$5) {
            int $$6 = (int)(dda.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dda.a($$5, $$3, $$1);
            cpp.a(new cpl($$1, $$0, $$7, $$6), $$5, $$3);
         }

         $$1.b(awk.c.b(this));
         $$1.a(ebs.D);
      }

      return bsj.a;
   }
}
