public class byy extends byz {
   private boolean p;

   public byy(bpq $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected eje a(int $$0) {
      this.o = new ejh();
      this.o.a(true);
      return new eje(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aC() || this.a.bg() || this.a.bO();
   }

   @Override
   protected epr b() {
      return new epr(this.a.dr(), (double)this.s(), this.a.dx());
   }

   @Override
   public ejc a(ib $$0, int $$1) {
      dpg $$2 = this.b.L().a(je.a($$0.u()), je.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).i()) {
            ib $$3 = $$0.d();

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
            ib $$4 = $$0.c();

            while ($$4.v() < this.b.ak() && $$2.a_($$4).e()) {
               $$4 = $$4.c();
            }

            return super.a($$4, $$1);
         }
      }
   }

   @Override
   public ejc a(bow $$0, int $$1) {
      return this.a($$0.dm(), $$1);
   }

   private int s() {
      if (this.a.bc() && this.p()) {
         int $$0 = this.a.ds();
         dmz $$1 = this.b.a_(ib.a(this.a.dr(), (double)$$0, this.a.dx()));
         int $$2 = 0;

         while ($$1.a(dac.G)) {
            $$1 = this.b.a_(ib.a(this.a.dr(), (double)(++$$0), this.a.dx()));
            if (++$$2 > 16) {
               return this.a.ds();
            }
         }

         return $$0;
      } else {
         return aww.a(this.a.dt() + 0.5);
      }
   }

   @Override
   protected void S_() {
      super.S_();
      if (this.p) {
         if (this.b.h(ib.a(this.a.dr(), this.a.dt() + 0.5, this.a.dx()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eja $$1 = this.c.a($$0);
            if (this.b.h(new ib($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(eiy $$0) {
      if ($$0 == eiy.j) {
         return false;
      } else {
         return $$0 == eiy.i ? false : $$0 != eiy.b;
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
