public abstract class ccn extends cco implements cce {
   private static final aec<cja> b = aef.a(ccn.class, aee.h);

   public ccn(bip<? extends ccn> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public ccn(bip<? extends ccn> $$0, double $$1, double $$2, double $$3, cpq $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public ccn(bip<? extends ccn> $$0, bjb $$1, cpq $$2) {
      super($$0, $$1, $$2);
   }

   public void a(cja $$0) {
      if (!$$0.a(this.m()) || $$0.u()) {
         this.al().b(b, $$0.c(1));
      }
   }

   protected abstract civ m();

   protected cja o() {
      return this.al().b(b);
   }

   @Override
   public cja j() {
      cja $$0 = this.o();
      return $$0.b() ? new cja(this.m()) : $$0;
   }

   @Override
   protected void a_() {
      this.al().a(b, cja.b);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      cja $$1 = this.o();
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
