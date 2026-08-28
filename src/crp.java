public class crp extends cqz implements crn {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final csr r = new csr();
   private final crl s;
   private final cnx t;
   private final crr u;

   public crp(int $$0, cnw $$1) {
      super(csi.h, $$0);
      this.t = $$1.k;
      this.s = new csv(10);
      this.u = new ctd(this, 3, 3);
      this.a($$1);
   }

   public crp(int $$0, cnw $$1, crr $$2, crl $$3) {
      super(csi.h, $$0);
      this.t = $$1.k;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.d_($$1.k);
      this.a($$1);
      this.a(this);
   }

   private void a(cnw $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new crq(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new csm(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      crq $$2 = (crq)this.b($$0);
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
   public cvs b(cnx $$0, int $$1) {
      cvs $$2 = cvs.k;
      csw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvs $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cvs.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cvs.k;
         }

         if ($$4.f()) {
            $$3.f(cvs.k);
         } else {
            $$3.c();
         }

         if ($$4.K() == $$2.K()) {
            return cvs.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cnx $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof ark $$0) {
         dej $$1 = $$0.dS();
         czz $$2 = this.u.aD_();
         cvs $$3 = djf.a($$1, $$2).map($$2x -> ((daa)$$2x.b()).a($$2, $$1.G_())).orElse(cvs.k);
         this.r.a(0, $$3);
      }
   }

   public brl m() {
      return this.u;
   }

   @Override
   public void a(cqz $$0, int $$1, cvs $$2) {
      this.n();
   }

   @Override
   public void a(cqz $$0, int $$1, int $$2) {
   }
}
