public class clm extends clv {
   private static final int b = 2400;
   private int c;

   public clm(bup<? extends clm> $$0, dff $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbw(this));
      this.bS.a(1, new cbr(this, this.dY()));
      this.bS.a(2, new ccm(this, 1.0, false));
      this.bS.a(3, new cdp(this, 1.0));
      this.bS.a(7, new cck(this, cor.class, 8.0F));
      this.bS.a(8, new ccx(this));
      this.bT.a(1, new cdu(this).a());
      this.bT.a(2, new cdv<>(this, cor.class, true));
   }

   public static bwl.a q() {
      return clv.gB().a(bwm.s, 8.0).a(bwm.v, 0.25).a(bwm.c, 2.0);
   }

   @Override
   protected bui.b bi() {
      return bui.b.c;
   }

   @Override
   protected awn w() {
      return awo.iq;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.is;
   }

   @Override
   protected awn o_() {
      return awo.ir;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.it, 0.15F, 1.0F);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aX = this.dO();
      super.l();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.dY().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dY().a(ls.ac, this.d(0.5), this.dG(), this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.gc()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.av();
         }
      }
   }

   public static boolean b(bup<clm> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (buo.a($$2)) {
         return true;
      } else {
         cor $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
