public class ccj extends cck {
   private boolean p;

   public ccj(bta $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected eor a(int $$0) {
      this.o = new eox();
      this.o.a(true);
      return new eor(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aE() || this.a.bi() || this.a.bR();
   }

   @Override
   protected evz b() {
      return new evz(this.a.du(), (double)this.s(), this.a.dA());
   }

   @Override
   public eop a(ja $$0, int $$1) {
      dun $$2 = this.b.N().a(kc.a($$0.u()), kc.a($$0.w()));
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
   public eop a(bsd $$0, int $$1) {
      return this.a($$0.dp(), $$1);
   }

   private int s() {
      if (this.a.be() && this.p()) {
         int $$0 = this.a.dv();
         dsh $$1 = this.b.a_(ja.a(this.a.du(), (double)$$0, this.a.dA()));
         int $$2 = 0;

         while ($$1.a(dfh.G)) {
            $$1 = this.b.a_(ja.a(this.a.du(), (double)(++$$0), this.a.dA()));
            if (++$$2 > 16) {
               return this.a.dv();
            }
         }

         return $$0;
      } else {
         return aye.a(this.a.dw() + 0.5);
      }
   }

   @Override
   protected void S_() {
      super.S_();
      if (this.p) {
         if (this.b.h(ja.a(this.a.du(), this.a.dw() + 0.5, this.a.dA()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eon $$1 = this.c.a($$0);
            if (this.b.h(new ja($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(eos $$0) {
      if ($$0 == eos.j) {
         return false;
      } else {
         return $$0 == eos.i ? false : $$0 != eos.b;
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
