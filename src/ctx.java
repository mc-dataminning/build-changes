public class ctx extends cul {
   public ctx(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      cuq $$3 = $$1.b($$2);
      if ($$1.cv != null) {
         if (!$$0.B) {
            int $$4 = $$1.cv.a($$3);
            $$3.a($$4, $$1, btn.d($$2));
         }

         $$0.a(null, $$1.dt(), $$1.dv(), $$1.dz(), avp.iW, avq.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dxz.C);
      } else {
         $$0.a(null, $$1.dt(), $$1.dv(), $$1.dz(), avp.iY, avq.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if ($$0 instanceof aqu $$5) {
            int $$6 = (int)(dae.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dae.a($$5, $$3, $$1);
            $$0.b(new cnl($$1, $$0, $$7, $$6));
         }

         $$1.b(avz.c.b(this));
         $$1.a(dxz.D);
      }

      return bqs.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
