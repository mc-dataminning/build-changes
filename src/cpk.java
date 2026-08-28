public abstract class cpk extends cpf implements cpn {
   private static final float d = 12.25F;
   private static final ajx<cwp> e = akb.a(cpk.class, ajz.h);

   public cpk(bur<? extends cpk> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cpk(bur<? extends cpk> $$0, double $$1, double $$2, double $$3, fba $$4, dgi $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cpk(bur<? extends cpk> $$0, bvg $$1, fba $$2, dgi $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cwp $$0) {
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
   public cwp l() {
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
         this.a(cwp.a(this.dY(), (un)$$0.p("Item")).orElse(this.v()));
      } else {
         this.a(this.v());
      }
   }

   private cwp v() {
      return new cwp(cwt.uV);
   }

   @Override
   public bvy a_(int $$0) {
      return $$0 == 0 ? bvy.a(this::l, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
