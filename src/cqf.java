public abstract class cqf extends cqa implements cqi {
   private static final float d = 12.25F;
   private static final alc<cxk> e = alg.a(cqf.class, ale.h);

   public cqf(bvm<? extends cqf> $$0, dha $$1) {
      super($$0, $$1);
   }

   public cqf(bvm<? extends cqf> $$0, double $$1, double $$2, double $$3, fbs $$4, dha $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cqf(bvm<? extends cqf> $$0, bwb $$1, fbs $$2, dha $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cxk $$0) {
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
   public cxk l() {
      return this.au().a(e);
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(e, this.v());
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Item", this.l().a(this.dX()));
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cxk.a(this.dX(), (vu)$$0.p("Item")).orElse(this.v()));
      } else {
         this.a(this.v());
      }
   }

   private cxk v() {
      return new cxk(cxo.uM);
   }

   @Override
   public bwt a_(int $$0) {
      return $$0 == 0 ? bwt.a(this::l, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
