public class ceg extends ceh {
   private boolean p;

   public ceg(bux $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected eru a(int $$0) {
      this.o = new esa();
      this.o.a(true);
      return new eru(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aJ() || this.a.bo() || this.a.ca();
   }

   @Override
   protected ezh b() {
      return new ezh(this.a.dC(), (double)this.t(), this.a.dI());
   }

   @Override
   public ers a(jg $$0, int $$1) {
      dxj $$2 = this.b.P().a(ki.a($$0.u()), ki.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).l()) {
            jg.a $$3 = $$0.k().c(jl.a);

            while ($$3.v() > this.b.I_() && $$2.a_($$3).l()) {
               $$3.c(jl.a);
            }

            if ($$3.v() > this.b.I_()) {
               return super.a($$3.d(), $$1);
            }

            $$3.q($$0.v() + 1);

            while ($$3.v() <= this.b.an() && $$2.a_($$3).l()) {
               $$3.c(jl.b);
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            jg.a $$4 = $$0.k().c(jl.b);

            while ($$4.v() <= this.b.an() && $$2.a_($$4).e()) {
               $$4.c(jl.b);
            }

            return super.a($$4.j(), $$1);
         }
      }
   }

   @Override
   public ers a(btz $$0, int $$1) {
      return this.a($$0.dx(), $$1);
   }

   private int t() {
      if (this.a.bk() && this.q()) {
         int $$0 = this.a.dD();
         dvd $$1 = this.b.a_(jg.a(this.a.dC(), (double)$$0, this.a.dI()));
         int $$2 = 0;

         while ($$1.a(dia.G)) {
            $$1 = this.b.a_(jg.a(this.a.dC(), (double)(++$$0), this.a.dI()));
            if (++$$2 > 16) {
               return this.a.dD();
            }
         }

         return $$0;
      } else {
         return azj.a(this.a.dE() + 0.5);
      }
   }

   @Override
   protected void W_() {
      super.W_();
      if (this.p) {
         if (this.b.h(jg.a(this.a.dC(), this.a.dE() + 0.5, this.a.dI()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            erq $$1 = this.c.a($$0);
            if (this.b.h(new jg($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(erv $$0) {
      if ($$0 == erv.j) {
         return false;
      } else {
         return $$0 == erv.i ? false : $$0 != erv.b;
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
