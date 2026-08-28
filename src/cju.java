public class cju extends ckd {
   private static final int b = 2400;
   private int c;

   public cju(bta<? extends cju> $$0, dby $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void z() {
      this.bS.a(1, new cah(this));
      this.bS.a(1, new cac(this, this.dP()));
      this.bS.a(2, new cax(this, 1.0, false));
      this.bS.a(3, new cca(this, 1.0));
      this.bS.a(7, new cav(this, cmx.class, 8.0F));
      this.bS.a(8, new cbi(this));
      this.bT.a(1, new ccf(this).a());
      this.bT.a(2, new ccg<>(this, cmx.class, true));
   }

   public static buw.a s() {
      return ckd.gw().a(bux.q, 8.0).a(bux.r, 0.25).a(bux.c, 2.0);
   }

   @Override
   protected bsu.b bb() {
      return bsu.b.c;
   }

   @Override
   protected avz v() {
      return awa.ip;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.ir;
   }

   @Override
   protected avz o_() {
      return awa.iq;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(awa.is, 0.15F, 1.0F);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aY = this.dF();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.dP().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dP().a(li.ac, this.d(0.5), this.dx(), this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fW()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.ao();
         }
      }
   }

   public static boolean b(bta<cju> $$0, dbz $$1, btt $$2, iz $$3, azh $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cmx $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}
