public class cmj extends cms {
   private static final int a = 2400;
   private int b;

   public cmj(bvi<? extends cmj> $$0, dgz $$1) {
      super($$0, $$1);
      this.bx = 3;
   }

   @Override
   protected void D() {
      this.bC.a(1, new ccq(this));
      this.bC.a(1, new ccl(this, this.dU()));
      this.bC.a(2, new cdg(this, 1.0, false));
      this.bC.a(3, new cej(this, 1.0));
      this.bC.a(7, new cde(this, cpr.class, 8.0F));
      this.bC.a(8, new cdr(this));
      this.bD.a(1, new ceo(this).a());
      this.bD.a(2, new cep<>(this, cpr.class, true));
   }

   public static bxf.a j() {
      return cms.gv().a(bxg.s, 8.0).a(bxg.v, 0.25).a(bxg.c, 2.0);
   }

   @Override
   protected bva.c bg() {
      return bva.c.c;
   }

   @Override
   protected avz u() {
      return awa.iK;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.iM;
   }

   @Override
   protected avz l_() {
      return awa.iL;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
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
            this.dU().a(lt.af, this.d(0.5), this.dC(), this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.gb()) {
            this.b++;
         }

         if (this.b >= 2400) {
            this.at();
         }
      }
   }

   public static boolean b(bvi<cmj> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bvh.a($$2)) {
         return true;
      } else {
         cpr $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
