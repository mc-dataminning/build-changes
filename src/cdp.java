public class cdp extends cdq {
   private boolean p;

   public cdp(buh $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected eqr a(int $$0) {
      this.o = new eqx();
      this.o.a(true);
      return new eqr(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aH() || this.a.bm() || this.a.bW();
   }

   @Override
   protected eye b() {
      return new eye(this.a.dx(), (double)this.t(), this.a.dD());
   }

   @Override
   public eqp a(je $$0, int $$1) {
      dwg $$2 = this.b.P().a(kg.a($$0.u()), kg.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).l()) {
            je $$3 = $$0.e();

            while ($$3.v() > this.b.G_() && $$2.a_($$3).l()) {
               $$3 = $$3.e();
            }

            if ($$3.v() > this.b.G_()) {
               return super.a($$3.d(), $$1);
            }

            while ($$3.v() < this.b.an() && $$2.a_($$3).l()) {
               $$3 = $$3.d();
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            je $$4 = $$0.d();

            while ($$4.v() < this.b.an() && $$2.a_($$4).e()) {
               $$4 = $$4.d();
            }

            return super.a($$4, $$1);
         }
      }
   }

   @Override
   public eqp a(btj $$0, int $$1) {
      return this.a($$0.ds(), $$1);
   }

   private int t() {
      if (this.a.bi() && this.q()) {
         int $$0 = this.a.dy();
         dua $$1 = this.b.a_(je.a(this.a.dx(), (double)$$0, this.a.dD()));
         int $$2 = 0;

         while ($$1.a(dgx.G)) {
            $$1 = this.b.a_(je.a(this.a.dx(), (double)(++$$0), this.a.dD()));
            if (++$$2 > 16) {
               return this.a.dy();
            }
         }

         return $$0;
      } else {
         return azc.a(this.a.dz() + 0.5);
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
            eqn $$1 = this.c.a($$0);
            if (this.b.h(new je($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(eqs $$0) {
      if ($$0 == eqs.j) {
         return false;
      } else {
         return $$0 == eqs.i ? false : $$0 != eqs.b;
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
