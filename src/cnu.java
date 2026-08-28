public class cnu extends cod {
   private static final int a = 2400;
   private int b;

   public cnu(bwo<? extends cnu> $$0, dja $$1) {
      super($$0, $$1);
      this.by = 3;
   }

   @Override
   protected void D() {
      this.bD.a(1, new cdu(this));
      this.bD.a(1, new cdp(this, this.dV()));
      this.bD.a(2, new cek(this, 1.0, false));
      this.bD.a(3, new cfn(this, 1.0));
      this.bD.a(7, new cei(this, crc.class, 8.0F));
      this.bD.a(8, new cev(this));
      this.bE.a(1, new cfs(this).a());
      this.bE.a(2, new cft<>(this, crc.class, true));
   }

   public static byj.a j() {
      return cod.gu().a(byk.s, 8.0).a(byk.v, 0.25).a(byk.c, 2.0);
   }

   @Override
   protected bwf.d bg() {
      return bwf.d.c;
   }

   @Override
   protected awm u() {
      return awn.iN;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.iP;
   }

   @Override
   protected awm l_() {
      return awn.iO;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.iQ, 0.15F, 1.0F);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.b = $$0.h("Lifetime");
   }

   @Override
   public void b(tz $$0) {
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
         if (!this.ga()) {
            this.b++;
         }

         if (this.b >= 2400) {
            this.at();
         }
      }
   }

   public static boolean b(bwo<cnu> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bwn.a($$2)) {
         return true;
      } else {
         crc $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
