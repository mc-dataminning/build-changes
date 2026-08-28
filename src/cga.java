public class cga extends cgb {
   private boolean p;

   public cga(bwt $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected evj a(int $$0) {
      this.o = new evp();
      return new evj(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aJ() || this.a.bm() || this.a.bZ();
   }

   @Override
   protected fcu b() {
      return new fcu(this.a.dA(), (double)this.r(), this.a.dG());
   }

   @Override
   public evh a(jj $$0, int $$1) {
      eat $$2 = this.b.S().a(kl.a($$0.u()), kl.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).l()) {
            jj.a $$3 = $$0.k().c(jo.a);

            while ($$3.v() > this.b.G_() && $$2.a_($$3).l()) {
               $$3.c(jo.a);
            }

            if ($$3.v() > this.b.G_()) {
               return super.a($$3.d(), $$1);
            }

            $$3.q($$0.v() + 1);

            while ($$3.v() <= this.b.ao() && $$2.a_($$3).l()) {
               $$3.c(jo.b);
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            jj.a $$4 = $$0.k().c(jo.b);

            while ($$4.v() <= this.b.ao() && $$2.a_($$4).e()) {
               $$4.c(jo.b);
            }

            return super.a($$4.j(), $$1);
         }
      }
   }

   @Override
   public evh a(bvs $$0, int $$1) {
      return this.a($$0.dv(), $$1);
   }

   private int r() {
      if (this.a.bj() && this.o()) {
         int $$0 = this.a.dB();
         dym $$1 = this.b.a_(jj.a(this.a.dA(), (double)$$0, this.a.dG()));
         int $$2 = 0;

         while ($$1.a(dkw.J)) {
            $$1 = this.b.a_(jj.a(this.a.dA(), (double)(++$$0), this.a.dG()));
            if (++$$2 > 16) {
               return this.a.dB();
            }
         }

         return $$0;
      } else {
         return azk.a(this.a.dC() + 0.5);
      }
   }

   @Override
   protected void d() {
      super.d();
      if (this.p) {
         if (this.b.h(jj.a(this.a.dA(), this.a.dC() + 0.5, this.a.dG()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            evf $$1 = this.c.a($$0);
            if (this.b.h(new jj($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(evk $$0) {
      if ($$0 == evk.j) {
         return false;
      } else {
         return $$0 == evk.i ? false : $$0 != evk.b;
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
