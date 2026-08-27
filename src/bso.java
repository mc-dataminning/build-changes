public class bso extends bsp {
   private boolean p;

   public bso(bji $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected ebd a(int $$0) {
      this.o = new ebg();
      this.o.a(true);
      return new ebd(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aA() || this.a.bb() || this.a.bN();
   }

   @Override
   protected ehn b() {
      return new ehn(this.a.dq(), (double)this.s(), this.a.dw());
   }

   @Override
   public ebb a(gw $$0, int $$1) {
      dhq $$2 = this.b.J().a(hw.a($$0.u()), hw.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).i()) {
            gw $$3 = $$0.d();

            while ($$3.v() > this.b.H_() && $$2.a_($$3).i()) {
               $$3 = $$3.d();
            }

            if ($$3.v() > this.b.H_()) {
               return super.a($$3.c(), $$1);
            }

            while ($$3.v() < this.b.aj() && $$2.a_($$3).i()) {
               $$3 = $$3.c();
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            gw $$4 = $$0.c();

            while ($$4.v() < this.b.aj() && $$2.a_($$4).e()) {
               $$4 = $$4.c();
            }

            return super.a($$4, $$1);
         }
      }
   }

   @Override
   public ebb a(biq $$0, int $$1) {
      return this.a($$0.dl(), $$1);
   }

   private int s() {
      if (this.a.aX() && this.p()) {
         int $$0 = this.a.dr();
         dfj $$1 = this.b.a_(gw.a(this.a.dq(), (double)$$0, this.a.dw()));
         int $$2 = 0;

         while ($$1.a(csw.G)) {
            $$1 = this.b.a_(gw.a(this.a.dq(), (double)(++$$0), this.a.dw()));
            if (++$$2 > 16) {
               return this.a.dr();
            }
         }

         return $$0;
      } else {
         return arw.a(this.a.ds() + 0.5);
      }
   }

   @Override
   protected void R_() {
      super.R_();
      if (this.p) {
         if (this.b.g(gw.a(this.a.dq(), this.a.ds() + 0.5, this.a.dw()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eaz $$1 = this.c.a($$0);
            if (this.b.g(new gw($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(eax $$0) {
      if ($$0 == eax.j) {
         return false;
      } else {
         return $$0 == eax.i ? false : $$0 != eax.b;
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
