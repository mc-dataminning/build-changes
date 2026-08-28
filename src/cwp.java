public class cwp extends cul implements cvm {
   private static final int a = 10;

   public cwp(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      if (!$$0.x_()) {
         coh $$3 = new coh($$1, $$0, $$1.dm().a(), $$1.by().b(), $$1.dm().c());
         $$3.a($$1, $$1.dG(), $$1.dE(), 0.0F, 1.5F, 1.0F);
         $$0.b($$3);
      }

      $$0.a(null, $$1.dt(), $$1.dv(), $$1.dz(), avp.Cr, avq.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      cuq $$4 = $$1.b($$2);
      $$1.gt().a(this, 10);
      $$1.b(avz.c.b(this));
      $$4.a(1, $$1);
      return bqs.a($$4, $$0.x_());
   }

   @Override
   public cnp a(dcw $$0, jw $$1, cuq $$2, ji $$3) {
      ayw $$4 = $$0.E_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      exc $$8 = new exc($$5, $$6, $$7);
      coh $$9 = new coh($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
      $$9.i($$8);
      return $$9;
   }

   @Override
   public void a(cnp $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public cvm.a c() {
      return cvm.a.a().a(($$0, $$1) -> did.a($$0, 1.0, exc.b)).a(6.6666665F).b(1.0F).a(1051).a();
   }
}
