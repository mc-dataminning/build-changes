public class cep extends ceq {
   private boolean p;

   public cep(bvg $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected ese a(int $$0) {
      this.o = new esk();
      this.o.a(true);
      return new ese(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aL() || this.a.bp() || this.a.cb();
   }

   @Override
   protected ezr b() {
      return new ezr(this.a.dD(), (double)this.t(), this.a.dJ());
   }

   @Override
   public esc a(jh $$0, int $$1) {
      dxt $$2 = this.b.P().a(kj.a($$0.u()), kj.a($$0.w()));
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
   public esc a(bui $$0, int $$1) {
      return this.a($$0.dy(), $$1);
   }

   private int t() {
      if (this.a.bl() && this.q()) {
         int $$0 = this.a.dE();
         dvo $$1 = this.b.a_(jh.a(this.a.dD(), (double)$$0, this.a.dJ()));
         int $$2 = 0;

         while ($$1.a(dil.G)) {
            $$1 = this.b.a_(jh.a(this.a.dD(), (double)(++$$0), this.a.dJ()));
            if (++$$2 > 16) {
               return this.a.dE();
            }
         }

         return $$0;
      } else {
         return azn.a(this.a.dF() + 0.5);
      }
   }

   @Override
   protected void W_() {
      super.W_();
      if (this.p) {
         if (this.b.h(jh.a(this.a.dD(), this.a.dF() + 0.5, this.a.dJ()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            esa $$1 = this.c.a($$0);
            if (this.b.h(new jh($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(esf $$0) {
      if ($$0 == esf.j) {
         return false;
      } else {
         return $$0 == esf.i ? false : $$0 != esf.b;
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
