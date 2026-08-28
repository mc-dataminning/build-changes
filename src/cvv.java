public class cvv extends cwi {
   public cvv(cwi.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(dfm $$0, cou $$1, bsj $$2) {
      cwm $$3 = $$1.b($$2);
      if ($$1.cu != null) {
         if (!$$0.C) {
            int $$4 = $$1.cu.a($$3);
            $$3.a($$4, $$1, bvh.d($$2));
         }

         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awn.iX, awo.g, 1.0F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
         $$1.a(ear.C);
      } else {
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awn.iZ, awo.g, 0.5F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
         if ($$0 instanceof arp $$5) {
            int $$6 = (int)(dcf.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dcf.a($$5, $$3, $$1);
            cpn.a(new cpj($$1, $$0, $$7, $$6, $$3), $$5, $$3);
         }

         $$1.b(awx.c.b(this));
         $$1.a(ear.D);
      }

      return bsk.a;
   }
}
