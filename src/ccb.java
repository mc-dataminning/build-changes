public abstract class ccb extends cbw implements cce {
   private static final aec<cja> e = aef.a(ccb.class, aee.h);

   public ccb(bip<? extends ccb> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public ccb(bip<? extends ccb> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cpq $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public ccb(bip<? extends ccb> $$0, bjb $$1, double $$2, double $$3, double $$4, cpq $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cja $$0) {
      if (!$$0.a(cjd.tf) || $$0.u()) {
         this.al().b(e, $$0.c(1));
      }
   }

   protected cja p() {
      return this.al().b(e);
   }

   @Override
   public cja j() {
      cja $$0 = this.p();
      return $$0.b() ? new cja(cjd.tf) : $$0;
   }

   @Override
   protected void a_() {
      this.al().a(e, cja.b);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      cja $$1 = this.p();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new qu()));
      }
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      cja $$1 = cja.a($$0.p("Item"));
      this.a($$1);
   }
}
