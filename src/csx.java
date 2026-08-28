public abstract class csx extends csr implements cta {
   private static final float d = 12.25F;
   private static final aku<dak> e = aky.a(csx.class, akw.h);

   public csx(bxn<? extends csx> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public csx(bxn<? extends csx> $$0, double $$1, double $$2, double $$3, fgc $$4, dkj $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public csx(bxn<? extends csx> $$0, byf $$1, fgc $$2, dkj $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(dak $$0) {
      if ($$0.f()) {
         this.ar().a(e, this.o());
      } else {
         this.ar().a(e, $$0.c(1));
      }
   }

   @Override
   protected void aL() {
   }

   @Override
   public dak f() {
      return this.ar().a(e);
   }

   @Override
   protected void a(aky.a $$0) {
      $$0.a(e, this.o());
   }

   @Override
   public void b(ua $$0) {
      alp<va> $$1 = this.dX().a(uo.a);
      $$0.a("Item", dak.b, $$1, this.f());
   }

   @Override
   public void a(ua $$0) {
      alp<va> $$1 = this.dX().a(uo.a);
      this.a($$0.<dak>a("Item", dak.b, $$1).orElse(this.o()));
   }

   private dak o() {
      return new dak(dao.vg);
   }

   @Override
   public byw a_(int $$0) {
      return $$0 == 0 ? byw.a(this::f, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
