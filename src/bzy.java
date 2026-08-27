public class bzy extends bzz {
   private boolean p;

   public bzy(bqq $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected eli a(int $$0) {
      this.o = new elo();
      this.o.a(true);
      return new eli(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aC() || this.a.bg() || this.a.bO();
   }

   @Override
   protected esa b() {
      return new esa(this.a.dr(), (double)this.s(), this.a.dx());
   }

   @Override
   public elg a(ib $$0, int $$1) {
      drf $$2 = this.b.M().a(je.a($$0.u()), je.a($$0.w()));
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

            while ($$3.v() < this.b.al() && $$2.a_($$3).i()) {
               $$3 = $$3.c();
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            ib $$4 = $$0.c();

            while ($$4.v() < this.b.al() && $$2.a_($$4).e()) {
               $$4 = $$4.c();
            }

            return super.a($$4, $$1);
         }
      }
   }

   @Override
   public elg a(bpv $$0, int $$1) {
      return this.a($$0.dm(), $$1);
   }

   private int s() {
      if (this.a.bc() && this.p()) {
         int $$0 = this.a.ds();
         doz $$1 = this.b.a_(ib.a(this.a.dr(), (double)$$0, this.a.dx()));
         int $$2 = 0;

         while ($$1.a(dca.G)) {
            $$1 = this.b.a_(ib.a(this.a.dr(), (double)(++$$0), this.a.dx()));
            if (++$$2 > 16) {
               return this.a.ds();
            }
         }

         return $$0;
      } else {
         return axk.a(this.a.dt() + 0.5);
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
            ele $$1 = this.c.a($$0);
            if (this.b.h(new ib($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(elj $$0) {
      if ($$0 == elj.j) {
         return false;
      } else {
         return $$0 == elj.i ? false : $$0 != elj.b;
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
