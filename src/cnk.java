public class cnk extends cnt {
   private static final int a = 2400;
   private int b;

   public cnk(bwj<? extends cnk> $$0, dip $$1) {
      super($$0, $$1);
      this.bx = 3;
   }

   @Override
   protected void D() {
      this.bC.a(1, new cdp(this));
      this.bC.a(1, new cdk(this, this.dV()));
      this.bC.a(2, new cef(this, 1.0, false));
      this.bC.a(3, new cfi(this, 1.0));
      this.bC.a(7, new ced(this, cqs.class, 8.0F));
      this.bC.a(8, new ceq(this));
      this.bD.a(1, new cfn(this).a());
      this.bD.a(2, new cfo<>(this, cqs.class, true));
   }

   public static bye.a j() {
      return cnt.gt().a(byf.s, 8.0).a(byf.v, 0.25).a(byf.c, 2.0);
   }

   @Override
   protected bwa.d bg() {
      return bwa.d.c;
   }

   @Override
   protected awk u() {
      return awl.iK;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.iM;
   }

   @Override
   protected awk l_() {
      return awl.iL;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.iN, 0.15F, 1.0F);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.b = $$0.h("Lifetime");
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.b);
   }

   @Override
   public void h() {
      this.aV = this.dL();
      super.h();
   }

   @Override
   public void s(float $$0) {
      this.w($$0);
      super.s($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dV().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dV().a(lx.af, this.d(0.5), this.dD(), this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fZ()) {
            this.b++;
         }

         if (this.b >= 2400) {
            this.at();
         }
      }
   }

   public static boolean b(bwj<cnk> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bwi.a($$2)) {
         return true;
      } else {
         cqs $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
