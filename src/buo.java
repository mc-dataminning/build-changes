public class buo extends bup {
   private boolean p;

   public buo(bli $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected edj a(int $$0) {
      this.o = new edm();
      this.o.a(true);
      return new edj(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aC() || this.a.bd() || this.a.bO();
   }

   @Override
   protected eju b() {
      return new eju(this.a.ds(), (double)this.s(), this.a.dy());
   }

   @Override
   public edh a(ht $$0, int $$1) {
      djp $$2 = this.b.K().a(iu.a($$0.u()), iu.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).i()) {
            ht $$3 = $$0.d();

            while ($$3.v() > this.b.I_() && $$2.a_($$3).i()) {
               $$3 = $$3.d();
            }

            if ($$3.v() > this.b.I_()) {
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
            ht $$4 = $$0.c();

            while ($$4.v() < this.b.ak() && $$2.a_($$4).e()) {
               $$4 = $$4.c();
            }

            return super.a($$4, $$1);
         }
      }
   }

   @Override
   public edh a(bkq $$0, int $$1) {
      return this.a($$0.dn(), $$1);
   }

   private int s() {
      if (this.a.aZ() && this.p()) {
         int $$0 = this.a.dt();
         dhi $$1 = this.b.a_(ht.a(this.a.ds(), (double)$$0, this.a.dy()));
         int $$2 = 0;

         while ($$1.a(cvc.G)) {
            $$1 = this.b.a_(ht.a(this.a.ds(), (double)(++$$0), this.a.dy()));
            if (++$$2 > 16) {
               return this.a.dt();
            }
         }

         return $$0;
      } else {
         return atm.a(this.a.du() + 0.5);
      }
   }

   @Override
   protected void T_() {
      super.T_();
      if (this.p) {
         if (this.b.g(ht.a(this.a.ds(), this.a.du() + 0.5, this.a.dy()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            edf $$1 = this.c.a($$0);
            if (this.b.g(new ht($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(edd $$0) {
      if ($$0 == edd.j) {
         return false;
      } else {
         return $$0 == edd.i ? false : $$0 != edd.b;
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
