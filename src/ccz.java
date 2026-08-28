public class ccz extends cda {
   private boolean p;

   public ccz(btq $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected eok a(int $$0) {
      this.o = new eoq();
      this.o.a(true);
      return new eok(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aE() || this.a.bi() || this.a.bR();
   }

   @Override
   protected evq b() {
      return new evq(this.a.du(), (double)this.s(), this.a.dA());
   }

   @Override
   public eoi a(iz $$0, int $$1) {
      duh $$2 = this.b.N().a(kb.a($$0.u()), kb.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).i()) {
            iz $$3 = $$0.d();

            while ($$3.v() > this.b.I_() && $$2.a_($$3).i()) {
               $$3 = $$3.d();
            }

            if ($$3.v() > this.b.I_()) {
               return super.a($$3.c(), $$1);
            }

            while ($$3.v() < this.b.am() && $$2.a_($$3).i()) {
               $$3 = $$3.c();
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            iz $$4 = $$0.c();

            while ($$4.v() < this.b.am() && $$2.a_($$4).e()) {
               $$4 = $$4.c();
            }

            return super.a($$4, $$1);
         }
      }
   }

   @Override
   public eoi a(bst $$0, int $$1) {
      return this.a($$0.dp(), $$1);
   }

   private int s() {
      if (this.a.be() && this.p()) {
         int $$0 = this.a.dv();
         dsb $$1 = this.b.a_(iz.a(this.a.du(), (double)$$0, this.a.dA()));
         int $$2 = 0;

         while ($$1.a(dfa.G)) {
            $$1 = this.b.a_(iz.a(this.a.du(), (double)(++$$0), this.a.dA()));
            if (++$$2 > 16) {
               return this.a.dv();
            }
         }

         return $$0;
      } else {
         return ayy.a(this.a.dw() + 0.5);
      }
   }

   @Override
   protected void S_() {
      super.S_();
      if (this.p) {
         if (this.b.h(iz.a(this.a.du(), this.a.dw() + 0.5, this.a.dA()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eog $$1 = this.c.a($$0);
            if (this.b.h(new iz($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(eol $$0) {
      if ($$0 == eol.j) {
         return false;
      } else {
         return $$0 == eol.i ? false : $$0 != eol.b;
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
