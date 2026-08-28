public abstract class cqk extends cqf implements cqn {
   private static final float d = 12.25F;
   private static final alc<cxp> e = alg.a(cqk.class, ale.h);

   public cqk(bvr<? extends cqk> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public cqk(bvr<? extends cqk> $$0, double $$1, double $$2, double $$3, fby $$4, dhi $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cqk(bvr<? extends cqk> $$0, bwg $$1, fby $$2, dhi $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cxp $$0) {
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
   public cxp l() {
      return this.au().a(e);
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(e, this.v());
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Item", this.l().a(this.dY()));
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cxp.a(this.dY(), (vu)$$0.p("Item")).orElse(this.v()));
      } else {
         this.a(this.v());
      }
   }

   private cxp v() {
      return new cxp(cxt.uM);
   }

   @Override
   public bwy a_(int $$0) {
      return $$0 == 0 ? bwy.a(this::l, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
