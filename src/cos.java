public class cos extends cpb {
   private static final int a = 2400;
   private static final int b = 0;
   private int c = 0;

   public cos(bxe<? extends cos> $$0, djz $$1) {
      super($$0, $$1);
      this.bA = 3;
   }

   @Override
   protected void D() {
      this.bF.a(1, new cem(this));
      this.bF.a(1, new ceh(this, this.dV()));
      this.bF.a(2, new cfc(this, 1.0, false));
      this.bF.a(3, new cgf(this, 1.0));
      this.bF.a(7, new cfa(this, crz.class, 8.0F));
      this.bF.a(8, new cfn(this));
      this.bG.a(1, new cgk(this).a());
      this.bG.a(2, new cgl<>(this, crz.class, true));
   }

   public static bzb.a j() {
      return cpb.gx().a(bzc.s, 8.0).a(bzc.v, 0.25).a(bzc.c, 2.0);
   }

   @Override
   protected bwv.c bf() {
      return bwv.c.c;
   }

   @Override
   protected awq u() {
      return awr.iN;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.iP;
   }

   @Override
   protected awq l_() {
      return awr.iO;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.iQ, 0.15F, 1.0F);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.c = $$0.b("Lifetime", 0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
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
            this.dV().a(lz.af, this.d(0.5), this.dD(), this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.gd()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.aq();
         }
      }
   }

   public static boolean b(bxe<cos> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bxd.a($$2)) {
         return true;
      } else {
         crz $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
