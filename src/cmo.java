public class cmo extends cmx {
   private static final int a = 2400;
   private int b;

   public cmo(bvr<? extends cmo> $$0, dhi $$1) {
      super($$0, $$1);
      this.bO = 3;
   }

   @Override
   protected void B() {
      this.bT.a(1, new ccy(this));
      this.bT.a(1, new cct(this, this.dW()));
      this.bT.a(2, new cdo(this, 1.0, false));
      this.bT.a(3, new cer(this, 1.0));
      this.bT.a(7, new cdm(this, cpx.class, 8.0F));
      this.bT.a(8, new cdz(this));
      this.bU.a(1, new cew(this).a());
      this.bU.a(2, new cex<>(this, cpx.class, true));
   }

   public static bxn.a m() {
      return cmx.gt().a(bxo.s, 8.0).a(bxo.v, 0.25).a(bxo.c, 2.0);
   }

   @Override
   protected bvk.c bg() {
      return bvk.c.c;
   }

   @Override
   protected axe u() {
      return axf.iJ;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.iL;
   }

   @Override
   protected axe o_() {
      return axf.iK;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
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

   public static boolean b(bvr<cmo> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bvq.a($$2)) {
         return true;
      } else {
         cpx $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
