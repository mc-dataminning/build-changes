public class clq extends clz {
   private static final int a = 2400;
   private int b;

   public clq(but<? extends clq> $$0, dgj $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void E() {
      this.bS.a(1, new cca(this));
      this.bS.a(1, new cbv(this, this.dV()));
      this.bS.a(2, new ccq(this, 1.0, false));
      this.bS.a(3, new cdt(this, 1.0));
      this.bS.a(7, new cco(this, coy.class, 8.0F));
      this.bS.a(8, new cdb(this));
      this.bT.a(1, new cdy(this).a());
      this.bT.a(2, new cdz<>(this, coy.class, true));
   }

   public static bwp.a m() {
      return clz.gx().a(bwq.s, 8.0).a(bwq.v, 0.25).a(bwq.c, 2.0);
   }

   @Override
   protected bum.c bg() {
      return bum.c.c;
   }

   @Override
   protected avz u() {
      return awa.iK;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.iM;
   }

   @Override
   protected avz o_() {
      return awa.iL;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.iN, 0.15F, 1.0F);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.b = $$0.h("Lifetime");
   }

   @Override
   public void b(tq $$0) {
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
            this.dV().a(lt.ae, this.d(0.5), this.dD(), this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
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

   public static boolean b(but<clq> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bus.a($$2)) {
         return true;
      } else {
         coy $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
