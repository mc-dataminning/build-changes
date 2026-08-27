public abstract class ccj extends cck implements cca {
   private static final adx<ciw> b = aea.a(ccj.class, adz.h);

   public ccj(bik<? extends ccj> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public ccj(bik<? extends ccj> $$0, double $$1, double $$2, double $$3, cpk $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public ccj(bik<? extends ccj> $$0, biw $$1, cpk $$2) {
      super($$0, $$1, $$2);
   }

   public void a(ciw $$0) {
      if (!$$0.a(this.m()) || $$0.u()) {
         this.al().b(b, $$0.c(1));
      }
   }

   protected abstract cir m();

   protected ciw o() {
      return this.al().b(b);
   }

   @Override
   public ciw j() {
      ciw $$0 = this.o();
      return $$0.b() ? new ciw(this.m()) : $$0;
   }

   @Override
   protected void a_() {
      this.al().a(b, ciw.b);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      ciw $$1 = this.o();
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
