public class cme extends cmt implements cot {
   public cme(cmt.a $$0) {
      super($$0);
   }

   @Override
   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      cmy $$3 = $$1.b($$2);
      if ($$1.ck != null) {
         if (!$$0.B) {
            int $$4 = $$1.ck.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), ars.is, art.g, 1.0F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         $$1.a(dnr.C);
      } else {
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), ars.iu, art.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = crl.c($$3);
            int $$6 = crl.b($$3);
            $$0.b(new cfw($$1, $$0, $$6, $$5));
         }

         $$1.b(asc.c.b(this));
         $$1.a(dnr.D);
      }

      return bkc.a($$3, $$0.y_());
   }

   @Override
   public int c() {
      return 1;
   }
}
