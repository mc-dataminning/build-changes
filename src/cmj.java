public class cmj extends cms {
   private static final int a = 2400;
   private int b;

   public cmj(bvm<? extends cmj> $$0, dha $$1) {
      super($$0, $$1);
      this.bO = 3;
   }

   @Override
   protected void B() {
      this.bT.a(1, new cct(this));
      this.bT.a(1, new cco(this, this.dV()));
      this.bT.a(2, new cdj(this, 1.0, false));
      this.bT.a(3, new cem(this, 1.0));
      this.bT.a(7, new cdh(this, cps.class, 8.0F));
      this.bT.a(8, new cdu(this));
      this.bU.a(1, new cer(this).a());
      this.bU.a(2, new ces<>(this, cps.class, true));
   }

   public static bxi.a m() {
      return cms.gr().a(bxj.s, 8.0).a(bxj.v, 0.25).a(bxj.c, 2.0);
   }

   @Override
   protected bvf.b bg() {
      return bvf.b.c;
   }

   @Override
   protected axe u() {
      return axf.iI;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.iK;
   }

   @Override
   protected axe o_() {
      return axf.iJ;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.iL, 0.15F, 1.0F);
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
      this.aX = this.dL();
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
      if (this.dV().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dV().a(ls.ad, this.d(0.5), this.dD(), this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
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

   public static boolean b(bvm<cmj> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bvl.a($$2)) {
         return true;
      } else {
         cps $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
