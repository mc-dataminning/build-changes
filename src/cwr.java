public class cwr extends cwb implements cwp {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final cxu r = new cxu();
   private final cwn s;
   private final csi t;
   private final cwt u;

   public cwr(int $$0, csh $$1) {
      super(cxk.h, $$0);
      this.t = $$1.h;
      this.s = new cxy(10);
      this.u = new cyg(this, 3, 3);
      this.a($$1);
   }

   public cwr(int $$0, csh $$1, cwt $$2, cwn $$3) {
      super(cxk.h, $$0);
      this.t = $$1.h;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.c_($$1.h);
      this.a($$1);
      this.a(this);
   }

   private void a(csh $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cws(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new cxo(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cws $$2 = (cws)this.b($$0);
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
   public dak b(csi $$0, int $$1) {
      dak $$2 = dak.l;
      cxz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dak $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return dak.l;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return dak.l;
         }

         if ($$4.f()) {
            $$3.f(dak.l);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dak.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(csi $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof asc $$0) {
         asb $$1 = $$0.y();
         dep $$2 = this.u.aD_();
         dak $$3 = dpi.a($$1, $$2).map($$2x -> ((deq)$$2x.b()).a($$2, $$1.J_())).orElse(dak.l);
         this.r.a(0, $$3);
      }
   }

   public buv m() {
      return this.u;
   }

   @Override
   public void a(cwb $$0, int $$1, dak $$2) {
      this.n();
   }

   @Override
   public void a(cwb $$0, int $$1, int $$2) {
   }
}
