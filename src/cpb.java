public class cpb extends cpk {
   private static final int a = 2400;
   private static final int b = 0;
   private int c = 0;

   public cpb(bxn<? extends cpb> $$0, dkj $$1) {
      super($$0, $$1);
      this.bA = 3;
   }

   @Override
   protected void C() {
      this.bF.a(1, new cev(this));
      this.bF.a(1, new ceq(this, this.dV()));
      this.bF.a(2, new cfl(this, 1.0, false));
      this.bF.a(3, new cgo(this, 1.0));
      this.bF.a(7, new cfj(this, csi.class, 8.0F));
      this.bF.a(8, new cfw(this));
      this.bG.a(1, new cgt(this).a());
      this.bG.a(2, new cgu<>(this, csi.class, true));
   }

   public static bzk.a m() {
      return cpk.gA().a(bzl.s, 8.0).a(bzl.v, 0.25).a(bzl.c, 2.0);
   }

   @Override
   protected bxe.c bf() {
      return bxe.c.c;
   }

   @Override
   protected awx s() {
      return awy.iN;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.iP;
   }

   @Override
   protected awx j_() {
      return awy.iO;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.iQ, 0.15F, 1.0F);
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
   public void g() {
      this.aV = this.dL();
      super.g();
   }

   @Override
   public void s(float $$0) {
      this.w($$0);
      super.s($$0);
   }

   @Override
   public void d_() {
      super.d_();
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

   public static boolean b(bxn<cpb> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bxm.a($$2)) {
         return true;
      } else {
         csi $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
