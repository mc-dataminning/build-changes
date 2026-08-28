public class clp extends cly {
   private static final int a = 2400;
   private int b;

   public clp(bus<? extends clp> $$0, dfm $$1) {
      super($$0, $$1);
      this.bN = 3;
   }

   @Override
   protected void B() {
      this.bS.a(1, new cbz(this));
      this.bS.a(1, new cbu(this, this.dV()));
      this.bS.a(2, new ccp(this, 1.0, false));
      this.bS.a(3, new cds(this, 1.0));
      this.bS.a(7, new ccn(this, cou.class, 8.0F));
      this.bS.a(8, new cda(this));
      this.bT.a(1, new cdx(this).a());
      this.bT.a(2, new cdy<>(this, cou.class, true));
   }

   public static bwo.a n() {
      return cly.gs().a(bwp.s, 8.0).a(bwp.v, 0.25).a(bwp.c, 2.0);
   }

   @Override
   protected bul.b bg() {
      return bul.b.c;
   }

   @Override
   protected awm t() {
      return awn.iq;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.is;
   }

   @Override
   protected awm n_() {
      return awn.ir;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.it, 0.15F, 1.0F);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.b = $$0.h("Lifetime");
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.b);
   }

   @Override
   public void h() {
      this.aW = this.dL();
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
            this.dV().a(ls.ac, this.d(0.5), this.dD(), this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.aj()) {
            this.b++;
         }

         if (this.b >= 2400) {
            this.at();
         }
      }
   }

   public static boolean b(bus<clp> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bur.a($$2)) {
         return true;
      } else {
         cou $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
