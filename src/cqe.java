public abstract class cqe extends cpz implements cqh {
   private static final float d = 12.25F;
   private static final ajx<cxh> e = akb.a(cqe.class, ajz.h);

   public cqe(bvi<? extends cqe> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqe(bvi<? extends cqe> $$0, double $$1, double $$2, double $$3, fbx $$4, dgz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cqe(bvi<? extends cqe> $$0, bvy $$1, fbx $$2, dgz $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cxh $$0) {
      if ($$0.f()) {
         this.au().a(e, this.o());
      } else {
         this.au().a(e, $$0.c(1));
      }
   }

   @Override
   protected void aM() {
   }

   @Override
   public cxh f() {
      return this.au().a(e);
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(e, this.o());
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Item", this.f().a(this.dW()));
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cxh.a(this.dW(), (un)$$0.p("Item")).orElse(this.o()));
      } else {
         this.a(this.o());
      }
   }

   private cxh o() {
      return new cxh(cxl.uX);
   }

   @Override
   public bwq a_(int $$0) {
      return $$0 == 0 ? bwq.a(this::f, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
