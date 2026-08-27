public abstract class cek extends cel implements ceb {
   private static final afm<clb> b = afp.a(cek.class, afo.h);

   public cek(bkm<? extends cek> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cek(bkm<? extends cek> $$0, double $$1, double $$2, double $$3, crs $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public cek(bkm<? extends cek> $$0, bky $$1, crs $$2) {
      super($$0, $$1, $$2);
   }

   public void a(clb $$0) {
      if (!$$0.a(this.s()) || $$0.u()) {
         this.al().b(b, $$0.c(1));
      }
   }

   protected abstract ckw s();

   protected clb t() {
      return this.al().b(b);
   }

   @Override
   public clb q() {
      clb $$0 = this.t();
      return $$0.b() ? new clb(this.s()) : $$0;
   }

   @Override
   protected void b_() {
      this.al().a(b, clb.b);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      clb $$1 = this.t();
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
