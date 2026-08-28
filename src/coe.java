public class coe extends coo {
   private static final int a = 2400;
   private int b;

   public coe(bwr<? extends coe> $$0, djm $$1) {
      super($$0, $$1);
      this.by = 3;
   }

   @Override
   protected void D() {
      this.bD.a(1, new cdz(this));
      this.bD.a(1, new cdu(this, this.dU()));
      this.bD.a(2, new cep(this, 1.0, false));
      this.bD.a(3, new cfs(this, 1.0));
      this.bD.a(7, new cen(this, crm.class, 8.0F));
      this.bD.a(8, new cfa(this));
      this.bE.a(1, new cfx(this).a());
      this.bE.a(2, new cfy<>(this, crm.class, true));
   }

   public static byo.a j() {
      return coo.gw().a(byp.s, 8.0).a(byp.v, 0.25).a(byp.c, 2.0);
   }

   @Override
   protected bwi.c be() {
      return bwi.c.c;
   }

   @Override
   protected awm u() {
      return awn.iN;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.iP;
   }

   @Override
   protected awm l_() {
      return awn.iO;
   }

   @Override
   protected void b(iv $$0, eat $$1) {
      this.a(awn.iQ, 0.15F, 1.0F);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.b = $$0.f("Lifetime");
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.b);
   }

   @Override
   public void h() {
      this.aV = this.dK();
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
      if (this.dU().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dU().a(ly.af, this.d(0.5), this.dC(), this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.gc()) {
            this.b++;
         }

         if (this.b >= 2400) {
            this.aq();
         }
      }
   }

   public static boolean b(bwr<coe> $$0, djn $$1, bwq $$2, iv $$3, azv $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bwq.a($$2)) {
         return true;
      } else {
         crm $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
