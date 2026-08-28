public abstract class csb extends crv implements cse {
   private static final float d = 12.25F;
   private static final akj<czn> e = akn.a(csb.class, akl.h);

   public csb(bwr<? extends csb> $$0, djm $$1) {
      super($$0, $$1);
   }

   public csb(bwr<? extends csb> $$0, double $$1, double $$2, double $$3, ffc $$4, djm $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public csb(bwr<? extends csb> $$0, bxj $$1, ffc $$2, djm $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(czn $$0) {
      if ($$0.f()) {
         this.ar().a(e, this.o());
      } else {
         this.ar().a(e, $$0.c(1));
      }
   }

   @Override
   protected void aK() {
   }

   @Override
   public czn f() {
      return this.ar().a(e);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(e, this.o());
   }

   @Override
   public void b(tz $$0) {
      ale<uw> $$1 = this.dW().a(un.a);
      $$0.a("Item", czn.b, $$1, this.f());
   }

   @Override
   public void a(tz $$0) {
      ale<uw> $$1 = this.dW().a(un.a);
      this.a($$0.<czn>a("Item", czn.b, $$1).orElse(this.o()));
   }

   private czn o() {
      return new czn(czr.vg);
   }

   @Override
   public bya a_(int $$0) {
      return $$0 == 0 ? bya.a(this::f, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
