public class cer extends ces {
   private boolean p;

   public cer(bvi $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   protected eto a(int $$0) {
      this.o = new etu();
      return new eto(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aJ() || this.a.bn() || this.a.bZ();
   }

   @Override
   protected faz b() {
      return new faz(this.a.dA(), (double)this.r(), this.a.dG());
   }

   @Override
   public etm a(ji $$0, int $$1) {
      dzb $$2 = this.b.S().a(kk.a($$0.u()), kk.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).l()) {
            ji.a $$3 = $$0.k().c(jn.a);

            while ($$3.v() > this.b.L_() && $$2.a_($$3).l()) {
               $$3.c(jn.a);
            }

            if ($$3.v() > this.b.L_()) {
               return super.a($$3.d(), $$1);
            }

            $$3.q($$0.v() + 1);

            while ($$3.v() <= this.b.an() && $$2.a_($$3).l()) {
               $$3.c(jn.b);
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            ji.a $$4 = $$0.k().c(jn.b);

            while ($$4.v() <= this.b.an() && $$2.a_($$4).e()) {
               $$4.c(jn.b);
            }

            return super.a($$4.j(), $$1);
         }
      }
   }

   @Override
   public etm a(buk $$0, int $$1) {
      return this.a($$0.dv(), $$1);
   }

   private int r() {
      if (this.a.bj() && this.o()) {
         int $$0 = this.a.dB();
         dww $$1 = this.b.a_(ji.a(this.a.dA(), (double)$$0, this.a.dG()));
         int $$2 = 0;

         while ($$1.a(djn.J)) {
            $$1 = this.b.a_(ji.a(this.a.dA(), (double)(++$$0), this.a.dG()));
            if (++$$2 > 16) {
               return this.a.dB();
            }
         }

         return $$0;
      } else {
         return ayz.a(this.a.dC() + 0.5);
      }
   }

   @Override
   protected void d() {
      super.d();
      if (this.p) {
         if (this.b.h(ji.a(this.a.dA(), this.a.dC() + 0.5, this.a.dG()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            etk $$1 = this.c.a($$0);
            if (this.b.h(new ji($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(etp $$0) {
      if ($$0 == etp.j) {
         return false;
      } else {
         return $$0 == etp.i ? false : $$0 != etp.b;
      }
   }

   public void b(boolean $$0) {
      this.o.b($$0);
   }

   public void c(boolean $$0) {
      this.p = $$0;
   }

   public void d(boolean $$0) {
      this.o.d($$0);
   }
}
