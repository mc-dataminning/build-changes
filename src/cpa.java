public abstract class cpa extends cov implements cpd {
   private static final float e = 12.25F;
   private static final akl<cwb> f = akp.a(cpa.class, akn.h);

   public cpa(bul<? extends cpa> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cpa(bul<? extends cpa> $$0, double $$1, double $$2, double $$3, ezn $$4, dfb $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cpa(bul<? extends cpa> $$0, bva $$1, ezn $$2, dfb $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cwb $$0) {
      if ($$0.f()) {
         this.aw().a(f, this.w());
      } else {
         this.aw().a(f, $$0.c(1));
      }
   }

   @Override
   public cwb m() {
      return this.aw().a(f);
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(f, this.w());
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Item", this.m().a(this.dZ()));
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cwb.a(this.dZ(), (vh)$$0.p("Item")).orElse(this.w()));
      } else {
         this.a(this.w());
      }
   }

   private cwb w() {
      return new cwb(cwf.tY);
   }

   @Override
   public bvs a_(int $$0) {
      return $$0 == 0 ? bvs.a(this::m, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return this.ag < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
