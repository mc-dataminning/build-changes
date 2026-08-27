public class cil extends cja implements ckz {
   public cil(cja.a $$0) {
      super($$0);
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      if ($$1.ck != null) {
         if (!$$0.B) {
            int $$4 = $$1.ck.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), apd.hP, ape.g, 1.0F, 0.4F / ($$0.D_().i() * 0.4F + 0.8F));
         $$1.a(djt.C);
      } else {
         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), apd.hR, ape.g, 0.5F, 0.4F / ($$0.D_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cnq.c($$3);
            int $$6 = cnq.b($$3);
            $$0.b(new cci($$1, $$0, $$6, $$5));
         }

         $$1.b(apn.c.b(this));
         $$1.a(djt.D);
      }

      return bgz.a($$3, $$0.w_());
   }

   @Override
   public int c() {
      return 1;
   }
}
