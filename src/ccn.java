public class ccn extends cco {
   private boolean p;

   public ccn(bte $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected eoz a(int $$0) {
      this.o = new epf();
      this.o.a(true);
      return new eoz(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aG() || this.a.bk() || this.a.bT();
   }

   @Override
   protected ewh b() {
      return new ewh(this.a.dw(), (double)this.s(), this.a.dC());
   }

   @Override
   public eox a(ja $$0, int $$1) {
      dur $$2 = this.b.N().a(kc.a($$0.u()), kc.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).i()) {
            ja $$3 = $$0.d();

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
            ja $$4 = $$0.c();

            while ($$4.v() < this.b.am() && $$2.a_($$4).e()) {
               $$4 = $$4.c();
            }

            return super.a($$4, $$1);
         }
      }
   }

   @Override
   public eox a(bsh $$0, int $$1) {
      return this.a($$0.dr(), $$1);
   }

   private int s() {
      if (this.a.bg() && this.p()) {
         int $$0 = this.a.dx();
         dsl $$1 = this.b.a_(ja.a(this.a.dw(), (double)$$0, this.a.dC()));
         int $$2 = 0;

         while ($$1.a(dfk.G)) {
            $$1 = this.b.a_(ja.a(this.a.dw(), (double)(++$$0), this.a.dC()));
            if (++$$2 > 16) {
               return this.a.dx();
            }
         }

         return $$0;
      } else {
         return ayg.a(this.a.dy() + 0.5);
      }
   }

   @Override
   protected void S_() {
      super.S_();
      if (this.p) {
         if (this.b.h(ja.a(this.a.dw(), this.a.dy() + 0.5, this.a.dC()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eov $$1 = this.c.a($$0);
            if (this.b.h(new ja($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(epa $$0) {
      if ($$0 == epa.j) {
         return false;
      } else {
         return $$0 == epa.i ? false : $$0 != epa.b;
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
