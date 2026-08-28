public abstract class cpj extends cpe implements cpm {
   private static final float d = 12.25F;
   private static final ajy<cwo> e = akc.a(cpj.class, aka.h);

   public cpj(bur<? extends cpj> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public cpj(bur<? extends cpj> $$0, double $$1, double $$2, double $$3, faz $$4, dgh $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cpj(bur<? extends cpj> $$0, bvg $$1, faz $$2, dgh $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cwo $$0) {
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
   public cwo l() {
      return this.au().a(e);
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(e, this.v());
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Item", this.l().a(this.dX()));
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cwo.a(this.dX(), (un)$$0.p("Item")).orElse(this.v()));
      } else {
         this.a(this.v());
      }
   }

   private cwo v() {
      return new cwo(cws.uV);
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
