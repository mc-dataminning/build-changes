public class cvl extends cuv implements cvj {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final cwn r = new cwn();
   private final cvh s;
   private final crc t;
   private final cvn u;

   public cvl(int $$0, crb $$1) {
      super(cwe.h, $$0);
      this.t = $$1.h;
      this.s = new cwr(10);
      this.u = new cwz(this, 3, 3);
      this.a($$1);
   }

   public cvl(int $$0, crb $$1, cvn $$2, cvh $$3) {
      super(cwe.h, $$0);
      this.t = $$1.h;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.c_($$1.h);
      this.a($$1);
      this.a(this);
   }

   private void a(crb $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cvm(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new cwi(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cvm $$2 = (cvm)this.b($$0);
      this.s.a($$2.d, $$1 ? 0 : 1);
      this.d();
   }

   public boolean e(int $$0) {
      return $$0 > -1 && $$0 < 9 ? this.s.a($$0) == 1 : false;
   }

   public boolean l() {
      return this.s.a(9) == 1;
   }

   @Override
   public czd b(crc $$0, int $$1) {
      czd $$2 = czd.k;
      cws $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czd $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return czd.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return czd.k;
         }

         if ($$4.f()) {
            $$3.f(czd.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czd.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(crc $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof arr $$0) {
         arq $$1 = $$0.y();
         ddi $$2 = this.u.ay_();
         czd $$3 = dnz.a($$1, $$2).map($$2x -> ((ddj)$$2x.b()).a($$2, $$1.F_())).orElse(czd.k);
         this.r.a(0, $$3);
      }
   }

   public btw m() {
      return this.u;
   }

   @Override
   public void a(cuv $$0, int $$1, czd $$2) {
      this.n();
   }

   @Override
   public void a(cuv $$0, int $$1, int $$2) {
   }
}
