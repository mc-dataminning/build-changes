public class bsg extends bsh {
   private boolean p;

   public bsg(bja $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   protected eat a(int $$0) {
      this.o = new eaw();
      this.o.a(true);
      return new eat(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aA() || this.a.bb() || this.a.bN();
   }

   @Override
   protected ehd b() {
      return new ehd(this.a.dp(), (double)this.s(), this.a.dv());
   }

   @Override
   public ear a(gu $$0, int $$1) {
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
   public ear a(bii $$0, int $$1) {
      return this.a($$0.dk(), $$1);
   }

   private int s() {
      if (this.a.aX() && this.p()) {
         int $$0 = this.a.dq();
         dez $$1 = this.b.a_(gu.a(this.a.dp(), (double)$$0, this.a.dv()));
         int $$2 = 0;

         while ($$1.a(csm.G)) {
            $$1 = this.b.a_(gu.a(this.a.dp(), (double)(++$$0), this.a.dv()));
            if (++$$2 > 16) {
               return this.a.dq();
            }
         }

         return $$0;
      } else {
         return arp.a(this.a.dr() + 0.5);
      }
   }

   @Override
   protected void L_() {
      super.L_();
      if (this.p) {
         if (this.b.g(gu.a(this.a.dp(), this.a.dr() + 0.5, this.a.dv()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eap $$1 = this.c.a($$0);
            if (this.b.g(new gu($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(ean $$0) {
      if ($$0 == ean.j) {
         return false;
      } else {
         return $$0 == ean.i ? false : $$0 != ean.b;
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
