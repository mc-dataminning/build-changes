public class cel extends cem {
   private boolean p;

   public cel(bvc $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected esa a(int $$0) {
      this.o = new esg();
      this.o.a(true);
      return new esa(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aK() || this.a.bo() || this.a.ca();
   }

   @Override
   protected ezn b() {
      return new ezn(this.a.dC(), (double)this.t(), this.a.dI());
   }

   @Override
   public ery a(jh $$0, int $$1) {
      dxp $$2 = this.b.P().a(kj.a($$0.u()), kj.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).l()) {
            jh.a $$3 = $$0.k().c(jm.a);

            while ($$3.v() > this.b.I_() && $$2.a_($$3).l()) {
               $$3.c(jm.a);
            }

            if ($$3.v() > this.b.I_()) {
               return super.a($$3.d(), $$1);
            }

            $$3.q($$0.v() + 1);

            while ($$3.v() <= this.b.al() && $$2.a_($$3).l()) {
               $$3.c(jm.b);
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            jh.a $$4 = $$0.k().c(jm.b);

            while ($$4.v() <= this.b.al() && $$2.a_($$4).e()) {
               $$4.c(jm.b);
            }

            return super.a($$4.j(), $$1);
         }
      }
   }

   @Override
   public ery a(bue $$0, int $$1) {
      return this.a($$0.dx(), $$1);
   }

   private int t() {
      if (this.a.bk() && this.q()) {
         int $$0 = this.a.dD();
         dvj $$1 = this.b.a_(jh.a(this.a.dC(), (double)$$0, this.a.dI()));
         int $$2 = 0;

         while ($$1.a(dig.G)) {
            $$1 = this.b.a_(jh.a(this.a.dC(), (double)(++$$0), this.a.dI()));
            if (++$$2 > 16) {
               return this.a.dD();
            }
         }

         return $$0;
      } else {
         return azk.a(this.a.dE() + 0.5);
      }
   }

   @Override
   protected void W_() {
      super.W_();
      if (this.p) {
         if (this.b.h(jh.a(this.a.dC(), this.a.dE() + 0.5, this.a.dI()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            erw $$1 = this.c.a($$0);
            if (this.b.h(new jh($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(esb $$0) {
      if ($$0 == esb.j) {
         return false;
      } else {
         return $$0 == esb.i ? false : $$0 != esb.b;
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
