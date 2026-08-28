public class cdx extends cdy {
   private boolean p;

   public cdx(bup $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected erj a(int $$0) {
      this.o = new erp();
      this.o.a(true);
      return new erj(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aH() || this.a.bm() || this.a.bW();
   }

   @Override
   protected eyw b() {
      return new eyw(this.a.dx(), (double)this.t(), this.a.dD());
   }

   @Override
   public erh a(jf $$0, int $$1) {
      dwy $$2 = this.b.P().a(kh.a($$0.u()), kh.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).l()) {
            jf.a $$3 = $$0.k().c(jk.a);

            while ($$3.v() > this.b.H_() && $$2.a_($$3).l()) {
               $$3.c(jk.a);
            }

            if ($$3.v() > this.b.H_()) {
               return super.a($$3.d(), $$1);
            }

            $$3.q($$0.v() + 1);

            while ($$3.v() <= this.b.an() && $$2.a_($$3).l()) {
               $$3.c(jk.b);
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            jf.a $$4 = $$0.k().c(jk.b);

            while ($$4.v() <= this.b.an() && $$2.a_($$4).e()) {
               $$4.c(jk.b);
            }

            return super.a($$4.j(), $$1);
         }
      }
   }

   @Override
   public erh a(btr $$0, int $$1) {
      return this.a($$0.ds(), $$1);
   }

   private int t() {
      if (this.a.bi() && this.q()) {
         int $$0 = this.a.dy();
         dus $$1 = this.b.a_(jf.a(this.a.dx(), (double)$$0, this.a.dD()));
         int $$2 = 0;

         while ($$1.a(dho.G)) {
            $$1 = this.b.a_(jf.a(this.a.dx(), (double)(++$$0), this.a.dD()));
            if (++$$2 > 16) {
               return this.a.dy();
            }
         }

         return $$0;
      } else {
         return azf.a(this.a.dz() + 0.5);
      }
   }

   @Override
   protected void V_() {
      super.V_();
      if (this.p) {
         if (this.b.h(jf.a(this.a.dx(), this.a.dz() + 0.5, this.a.dD()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            erf $$1 = this.c.a($$0);
            if (this.b.h(new jf($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(erk $$0) {
      if ($$0 == erk.j) {
         return false;
      } else {
         return $$0 == erk.i ? false : $$0 != erk.b;
      }
   }

   public void b(boolean $$0) {
      this.o.b($$0);
   }

   public boolean e() {
      return this.o.d();
   }

   public void c(boolean $$0) {
      this.o.a($$0);
   }

   public boolean f() {
      return this.o.d();
   }

   public void d(boolean $$0) {
      this.p = $$0;
   }

   public void e(boolean $$0) {
      this.o.d($$0);
   }
}
