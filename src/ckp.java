public class ckp extends cle implements cnd {
   public ckp(cle.a $$0) {
      super($$0);
   }

   @Override
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      clj $$3 = $$1.b($$2);
      if ($$1.ck != null) {
         if (!$$0.B) {
            int $$4 = $$1.ck.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), aqr.ij, aqs.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dls.C);
      } else {
         $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), aqr.il, aqs.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cpw.c($$3);
            int $$6 = cpw.b($$3);
            $$0.b(new cei($$1, $$0, $$6, $$5));
         }

         $$1.b(arb.c.b(this));
         $$1.a(dls.D);
      }

      return biy.a($$3, $$0.x_());
   }

   @Override
   public int c() {
      return 1;
   }
}
