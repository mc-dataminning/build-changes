public class cvg extends cvt {
   public cvg(cvt.a $$0) {
      super($$0);
   }

   @Override
   public bry a(dev $$0, coh $$1, brx $$2) {
      cvx $$3 = $$1.b($$2);
      if ($$1.cs != null) {
         if (!$$0.C) {
            int $$4 = $$1.cs.a($$3);
            $$3.a($$4, $$1, buv.d($$2));
         }

         $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), awk.iX, awl.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(eaa.C);
      } else {
         $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), awk.iZ, awl.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if ($$0 instanceof arm $$5) {
            int $$6 = (int)(dbo.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dbo.a($$5, $$3, $$1);
            cpb.a(new cox($$1, $$0, $$7, $$6, $$3), $$5, $$3);
         }

         $$1.b(awu.c.b(this));
         $$1.a(eaa.D);
      }

      return bry.a;
   }
}
