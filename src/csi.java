public class csi extends crs implements csg {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final ctk r = new ctk();
   private final cse s;
   private final cor t;
   private final csk u;

   public csi(int $$0, coq $$1) {
      super(ctb.h, $$0);
      this.t = $$1.k;
      this.s = new cto(10);
      this.u = new ctw(this, 3, 3);
      this.a($$1);
   }

   public csi(int $$0, coq $$1, csk $$2, cse $$3) {
      super(ctb.h, $$0);
      this.t = $$1.k;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.d_($$1.k);
      this.a($$1);
      this.a(this);
   }

   private void a(coq $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new csj(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new ctf(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      csj $$2 = (csj)this.b($$0);
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
   public cwf b(cor $$0, int $$1) {
      cwf $$2 = cwf.k;
      ctp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwf $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cwf.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cwf.k;
         }

         if ($$4.f()) {
            $$3.f(cwf.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwf.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cor $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof arr $$0) {
         dff $$1 = $$0.dY();
         dai $$2 = this.u.aC_();
         cwf $$3 = dkc.a($$1, $$2).map($$2x -> ((daj)$$2x.b()).a($$2, $$1.H_())).orElse(cwf.k);
         this.r.a(0, $$3);
      }
   }

   public bsa m() {
      return this.u;
   }

   @Override
   public void a(crs $$0, int $$1, cwf $$2) {
      this.n();
   }

   @Override
   public void a(crs $$0, int $$1, int $$2) {
   }
}
