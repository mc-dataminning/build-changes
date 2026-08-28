public abstract class cok extends cof implements coo {
   private static final float e = 12.25F;
   private static final akh<cvs> f = akl.a(cok.class, akj.h);

   public cok(bty<? extends cok> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cok(bty<? extends cok> $$0, double $$1, double $$2, double $$3, eyw $$4, dej $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cok(bty<? extends cok> $$0, bun $$1, eyw $$2, dej $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cvs $$0) {
      if ($$0.f()) {
         this.at().a(f, this.w());
      } else {
         this.at().a(f, $$0.c(1));
      }
   }

   @Override
   public cvs m() {
      return this.at().a(f);
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(f, this.w());
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Item", this.m().a(this.dU()));
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cvs.a(this.dU(), (vd)$$0.p("Item")).orElse(this.w()));
      } else {
         this.a(this.w());
      }
   }

   private cvs w() {
      return new cvs(cvw.tY);
   }

   @Override
   public bve a_(int $$0) {
      return $$0 == 0 ? bve.a(this::m, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return this.ag < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
