public abstract class ceg extends ceb implements cej {
   private static final afo<clj> e = afr.a(ceg.class, afq.h);

   public ceg(bku<? extends ceg> $$0, csa $$1) {
      super($$0, $$1);
   }

   public ceg(bku<? extends ceg> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, csa $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public ceg(bku<? extends ceg> $$0, blg $$1, double $$2, double $$3, double $$4, csa $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(clj $$0) {
      if (!$$0.a(clm.tR) || $$0.u()) {
         this.an().b(e, $$0.c(1));
      }
   }

   protected clj x() {
      return this.an().b(e);
   }

   @Override
   public clj q() {
      clj $$0 = this.x();
      return $$0.b() ? new clj(clm.tR) : $$0;
   }

   @Override
   protected void b_() {
      this.an().a(e, clj.b);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      clj $$1 = this.x();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new rz()));
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      clj $$1 = clj.a($$0.p("Item"));
      this.a($$1);
   }
}
