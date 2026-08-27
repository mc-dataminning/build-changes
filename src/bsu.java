public class bsu extends bsv {
   private boolean p;

   public bsu(bjo $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected eax a(int $$0) {
      this.o = new eba();
      this.o.a(true);
      return new eax(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aA() || this.a.bb() || this.a.bN();
   }

   @Override
   protected ehh b() {
      return new ehh(this.a.dq(), (double)this.s(), this.a.dw());
   }

   @Override
   public eav a(gw $$0, int $$1) {
      dhk $$2 = this.b.J().a(hw.a($$0.u()), hw.a($$0.w()));
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
   public eav a(biw $$0, int $$1) {
      return this.a($$0.dl(), $$1);
   }

   private int s() {
      if (this.a.aX() && this.p()) {
         int $$0 = this.a.dr();
         dfd $$1 = this.b.a_(gw.a(this.a.dq(), (double)$$0, this.a.dw()));
         int $$2 = 0;

         while ($$1.a(cte.G)) {
            $$1 = this.b.a_(gw.a(this.a.dq(), (double)(++$$0), this.a.dw()));
            if (++$$2 > 16) {
               return this.a.dr();
            }
         }

         return $$0;
      } else {
         return asb.a(this.a.ds() + 0.5);
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
            eat $$1 = this.c.a($$0);
            if (this.b.g(new gw($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(ear $$0) {
      if ($$0 == ear.j) {
         return false;
      } else {
         return $$0 == ear.i ? false : $$0 != ear.b;
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
