public class bsq extends bsr {
   private boolean p;

   public bsq(bjk $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected ebf a(int $$0) {
      this.o = new ebi();
      this.o.a(true);
      return new ebf(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aA() || this.a.bb() || this.a.bN();
   }

   @Override
   protected ehp b() {
      return new ehp(this.a.dq(), (double)this.s(), this.a.dw());
   }

   @Override
   public ebd a(gw $$0, int $$1) {
      if (this.b.a_($$0).i()) {
         gw $$2 = $$0.d();

         while ($$2.v() > this.b.H_() && this.b.a_($$2).i()) {
            $$2 = $$2.d();
         }

         if ($$2.v() > this.b.H_()) {
            return super.a($$2.c(), $$1);
         }

         while ($$2.v() < this.b.aj() && this.b.a_($$2).i()) {
            $$2 = $$2.c();
         }

         $$0 = $$2;
      }

      if (!this.b.a_($$0).e()) {
         return super.a($$0, $$1);
      } else {
         gw $$3 = $$0.c();

         while ($$3.v() < this.b.aj() && this.b.a_($$3).e()) {
            $$3 = $$3.c();
         }

         return super.a($$3, $$1);
      }
   }

   @Override
   public ebd a(bis $$0, int $$1) {
      return this.a($$0.dl(), $$1);
   }

   private int s() {
      if (this.a.aX() && this.p()) {
         int $$0 = this.a.dr();
         dfl $$1 = this.b.a_(gw.a(this.a.dq(), (double)$$0, this.a.dw()));
         int $$2 = 0;

         while ($$1.a(csy.G)) {
            $$1 = this.b.a_(gw.a(this.a.dq(), (double)(++$$0), this.a.dw()));
            if (++$$2 > 16) {
               return this.a.dr();
            }
         }

         return $$0;
      } else {
         return ary.a(this.a.ds() + 0.5);
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
            ebb $$1 = this.c.a($$0);
            if (this.b.g(new gw($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(eaz $$0) {
      if ($$0 == eaz.j) {
         return false;
      } else {
         return $$0 == eaz.i ? false : $$0 != eaz.b;
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
