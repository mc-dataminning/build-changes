public class cdu extends cdv {
   private boolean p;

   public cdu(bum $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected erf a(int $$0) {
      this.o = new erl();
      this.o.a(true);
      return new erf(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aH() || this.a.bm() || this.a.bW();
   }

   @Override
   protected eys b() {
      return new eys(this.a.dx(), (double)this.t(), this.a.dD());
   }

   @Override
   public erd a(je $$0, int $$1) {
      dwu $$2 = this.b.P().a(kg.a($$0.u()), kg.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).l()) {
            je.a $$3 = $$0.k().c(jj.a);

            while ($$3.v() > this.b.G_() && $$2.a_($$3).l()) {
               $$3.c(jj.a);
            }

            if ($$3.v() > this.b.G_()) {
               return super.a($$3.d(), $$1);
            }

            $$3.q($$0.v() + 1);

            while ($$3.v() <= this.b.an() && $$2.a_($$3).l()) {
               $$3.c(jj.b);
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            je.a $$4 = $$0.k().c(jj.b);

            while ($$4.v() <= this.b.an() && $$2.a_($$4).e()) {
               $$4.c(jj.b);
            }

            return super.a($$4.j(), $$1);
         }
      }
   }

   @Override
   public erd a(bto $$0, int $$1) {
      return this.a($$0.ds(), $$1);
   }

   private int t() {
      if (this.a.bi() && this.q()) {
         int $$0 = this.a.dy();
         duo $$1 = this.b.a_(je.a(this.a.dx(), (double)$$0, this.a.dD()));
         int $$2 = 0;

         while ($$1.a(dhl.G)) {
            $$1 = this.b.a_(je.a(this.a.dx(), (double)(++$$0), this.a.dD()));
            if (++$$2 > 16) {
               return this.a.dy();
            }
         }

         return $$0;
      } else {
         return azd.a(this.a.dz() + 0.5);
      }
   }

   @Override
   protected void U_() {
      super.U_();
      if (this.p) {
         if (this.b.h(je.a(this.a.dx(), this.a.dz() + 0.5, this.a.dD()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            erb $$1 = this.c.a($$0);
            if (this.b.h(new je($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(erg $$0) {
      if ($$0 == erg.j) {
         return false;
      } else {
         return $$0 == erg.i ? false : $$0 != erg.b;
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
