public abstract class cdy extends cdt implements ceb {
   private static final afm<clb> e = afp.a(cdy.class, afo.h);

   public cdy(bkm<? extends cdy> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cdy(bkm<? extends cdy> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, crs $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cdy(bkm<? extends cdy> $$0, bky $$1, double $$2, double $$3, double $$4, crs $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(clb $$0) {
      if (!$$0.a(cle.tg) || $$0.u()) {
         this.al().b(e, $$0.c(1));
      }
   }

   protected clb w() {
      return this.al().b(e);
   }

   @Override
   public clb q() {
      clb $$0 = this.w();
      return $$0.b() ? new clb(cle.tg) : $$0;
   }

   @Override
   protected void b_() {
      this.al().a(e, clb.b);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      clb $$1 = this.w();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new rz()));
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      clb $$1 = clb.a($$0.p("Item"));
      this.a($$1);
   }
}
