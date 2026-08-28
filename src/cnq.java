public class cnq extends cnz {
   private static final int a = 2400;
   private int b;

   public cnq(bwm<? extends cnq> $$0, div $$1) {
      super($$0, $$1);
      this.bx = 3;
   }

   @Override
   protected void D() {
      this.bC.a(1, new cds(this));
      this.bC.a(1, new cdn(this, this.dV()));
      this.bC.a(2, new cei(this, 1.0, false));
      this.bC.a(3, new cfl(this, 1.0));
      this.bC.a(7, new ceg(this, cqy.class, 8.0F));
      this.bC.a(8, new cet(this));
      this.bD.a(1, new cfq(this).a());
      this.bD.a(2, new cfr<>(this, cqy.class, true));
   }

   public static byh.a j() {
      return cnz.gt().a(byi.s, 8.0).a(byi.v, 0.25).a(byi.c, 2.0);
   }

   @Override
   protected bwd.d bg() {
      return bwd.d.c;
   }

   @Override
   protected awm u() {
      return awn.iL;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.iN;
   }

   @Override
   protected awm l_() {
      return awn.iM;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.iO, 0.15F, 1.0F);
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
         if (!this.fZ()) {
            this.b++;
         }

         if (this.b >= 2400) {
            this.at();
         }
      }
   }

   public static boolean b(bwm<cnq> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bwl.a($$2)) {
         return true;
      } else {
         cqy $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
