public class cna extends cnj {
   private static final int a = 2400;
   private int b;

   public cna(bwb<? extends cna> $$0, dhp $$1) {
      super($$0, $$1);
      this.bw = 3;
   }

   @Override
   protected void D() {
      this.bB.a(1, new cdh(this));
      this.bB.a(1, new cdc(this, this.dV()));
      this.bB.a(2, new cdx(this, 1.0, false));
      this.bB.a(3, new cfa(this, 1.0));
      this.bB.a(7, new cdv(this, cqi.class, 8.0F));
      this.bB.a(8, new cei(this));
      this.bC.a(1, new cff(this).a());
      this.bC.a(2, new cfg<>(this, cqi.class, true));
   }

   public static bxw.a j() {
      return cnj.gt().a(bxx.s, 8.0).a(bxx.v, 0.25).a(bxx.c, 2.0);
   }

   @Override
   protected bvs.d bg() {
      return bvs.d.c;
   }

   @Override
   protected awj u() {
      return awk.iK;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.iM;
   }

   @Override
   protected awj l_() {
      return awk.iL;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.iN, 0.15F, 1.0F);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.b = $$0.h("Lifetime");
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.b);
   }

   @Override
   public void h() {
      this.aU = this.dL();
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
            this.dV().a(lv.af, this.d(0.5), this.dD(), this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
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

   public static boolean b(bwb<cna> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bwa.a($$2)) {
         return true;
      } else {
         cqi $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
