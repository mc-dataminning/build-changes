public class cpn extends cqf {
   public cpn(cqf.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cqk $$0) {
      return true;
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      cqk $$3 = $$1.b($$2);
      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aty.iv, atz.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cjv $$4 = new cjv($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dE(), $$1.dC(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(aui.c.b(this));
      $$3.a(1, $$1);
      return bnd.a($$3, $$0.x_());
   }
}
