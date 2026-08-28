public abstract class cqj extends cqe implements cqm {
   private static final float d = 12.25F;
   private static final alc<cxo> e = alg.a(cqj.class, ale.h);

   public cqj(bvq<? extends cqj> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public cqj(bvq<? extends cqj> $$0, double $$1, double $$2, double $$3, fbx $$4, dhh $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cqj(bvq<? extends cqj> $$0, bwf $$1, fbx $$2, dhh $$3) {
      super($$0, $$1, $$2, $$3);
   }

   public void a(cxo $$0) {
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
   public cxo l() {
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
         this.a(cxo.a(this.dY(), (vu)$$0.p("Item")).orElse(this.v()));
      } else {
         this.a(this.v());
      }
   }

   private cxo v() {
      return new cxo(cxs.uM);
   }

   @Override
   public bwx a_(int $$0) {
      return $$0 == 0 ? bwx.a(this::l, this::a) : super.a_($$0);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < 12.25 ? false : super.a($$0);
   }
}
