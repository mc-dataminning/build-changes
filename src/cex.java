public abstract class cex extends cey implements ceo {
   private static final afs<clo> b = afv.a(cex.class, afu.h);

   public cex(bkz<? extends cex> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cex(bkz<? extends cex> $$0, double $$1, double $$2, double $$3, csf $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cex(bkz<? extends cex> $$0, bll $$1, csf $$2) {
      super($$0, $$1, $$2);
   }

   public void a(clo $$0) {
      if (!$$0.a(this.s()) || $$0.u()) {
         this.an().b(b, $$0.c(1));
      }
   }

   protected abstract clj s();

   protected clo u() {
      return this.an().b(b);
   }

   @Override
   public clo q() {
      clo $$0 = this.u();
      return $$0.b() ? new clo(this.s()) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(b, clo.b);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      clo $$1 = this.u();
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
