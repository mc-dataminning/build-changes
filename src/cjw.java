public class cjw extends ckf {
   private static final int b = 2400;
   private int c;

   public cjw(btc<? extends cjw> $$0, dca $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void z() {
      this.bS.a(1, new caj(this));
      this.bS.a(1, new cae(this, this.dP()));
      this.bS.a(2, new caz(this, 1.0, false));
      this.bS.a(3, new ccc(this, 1.0));
      this.bS.a(7, new cax(this, cmz.class, 8.0F));
      this.bS.a(8, new cbk(this));
      this.bT.a(1, new cch(this).a());
      this.bT.a(2, new cci<>(this, cmz.class, true));
   }

   public static buy.a s() {
      return ckf.gw().a(buz.q, 8.0).a(buz.r, 0.25).a(buz.c, 2.0);
   }

   @Override
   protected bsw.b bb() {
      return bsw.b.c;
   }

   @Override
   protected avz v() {
      return awa.ip;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.ir;
   }

   @Override
   protected avz o_() {
      return awa.iq;
   }

   @Override
   protected void b(iz $$0, dse $$1) {
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

   public static boolean b(btc<cjw> $$0, dcb $$1, btv $$2, iz $$3, azh $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cmz $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}
