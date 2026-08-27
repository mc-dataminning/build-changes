public abstract class cel extends ceg implements ceo {
   private static final afs<clo> e = afv.a(cel.class, afu.h);

   public cel(bkz<? extends cel> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cel(bkz<? extends cel> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, csf $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cel(bkz<? extends cel> $$0, bll $$1, double $$2, double $$3, double $$4, csf $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(clo $$0) {
      if (!$$0.a(clr.tR) || $$0.u()) {
         this.an().b(e, $$0.c(1));
      }
   }

   protected clo x() {
      return this.an().b(e);
   }

   @Override
   public clo q() {
      clo $$0 = this.x();
      return $$0.b() ? new clo(clr.tR) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(e, clo.b);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      clo $$1 = this.x();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new sd()));
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      clo $$1 = clo.a($$0.p("Item"));
      this.a($$1);
   }
}
