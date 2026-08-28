public class ces extends cet {
   private boolean p;

   public ces(bvj $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected esl a(int $$0) {
      this.o = new esr();
      this.o.a(true);
      return new esl(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aJ() || this.a.bn() || this.a.bZ();
   }

   @Override
   protected ezy b() {
      return new ezy(this.a.dA(), (double)this.t(), this.a.dG());
   }

   @Override
   public esj a(jh $$0, int $$1) {
      dya $$2 = this.b.Q().a(kj.a($$0.u()), kj.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).l()) {
            jh.a $$3 = $$0.k().c(jm.a);

            while ($$3.v() > this.b.K_() && $$2.a_($$3).l()) {
               $$3.c(jm.a);
            }

            if ($$3.v() > this.b.K_()) {
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
   public esj a(bul $$0, int $$1) {
      return this.a($$0.dv(), $$1);
   }

   private int t() {
      if (this.a.bj() && this.q()) {
         int $$0 = this.a.dB();
         dvv $$1 = this.b.a_(jh.a(this.a.dA(), (double)$$0, this.a.dG()));
         int $$2 = 0;

         while ($$1.a(dis.G)) {
            $$1 = this.b.a_(jh.a(this.a.dA(), (double)(++$$0), this.a.dG()));
            if (++$$2 > 16) {
               return this.a.dB();
            }
         }

         return $$0;
      } else {
         return azm.a(this.a.dC() + 0.5);
      }
   }

   @Override
   protected void U_() {
      super.U_();
      if (this.p) {
         if (this.b.h(jh.a(this.a.dA(), this.a.dC() + 0.5, this.a.dG()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            esh $$1 = this.c.a($$0);
            if (this.b.h(new jh($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(esm $$0) {
      if ($$0 == esm.j) {
         return false;
      } else {
         return $$0 == esm.i ? false : $$0 != esm.b;
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
