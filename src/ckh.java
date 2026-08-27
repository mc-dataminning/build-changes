public class ckh extends ckw implements cmv {
   public ckh(ckw.a $$0) {
      super($$0);
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      clb $$3 = $$1.b($$2);
      if ($$1.ck != null) {
         if (!$$0.B) {
            int $$4 = $$1.ck.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), aqn.hT, aqo.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dlg.C);
      } else {
         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), aqn.hV, aqo.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cpo.c($$3);
            int $$6 = cpo.b($$3);
            $$0.b(new cea($$1, $$0, $$6, $$5));
         }

         $$1.b(aqx.c.b(this));
         $$1.a(dlg.D);
      }

      return bir.a($$3, $$0.x_());
   }

   @Override
   public int c() {
      return 1;
   }
}
