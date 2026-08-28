public abstract class cpi extends cpd implements cpl {
   private static final float d = 12.25F;
   private static final ajx<cwn> e = akb.a(cpi.class, ajz.h);

   public cpi(buq<? extends cpi> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public cpi(buq<? extends cpi> $$0, double $$1, double $$2, double $$3, fay $$4, dgg $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cpi(buq<? extends cpi> $$0, bvf $$1, fay $$2, dgg $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cwn $$0) {
      if ($$0.f()) {
         this.au().a(e, this.v());
      } else {
         this.au().a(e, $$0.c(1));
      }
   }

   @Override
   protected void aM() {
   }

   @Override
   public cwn l() {
      return this.au().a(e);
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(e, this.v());
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
         this.a(cwn.a(this.dY(), (un)$$0.p("Item")).orElse(this.v()));
      } else {
         this.a(this.v());
      }
   }

   private cwn v() {
      return new cwn(cwr.uV);
   }

   @Override
   public bvx a_(int $$0) {
      return $$0 == 0 ? bvx.a(this::l, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
