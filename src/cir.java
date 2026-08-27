public class cir extends cjg implements clf {
   public cir(cjg.a $$0) {
      super($$0);
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      cjl $$3 = $$1.b($$2);
      if ($$1.ck != null) {
         if (!$$0.B) {
            int $$4 = $$1.ck.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), apg.hP, aph.g, 1.0F, 0.4F / ($$0.D_().i() * 0.4F + 0.8F));
         $$1.a(djn.C);
      } else {
         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), apg.hR, aph.g, 0.5F, 0.4F / ($$0.D_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cnw.c($$3);
            int $$6 = cnw.b($$3);
            $$0.b(new cco($$1, $$0, $$6, $$5));
         }

         $$1.b(apq.c.b(this));
         $$1.a(djn.D);
      }

      return bhf.a($$3, $$0.w_());
   }

   @Override
   public int c() {
      return 1;
   }
}
