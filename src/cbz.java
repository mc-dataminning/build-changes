public class cbz extends cca {
   private boolean p;

   public cbz(bsq $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected enk a(int $$0) {
      this.o = new enq();
      this.o.a(true);
      return new enk(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aE() || this.a.bi() || this.a.bR();
   }

   @Override
   protected euk b() {
      return new euk(this.a.du(), (double)this.s(), this.a.dA());
   }

   @Override
   public eni a(io $$0, int $$1) {
      dth $$2 = this.b.M().a(jq.a($$0.u()), jq.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).i()) {
            io $$3 = $$0.d();

            while ($$3.v() > this.b.I_() && $$2.a_($$3).i()) {
               $$3 = $$3.d();
            }

            if ($$3.v() > this.b.I_()) {
               return super.a($$3.c(), $$1);
            }

            while ($$3.v() < this.b.al() && $$2.a_($$3).i()) {
               $$3 = $$3.c();
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            io $$4 = $$0.c();

            while ($$4.v() < this.b.al() && $$2.a_($$4).e()) {
               $$4 = $$4.c();
            }

            return super.a($$4, $$1);
         }
      }
   }

   @Override
   public eni a(bru $$0, int $$1) {
      return this.a($$0.dp(), $$1);
   }

   private int s() {
      if (this.a.be() && this.p()) {
         int $$0 = this.a.dv();
         drb $$1 = this.b.a_(io.a(this.a.du(), (double)$$0, this.a.dA()));
         int $$2 = 0;

         while ($$1.a(dea.G)) {
            $$1 = this.b.a_(io.a(this.a.du(), (double)(++$$0), this.a.dA()));
            if (++$$2 > 16) {
               return this.a.dv();
            }
         }

         return $$0;
      } else {
         return ayd.a(this.a.dw() + 0.5);
      }
   }

   @Override
   protected void S_() {
      super.S_();
      if (this.p) {
         if (this.b.h(io.a(this.a.du(), this.a.dw() + 0.5, this.a.dA()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eng $$1 = this.c.a($$0);
            if (this.b.h(new io($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(enl $$0) {
      if ($$0 == enl.j) {
         return false;
      } else {
         return $$0 == enl.i ? false : $$0 != enl.b;
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
