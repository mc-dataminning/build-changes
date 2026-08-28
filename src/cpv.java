public abstract class cpv extends cpw implements cpl {
   private static final ajx<cwn> a = akb.a(cpv.class, ajz.h);

   public cpv(buq<? extends cpv> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public cpv(buq<? extends cpv> $$0, double $$1, double $$2, double $$3, dgg $$4, cwn $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a($$5);
   }

   public cpv(buq<? extends cpv> $$0, bvf $$1, dgg $$2, cwn $$3) {
      this($$0, $$1.dB(), $$1.dF() - 0.1F, $$1.dH(), $$2, $$3);
      this.c($$1);
   }

   public void a(cwn $$0) {
      this.au().a(a, $$0.c(1));
   }

   protected abstract cwj m();

   @Override
   public cwn l() {
      return this.au().a(a);
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(a, new cwn(this.m()));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Item", this.l().a(this.dY()));
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cwn.a(this.dY(), (un)$$0.p("Item")).orElseGet(() -> new cwn(this.m())));
      } else {
         this.a(new cwn(this.m()));
      }
   }
}
