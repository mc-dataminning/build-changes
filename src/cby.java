public class cby extends cbz {
   private boolean p;

   public cby(bsq $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected epu a(int $$0) {
      this.o = new eqa();
      this.o.a(true);
      return new epu(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aE() || this.a.bm() || this.a.bW();
   }

   @Override
   protected ewu b() {
      return new ewu(this.a.dz(), (double)this.s(), this.a.dF());
   }

   @Override
   public eps a(ir $$0, int $$1) {
      dvi $$2 = this.b.N().a(jt.a($$0.u()), jt.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).i()) {
            ir $$3 = $$0.d();

            while ($$3.v() > this.b.J_() && $$2.a_($$3).i()) {
               $$3 = $$3.d();
            }

            if ($$3.v() > this.b.J_()) {
               return super.a($$3.c(), $$1);
            }

            while ($$3.v() < this.b.am() && $$2.a_($$3).i()) {
               $$3 = $$3.c();
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            ir $$4 = $$0.c();

            while ($$4.v() < this.b.am() && $$2.a_($$4).e()) {
               $$4 = $$4.c();
            }

            return super.a($$4, $$1);
         }
      }
   }

   @Override
   public eps a(brv $$0, int $$1) {
      return this.a($$0.du(), $$1);
   }

   private int s() {
      if (this.a.bi() && this.p()) {
         int $$0 = this.a.dA();
         dtc $$1 = this.b.a_(ir.a(this.a.dz(), (double)$$0, this.a.dF()));
         int $$2 = 0;

         while ($$1.a(dfe.al)) {
            $$1 = this.b.a_(ir.a(this.a.dz(), (double)(++$$0), this.a.dF()));
            if (++$$2 > 16) {
               return this.a.dA();
            }
         }

         return $$0;
      } else {
         return aym.a(this.a.dB() + 0.5);
      }
   }

   @Override
   protected void T_() {
      super.T_();
      if (this.p) {
         if (this.b.h(ir.a(this.a.dz(), this.a.dB() + 0.5, this.a.dF()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            epq $$1 = this.c.a($$0);
            if (this.b.h(new ir($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(epv $$0) {
      if ($$0 == epv.j) {
         return false;
      } else {
         return $$0 == epv.i ? false : $$0 != epv.b;
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
