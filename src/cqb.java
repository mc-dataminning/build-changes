public abstract class cqb extends cpw implements cqe {
   private static final float d = 12.25F;
   private static final aks<cxg> e = akw.a(cqb.class, aku.h);

   public cqb(bvi<? extends cqb> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqb(bvi<? extends cqb> $$0, double $$1, double $$2, double $$3, fbr $$4, dgz $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cqb(bvi<? extends cqb> $$0, bvx $$1, fbr $$2, dgz $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cxg $$0) {
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
   public cxg l() {
      return this.au().a(e);
   }

   @Override
   protected void a(akw.a $$0) {
      $$0.a(e, this.v());
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("Item", this.l().a(this.dY()));
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cxg.a(this.dY(), (vj)$$0.p("Item")).orElse(this.v()));
      } else {
         this.a(this.v());
      }
   }

   private cxg v() {
      return new cxg(cxk.uV);
   }

   @Override
   public bwp a_(int $$0) {
      return $$0 == 0 ? bwp.a(this::l, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
