public class btr extends bts {
   private boolean p;

   public btr(bkl $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected ebv a(int $$0) {
      this.o = new eby();
      this.o.a(true);
      return new ebv(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aA() || this.a.bb() || this.a.bN();
   }

   @Override
   protected eif b() {
      return new eif(this.a.dq(), (double)this.s(), this.a.dw());
   }

   @Override
   public ebt a(ht $$0, int $$1) {
      dii $$2 = this.b.J().a(iu.a($$0.u()), iu.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).i()) {
            ht $$3 = $$0.d();

            while ($$3.v() > this.b.I_() && $$2.a_($$3).i()) {
               $$3 = $$3.d();
            }

            if ($$3.v() > this.b.I_()) {
               return super.a($$3.c(), $$1);
            }

            while ($$3.v() < this.b.aj() && $$2.a_($$3).i()) {
               $$3 = $$3.c();
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            ht $$4 = $$0.c();

            while ($$4.v() < this.b.aj() && $$2.a_($$4).e()) {
               $$4 = $$4.c();
            }

            return super.a($$4, $$1);
         }
      }
   }

   @Override
   public ebt a(bjt $$0, int $$1) {
      return this.a($$0.dl(), $$1);
   }

   private int s() {
      if (this.a.aX() && this.p()) {
         int $$0 = this.a.dr();
         dgb $$1 = this.b.a_(ht.a(this.a.dq(), (double)$$0, this.a.dw()));
         int $$2 = 0;

         while ($$1.a(cuc.G)) {
            $$1 = this.b.a_(ht.a(this.a.dq(), (double)(++$$0), this.a.dw()));
            if (++$$2 > 16) {
               return this.a.dr();
            }
         }

         return $$0;
      } else {
         return asy.a(this.a.ds() + 0.5);
      }
   }

   @Override
   protected void S_() {
      super.S_();
      if (this.p) {
         if (this.b.g(ht.a(this.a.dq(), this.a.ds() + 0.5, this.a.dw()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            ebr $$1 = this.c.a($$0);
            if (this.b.g(new ht($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(ebp $$0) {
      if ($$0 == ebp.j) {
         return false;
      } else {
         return $$0 == ebp.i ? false : $$0 != ebp.b;
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
