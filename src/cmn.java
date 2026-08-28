public class cmn extends cmw {
   private static final int a = 2400;
   private int b;

   public cmn(bvq<? extends cmn> $$0, dhh $$1) {
      super($$0, $$1);
      this.bO = 3;
   }

   @Override
   protected void B() {
      this.bT.a(1, new ccx(this));
      this.bT.a(1, new ccs(this, this.dW()));
      this.bT.a(2, new cdn(this, 1.0, false));
      this.bT.a(3, new ceq(this, 1.0));
      this.bT.a(7, new cdl(this, cpw.class, 8.0F));
      this.bT.a(8, new cdy(this));
      this.bU.a(1, new cev(this).a());
      this.bU.a(2, new cew<>(this, cpw.class, true));
   }

   public static bxm.a m() {
      return cmw.gt().a(bxn.s, 8.0).a(bxn.v, 0.25).a(bxn.c, 2.0);
   }

   @Override
   protected bvj.c bg() {
      return bvj.c.c;
   }

   @Override
   protected axe u() {
      return axf.iJ;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.iL;
   }

   @Override
   protected axe o_() {
      return axf.iK;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.iM, 0.15F, 1.0F);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.b = $$0.h("Lifetime");
   }

   @Override
   public void b(ux $$0) {
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
            this.dW().a(ls.ad, this.d(0.5), this.dE(), this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
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

   public static boolean b(bvq<cmn> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bvp.a($$2)) {
         return true;
      } else {
         cpw $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
