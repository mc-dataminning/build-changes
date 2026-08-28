public class cgs extends cgt {
   private boolean p;

   public cgs(bxl $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected exl a(int $$0) {
      this.o = new exr();
      return new exl(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aH() || this.a.bk() || this.a.bX();
   }

   @Override
   protected fex b() {
      return new fex(this.a.dz(), (double)this.r(), this.a.dF());
   }

   @Override
   public exj a(iv $$0, int $$1) {
      ecv $$2 = this.b.S().a(jy.a($$0.u()), jy.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).l()) {
            iv.a $$3 = $$0.k().c(jb.a);

            while ($$3.v() > this.b.G_() && $$2.a_($$3).l()) {
               $$3.c(jb.a);
            }

            if ($$3.v() > this.b.G_()) {
               return super.a($$3.d(), $$1);
            }

            $$3.q($$0.v() + 1);

            while ($$3.v() <= this.b.ao() && $$2.a_($$3).l()) {
               $$3.c(jb.b);
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            iv.a $$4 = $$0.k().c(jb.b);

            while ($$4.v() <= this.b.ao() && $$2.a_($$4).e()) {
               $$4.c(jb.b);
            }

            return super.a($$4.j(), $$1);
         }
      }
   }

   @Override
   public exj a(bwi $$0, int $$1) {
      return this.a($$0.du(), $$1);
   }

   private int r() {
      if (this.a.bh() && this.o()) {
         int $$0 = this.a.dA();
         eao $$1 = this.b.a_(iv.a(this.a.dz(), (double)$$0, this.a.dF()));
         int $$2 = 0;

         while ($$1.a(dmo.J)) {
            $$1 = this.b.a_(iv.a(this.a.dz(), (double)(++$$0), this.a.dF()));
            if (++$$2 > 16) {
               return this.a.dA();
            }
         }

         return $$0;
      } else {
         return azm.a(this.a.dB() + 0.5);
      }
   }

   @Override
   protected void d() {
      super.d();
      if (this.p) {
         if (this.b.h(iv.a(this.a.dz(), this.a.dB() + 0.5, this.a.dF()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            exh $$1 = this.c.a($$0);
            if (this.b.h(new iv($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(exm $$0) {
      if ($$0 == exm.j) {
         return false;
      } else {
         return $$0 == exm.i ? false : $$0 != exm.b;
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
