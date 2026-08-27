public class bpi extends bpj {
   private boolean p;

   public bpi(bgb $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected dxv a(int $$0) {
      this.o = new dxy();
      this.o.a(true);
      return new dxv(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.ay() || this.o() || this.a.bM();
   }

   @Override
   protected eei b() {
      return new eei(this.a.dn(), (double)this.t(), this.a.dt());
   }

   @Override
   public dxt a(gu $$0, int $$1) {
      if (this.b.a_($$0).i()) {
         gu $$2 = $$0.d();

         while ($$2.v() > this.b.C_() && this.b.a_($$2).i()) {
            $$2 = $$2.d();
         }

         if ($$2.v() > this.b.C_()) {
            return super.a($$2.c(), $$1);
         }

         while ($$2.v() < this.b.aj() && this.b.a_($$2).i()) {
            $$2 = $$2.c();
         }

         $$0 = $$2;
      }

      if (!this.b.a_($$0).e()) {
         return super.a($$0, $$1);
      } else {
         gu $$3 = $$0.c();

         while ($$3.v() < this.b.aj() && this.b.a_($$3).e()) {
            $$3 = $$3.c();
         }

         return super.a($$3, $$1);
      }
   }

   @Override
   public dxt a(bfj $$0, int $$1) {
      return this.a($$0.di(), $$1);
   }

   private int t() {
      if (this.a.aV() && this.q()) {
         int $$0 = this.a.do();
         dcb $$1 = this.b.a_(gu.a(this.a.dn(), (double)$$0, this.a.dt()));
         int $$2 = 0;

         while ($$1.a(cpo.G)) {
            $$1 = this.b.a_(gu.a(this.a.dn(), (double)(++$$0), this.a.dt()));
            if (++$$2 > 16) {
               return this.a.do();
            }
         }

         return $$0;
      } else {
         return apa.a(this.a.dp() + 0.5);
      }
   }

   @Override
   protected void L_() {
      super.L_();
      if (this.p) {
         if (this.b.g(gu.a(this.a.dn(), this.a.dp() + 0.5, this.a.dt()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            dxr $$1 = this.c.a($$0);
            if (this.b.g(new gu($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(dxp $$0) {
      if ($$0 == dxp.j) {
         return false;
      } else {
         return $$0 == dxp.i ? false : $$0 != dxp.b;
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
