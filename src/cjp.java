public class cjp extends cke implements cmd {
   public cjp(cke.a $$0) {
      super($$0);
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      ckj $$3 = $$1.b($$2);
      if ($$1.ck != null) {
         if (!$$0.B) {
            int $$4 = $$1.ck.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), aqd.hR, aqe.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dkl.C);
      } else {
         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), aqd.hT, aqe.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cov.c($$3);
            int $$6 = cov.b($$3);
            $$0.b(new cdl($$1, $$0, $$6, $$5));
         }

         $$1.b(aqn.c.b(this));
         $$1.a(dkl.D);
      }

      return bic.a($$3, $$0.x_());
   }

   @Override
   public int c() {
      return 1;
   }
}
