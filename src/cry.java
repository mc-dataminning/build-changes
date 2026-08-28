public abstract class cry extends crs implements csb {
   private static final float d = 12.25F;
   private static final akj<czk> e = akn.a(cry.class, akl.h);

   public cry(bwr<? extends cry> $$0, djh $$1) {
      super($$0, $$1);
   }

   public cry(bwr<? extends cry> $$0, double $$1, double $$2, double $$3, fex $$4, djh $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cry(bwr<? extends cry> $$0, bxj $$1, fex $$2, djh $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(czk $$0) {
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
   public czk f() {
      return this.ar().a(e);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(e, this.o());
   }

   @Override
   public void b(tz $$0) {
      ale<uw> $$1 = this.dW().a(un.a);
      $$0.a("Item", czk.b, $$1, this.f());
   }

   @Override
   public void a(tz $$0) {
      ale<uw> $$1 = this.dW().a(un.a);
      this.a($$0.<czk>a("Item", czk.b, $$1).orElse(this.o()));
   }

   private czk o() {
      return new czk(czo.vg);
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
