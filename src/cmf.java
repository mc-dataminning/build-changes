public class cmf extends cmo {
   private static final int a = 2400;
   private int b;

   public cmf(bvi<? extends cmf> $$0, dgz $$1) {
      super($$0, $$1);
      this.bO = 3;
   }

   @Override
   protected void B() {
      this.bT.a(1, new ccp(this));
      this.bT.a(1, new cck(this, this.dW()));
      this.bT.a(2, new cdf(this, 1.0, false));
      this.bT.a(3, new cei(this, 1.0));
      this.bT.a(7, new cdd(this, cpo.class, 8.0F));
      this.bT.a(8, new cdq(this));
      this.bU.a(1, new cen(this).a());
      this.bU.a(2, new ceo<>(this, cpo.class, true));
   }

   public static bxe.a m() {
      return cmo.gt().a(bxf.s, 8.0).a(bxf.v, 0.25).a(bxf.c, 2.0);
   }

   @Override
   protected bvb.c bg() {
      return bvb.c.c;
   }

   @Override
   protected awu u() {
      return awv.iK;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.iM;
   }

   @Override
   protected awu o_() {
      return awv.iL;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.iN, 0.15F, 1.0F);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.b = $$0.h("Lifetime");
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.b);
   }

   @Override
   public void h() {
      this.aX = this.dM();
      super.h();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dW().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dW().a(ls.ae, this.d(0.5), this.dE(), this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.aj()) {
            this.b++;
         }

         if (this.b >= 2400) {
            this.at();
         }
      }
   }

   public static boolean b(bvi<cmf> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bvh.a($$2)) {
         return true;
      } else {
         cpo $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
