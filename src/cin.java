public abstract class cin extends cis {
   private static final bwg bF = bwm.C.n().a(0.5F).b(0.665F);

   public cin(bwm<? extends cin> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(0, new cds(this));
      this.bC.a(1, new cer(this, 2.0));
      this.bC.a(2, new cdk(this, 1.0));
      this.bC.a(3, new cfg(this, 1.25, $$0 -> $$0.a(axk.ad), false));
      this.bC.a(4, new cdx(this, 1.25));
      this.bC.a(5, new cfl(this, 1.0));
      this.bC.a(6, new ceg(this, cqy.class, 6.0F));
      this.bC.a(7, new cet(this));
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.ad);
   }

   public static byh.a q() {
      return cis.gv().a(byi.s, 10.0).a(byi.v, 0.2F);
   }

   @Override
   protected awm u() {
      return awn.gd;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.gf;
   }

   @Override
   protected awm l_() {
      return awn.ge;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.gh, 0.15F, 1.0F);
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if ($$2.a(czc.rl) && !this.n_()) {
         $$0.a(awn.gg, 1.0F, 1.0F);
         cyy $$3 = czb.a($$2, $$0, czc.rr.m());
         $$0.a($$1, $$3);
         return bub.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public bwg e(bxo $$0) {
      return this.n_() ? bF : super.e($$0);
   }
}
