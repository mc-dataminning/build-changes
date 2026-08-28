public class ccz extends cda {
   private boolean p;

   public ccz(btp $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected epu a(int $$0) {
      this.o = new eqa();
      this.o.a(true);
      return new epu(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aF() || this.a.bj() || this.a.bS();
   }

   @Override
   protected exc b() {
      return new exc(this.a.dt(), (double)this.s(), this.a.dz());
   }

   @Override
   public eps a(jd $$0, int $$1) {
      dvi $$2 = this.b.N().a(kf.a($$0.u()), kf.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).i()) {
            jd $$3 = $$0.e();

            while ($$3.v() > this.b.I_() && $$2.a_($$3).i()) {
               $$3 = $$3.e();
            }

            if ($$3.v() > this.b.I_()) {
               return super.a($$3.d(), $$1);
            }

            while ($$3.v() < this.b.am() && $$2.a_($$3).i()) {
               $$3 = $$3.d();
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            jd $$4 = $$0.d();

            while ($$4.v() < this.b.am() && $$2.a_($$4).e()) {
               $$4 = $$4.d();
            }

            return super.a($$4, $$1);
         }
      }
   }

   @Override
   public eps a(bsr $$0, int $$1) {
      return this.a($$0.do(), $$1);
   }

   private int s() {
      if (this.a.bf() && this.p()) {
         int $$0 = this.a.du();
         dtc $$1 = this.b.a_(jd.a(this.a.dt(), (double)$$0, this.a.dz()));
         int $$2 = 0;

         while ($$1.a(dga.G)) {
            $$1 = this.b.a_(jd.a(this.a.dt(), (double)(++$$0), this.a.dz()));
            if (++$$2 > 16) {
               return this.a.du();
            }
         }

         return $$0;
      } else {
         return ayo.a(this.a.dv() + 0.5);
      }
   }

   @Override
   protected void W_() {
      super.W_();
      if (this.p) {
         if (this.b.h(jd.a(this.a.dt(), this.a.dv() + 0.5, this.a.dz()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            epq $$1 = this.c.a($$0);
            if (this.b.h(new jd($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(epv $$0) {
      if ($$0 == epv.j) {
         return false;
      } else {
         return $$0 == epv.i ? false : $$0 != epv.b;
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
