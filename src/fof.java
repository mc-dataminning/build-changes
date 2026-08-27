public class fof extends fqe<bro, faq<bro>> {
   public fof(foy.a $$0) {
      super($$0, new faq<>($$0.a(fed.n)), 0.4F);
      this.a(new fsi(this, $$0.f()));
   }

   public acq a(bro $$0) {
      return $$0.ge();
   }

   protected void a(bro $$0, eij $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b(0.8F, 0.8F, 0.8F);
   }

   protected void a(bro $$0, eij $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.D($$4);
      if ($$5 > 0.0F) {
         $$1.a(0.4F * $$5, 0.15F * $$5, 0.1F * $$5);
         $$1.a(a.f.rotationDegrees(apa.j($$5, 0.0F, 90.0F)));
         gu $$6 = $$0.di();

         for (byo $$8 : $$0.dI().a(byo.class, new eed($$6).c(2.0, 2.0, 2.0))) {
            if ($$8.fy()) {
               $$1.a(0.15F * $$5, 0.0F, 0.0F);
               break;
            }
         }
      }
   }
}
