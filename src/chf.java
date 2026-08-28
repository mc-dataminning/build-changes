public class chf extends chg {
   private boolean p;

   public chf(bxy $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected eyg a(int $$0) {
      this.o = new eym();
      return new eyg(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aH() || this.a.bl() || this.a.bY();
   }

   @Override
   protected ffs b() {
      return new ffs(this.a.dA(), (double)this.r(), this.a.dG());
   }

   @Override
   public eye a(iw $$0, int $$1) {
      edn $$2 = this.b.S().a(jz.a($$0.u()), jz.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).l()) {
            iw.a $$3 = $$0.k().c(jc.a);

            while ($$3.v() > this.b.K_() && $$2.a_($$3).l()) {
               $$3.c(jc.a);
            }

            if ($$3.v() > this.b.K_()) {
               return super.a($$3.d(), $$1);
            }

            $$3.q($$0.v() + 1);

            while ($$3.v() <= this.b.ao() && $$2.a_($$3).l()) {
               $$3.c(jc.b);
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            iw.a $$4 = $$0.k().c(jc.b);

            while ($$4.v() <= this.b.ao() && $$2.a_($$4).e()) {
               $$4.c(jc.b);
            }

            return super.a($$4.j(), $$1);
         }
      }
   }

   @Override
   public eye a(bwv $$0, int $$1) {
      return this.a($$0.dv(), $$1);
   }

   private int r() {
      if (this.a.bi() && this.o()) {
         int $$0 = this.a.dB();
         ebg $$1 = this.b.a_(iw.a(this.a.dA(), (double)$$0, this.a.dG()));
         int $$2 = 0;

         while ($$1.a(dng.J)) {
            $$1 = this.b.a_(iw.a(this.a.dA(), (double)(++$$0), this.a.dG()));
            if (++$$2 > 16) {
               return this.a.dB();
            }
         }

         return $$0;
      } else {
         return azq.a(this.a.dC() + 0.5);
      }
   }

   @Override
   protected void d() {
      super.d();
      if (this.p) {
         if (this.b.h(iw.a(this.a.dA(), this.a.dC() + 0.5, this.a.dG()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eyc $$1 = this.c.a($$0);
            if (this.b.h(new iw($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(eyh $$0) {
      if ($$0 == eyh.j) {
         return false;
      } else {
         return $$0 == eyh.i ? false : $$0 != eyh.b;
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
