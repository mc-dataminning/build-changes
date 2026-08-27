public class cao extends cap {
   private boolean p;

   public cao(brg $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected emh a(int $$0) {
      this.o = new emn();
      this.o.a(true);
      return new emh(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aC() || this.a.bg() || this.a.bP();
   }

   @Override
   protected etf b() {
      return new etf(this.a.ds(), (double)this.s(), this.a.dy());
   }

   @Override
   public emf a(im $$0, int $$1) {
      dse $$2 = this.b.M().a(jo.a($$0.u()), jo.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).i()) {
            im $$3 = $$0.d();

            while ($$3.v() > this.b.I_() && $$2.a_($$3).i()) {
               $$3 = $$3.d();
            }

            if ($$3.v() > this.b.I_()) {
               return super.a($$3.c(), $$1);
            }

            while ($$3.v() < this.b.al() && $$2.a_($$3).i()) {
               $$3 = $$3.c();
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            im $$4 = $$0.c();

            while ($$4.v() < this.b.al() && $$2.a_($$4).e()) {
               $$4 = $$4.c();
            }

            return super.a($$4, $$1);
         }
      }
   }

   @Override
   public emf a(bql $$0, int $$1) {
      return this.a($$0.dn(), $$1);
   }

   private int s() {
      if (this.a.bc() && this.p()) {
         int $$0 = this.a.dt();
         dpy $$1 = this.b.a_(im.a(this.a.ds(), (double)$$0, this.a.dy()));
         int $$2 = 0;

         while ($$1.a(dcx.G)) {
            $$1 = this.b.a_(im.a(this.a.ds(), (double)(++$$0), this.a.dy()));
            if (++$$2 > 16) {
               return this.a.dt();
            }
         }

         return $$0;
      } else {
         return axw.a(this.a.du() + 0.5);
      }
   }

   @Override
   protected void S_() {
      super.S_();
      if (this.p) {
         if (this.b.h(im.a(this.a.ds(), this.a.du() + 0.5, this.a.dy()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            emd $$1 = this.c.a($$0);
            if (this.b.h(new im($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(emi $$0) {
      if ($$0 == emi.j) {
         return false;
      } else {
         return $$0 == emi.i ? false : $$0 != emi.b;
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
