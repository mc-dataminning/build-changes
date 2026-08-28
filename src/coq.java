public class coq extends coz {
   private static final int a = 2400;
   private static final int b = 0;
   private int c = 0;

   public coq(bxc<? extends coq> $$0, djx $$1) {
      super($$0, $$1);
      this.bA = 3;
   }

   @Override
   protected void D() {
      this.bF.a(1, new cek(this));
      this.bF.a(1, new cef(this, this.dV()));
      this.bF.a(2, new cfa(this, 1.0, false));
      this.bF.a(3, new cgd(this, 1.0));
      this.bF.a(7, new cey(this, crx.class, 8.0F));
      this.bF.a(8, new cfl(this));
      this.bG.a(1, new cgi(this).a());
      this.bG.a(2, new cgj<>(this, crx.class, true));
   }

   public static byz.a j() {
      return coz.gx().a(bza.s, 8.0).a(bza.v, 0.25).a(bza.c, 2.0);
   }

   @Override
   protected bwt.c bf() {
      return bwt.c.c;
   }

   @Override
   protected awo u() {
      return awp.iN;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.iP;
   }

   @Override
   protected awo l_() {
      return awp.iO;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.iQ, 0.15F, 1.0F);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.c = $$0.b("Lifetime", 0);
   }

   @Override
   public void b(tz $$0) {
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
            this.dV().a(ly.af, this.d(0.5), this.dD(), this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
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

   public static boolean b(bxc<coq> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bxb.a($$2)) {
         return true;
      } else {
         crx $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }
}
