public class cin extends cjc implements clb {
   public cin(cjc.a $$0) {
      super($$0);
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      cjh $$3 = $$1.b($$2);
      if ($$1.ck != null) {
         if (!$$0.B) {
            int $$4 = $$1.ck.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), apf.hP, apg.g, 1.0F, 0.4F / ($$0.D_().i() * 0.4F + 0.8F));
         $$1.a(djv.C);
      } else {
         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), apf.hR, apg.g, 0.5F, 0.4F / ($$0.D_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cns.c($$3);
            int $$6 = cns.b($$3);
            $$0.b(new cck($$1, $$0, $$6, $$5));
         }

         $$1.b(app.c.b(this));
         $$1.a(djv.D);
      }

      return bhb.a($$3, $$0.w_());
   }

   @Override
   public int c() {
      return 1;
   }
}
