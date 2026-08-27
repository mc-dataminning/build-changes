public class bvx extends bvy {
   private boolean p;

   public bvx(bmq $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected efq a(int $$0) {
      this.o = new eft();
      this.o.a(true);
      return new efq(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aC() || this.a.bd() || this.a.bO();
   }

   @Override
   protected emc b() {
      return new emc(this.a.dq(), (double)this.s(), this.a.dw());
   }

   @Override
   public efo a(hx $$0, int $$1) {
      dlw $$2 = this.b.L().a(iz.a($$0.u()), iz.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).i()) {
            hx $$3 = $$0.d();

            while ($$3.v() > this.b.J_() && $$2.a_($$3).i()) {
               $$3 = $$3.d();
            }

            if ($$3.v() > this.b.J_()) {
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
            hx $$4 = $$0.c();

            while ($$4.v() < this.b.al() && $$2.a_($$4).e()) {
               $$4 = $$4.c();
            }

            return super.a($$4, $$1);
         }
      }
   }

   @Override
   public efo a(blw $$0, int $$1) {
      return this.a($$0.dl(), $$1);
   }

   private int s() {
      if (this.a.aZ() && this.p()) {
         int $$0 = this.a.dr();
         djp $$1 = this.b.a_(hx.a(this.a.dq(), (double)$$0, this.a.dw()));
         int $$2 = 0;

         while ($$1.a(cxa.G)) {
            $$1 = this.b.a_(hx.a(this.a.dq(), (double)(++$$0), this.a.dw()));
            if (++$$2 > 16) {
               return this.a.dr();
            }
         }

         return $$0;
      } else {
         return aup.a(this.a.ds() + 0.5);
      }
   }

   @Override
   protected void U_() {
      super.U_();
      if (this.p) {
         if (this.b.h(hx.a(this.a.dq(), this.a.ds() + 0.5, this.a.dw()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            efm $$1 = this.c.a($$0);
            if (this.b.h(new hx($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(efk $$0) {
      if ($$0 == efk.j) {
         return false;
      } else {
         return $$0 == efk.i ? false : $$0 != efk.b;
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
