public abstract class cbx extends cbs implements cca {
   private static final adx<ciw> e = aea.a(cbx.class, adz.h);

   public cbx(bik<? extends cbx> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public cbx(bik<? extends cbx> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cpk $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cbx(bik<? extends cbx> $$0, biw $$1, double $$2, double $$3, double $$4, cpk $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(ciw $$0) {
      if (!$$0.a(ciz.tf) || $$0.u()) {
         this.al().b(e, $$0.c(1));
      }
   }

   protected ciw p() {
      return this.al().b(e);
   }

   @Override
   public ciw j() {
      ciw $$0 = this.p();
      return $$0.b() ? new ciw(ciz.tf) : $$0;
   }

   @Override
   protected void a_() {
      this.al().a(e, ciw.b);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      ciw $$1 = this.p();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new qs()));
      }
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      ciw $$1 = ciw.a($$0.p("Item"));
      this.a($$1);
   }
}
