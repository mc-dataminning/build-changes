public class byh extends byi {
   private boolean p;

   public byh(boz $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected eii a(int $$0) {
      this.o = new eil();
      this.o.a(true);
      return new eii(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aC() || this.a.bd() || this.a.bL();
   }

   @Override
   protected eov b() {
      return new eov(this.a.do(), (double)this.s(), this.a.du());
   }

   @Override
   public eig a(ib $$0, int $$1) {
      dol $$2 = this.b.L().a(jd.a($$0.u()), jd.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).i()) {
            ib $$3 = $$0.d();

            while ($$3.v() > this.b.J_() && $$2.a_($$3).i()) {
               $$3 = $$3.d();
            }

            if ($$3.v() > this.b.J_()) {
               return super.a($$3.c(), $$1);
            }

            while ($$3.v() < this.b.ak() && $$2.a_($$3).i()) {
               $$3 = $$3.c();
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            ib $$4 = $$0.c();

            while ($$4.v() < this.b.ak() && $$2.a_($$4).e()) {
               $$4 = $$4.c();
            }

            return super.a($$4, $$1);
         }
      }
   }

   @Override
   public eig a(bof $$0, int $$1) {
      return this.a($$0.dj(), $$1);
   }

   private int s() {
      if (this.a.aZ() && this.p()) {
         int $$0 = this.a.dp();
         dme $$1 = this.b.a_(ib.a(this.a.do(), (double)$$0, this.a.du()));
         int $$2 = 0;

         while ($$1.a(czh.G)) {
            $$1 = this.b.a_(ib.a(this.a.do(), (double)(++$$0), this.a.du()));
            if (++$$2 > 16) {
               return this.a.dp();
            }
         }

         return $$0;
      } else {
         return awm.a(this.a.dq() + 0.5);
      }
   }

   @Override
   protected void U_() {
      super.U_();
      if (this.p) {
         if (this.b.h(ib.a(this.a.do(), this.a.dq() + 0.5, this.a.du()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eie $$1 = this.c.a($$0);
            if (this.b.h(new ib($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(eic $$0) {
      if ($$0 == eic.j) {
         return false;
      } else {
         return $$0 == eic.i ? false : $$0 != eic.b;
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
