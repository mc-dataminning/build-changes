public class cpr extends cqf {
   public cpr(cqf.a $$0) {
      super($$0);
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      cqk $$3 = $$1.b($$2);
      if ($$1.cr != null) {
         if (!$$0.B) {
            int $$4 = $$1.cr.a($$3);
            $$3.a($$4, $$1, bpo.d($$2));
         }

         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aty.iL, atz.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.b(drn.C);
      } else {
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aty.iN, atz.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cuv.c($$3);
            int $$6 = cuv.b($$3);
            $$0.b(new cjg($$1, $$0, $$6, $$5));
         }

         $$1.b(aui.c.b(this));
         $$1.b(drn.D);
      }

      return bnd.a($$3, $$0.x_());
   }

   @Override
   public int e() {
      return 1;
   }
}
