public class bxs extends bxt {
   private boolean p;

   public bxs(bok $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected ehn a(int $$0) {
      this.o = new ehq();
      this.o.a(true);
      return new ehn(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aC() || this.a.bd() || this.a.bO();
   }

   @Override
   protected enz b() {
      return new enz(this.a.dr(), (double)this.s(), this.a.dx());
   }

   @Override
   public ehl a(hz $$0, int $$1) {
      dnq $$2 = this.b.L().a(jb.a($$0.u()), jb.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).i()) {
            hz $$3 = $$0.d();

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
            hz $$4 = $$0.c();

            while ($$4.v() < this.b.ak() && $$2.a_($$4).e()) {
               $$4 = $$4.c();
            }

            return super.a($$4, $$1);
         }
      }
   }

   @Override
   public ehl a(bnq $$0, int $$1) {
      return this.a($$0.dm(), $$1);
   }

   private int s() {
      if (this.a.aZ() && this.p()) {
         int $$0 = this.a.ds();
         dlj $$1 = this.b.a_(hz.a(this.a.dr(), (double)$$0, this.a.dx()));
         int $$2 = 0;

         while ($$1.a(cyu.G)) {
            $$1 = this.b.a_(hz.a(this.a.dr(), (double)(++$$0), this.a.dx()));
            if (++$$2 > 16) {
               return this.a.ds();
            }
         }

         return $$0;
      } else {
         return awi.a(this.a.dt() + 0.5);
      }
   }

   @Override
   protected void U_() {
      super.U_();
      if (this.p) {
         if (this.b.h(hz.a(this.a.dr(), this.a.dt() + 0.5, this.a.dx()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            ehj $$1 = this.c.a($$0);
            if (this.b.h(new hz($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(ehh $$0) {
      if ($$0 == ehh.j) {
         return false;
      } else {
         return $$0 == ehh.i ? false : $$0 != ehh.b;
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
