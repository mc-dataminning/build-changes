public class cgi extends cgj {
   private boolean p;

   public cgi(bxb $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected ewl a(int $$0) {
      this.o = new ewr();
      return new ewl(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aJ() || this.a.bm() || this.a.bZ();
   }

   @Override
   protected fdw b() {
      return new fdw(this.a.dA(), (double)this.r(), this.a.dG());
   }

   @Override
   public ewj a(iu $$0, int $$1) {
      ebv $$2 = this.b.S().a(jx.a($$0.u()), jx.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).l()) {
            iu.a $$3 = $$0.k().c(ja.a);

            while ($$3.v() > this.b.G_() && $$2.a_($$3).l()) {
               $$3.c(ja.a);
            }

            if ($$3.v() > this.b.G_()) {
               return super.a($$3.d(), $$1);
            }

            $$3.q($$0.v() + 1);

            while ($$3.v() <= this.b.ao() && $$2.a_($$3).l()) {
               $$3.c(ja.b);
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            iu.a $$4 = $$0.k().c(ja.b);

            while ($$4.v() <= this.b.ao() && $$2.a_($$4).e()) {
               $$4.c(ja.b);
            }

            return super.a($$4.j(), $$1);
         }
      }
   }

   @Override
   public ewj a(bwa $$0, int $$1) {
      return this.a($$0.dv(), $$1);
   }

   private int r() {
      if (this.a.bj() && this.o()) {
         int $$0 = this.a.dB();
         dzo $$1 = this.b.a_(iu.a(this.a.dA(), (double)$$0, this.a.dG()));
         int $$2 = 0;

         while ($$1.a(dlw.J)) {
            $$1 = this.b.a_(iu.a(this.a.dA(), (double)(++$$0), this.a.dG()));
            if (++$$2 > 16) {
               return this.a.dB();
            }
         }

         return $$0;
      } else {
         return azk.a(this.a.dC() + 0.5);
      }
   }

   @Override
   protected void d() {
      super.d();
      if (this.p) {
         if (this.b.h(iu.a(this.a.dA(), this.a.dC() + 0.5, this.a.dG()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            ewh $$1 = this.c.a($$0);
            if (this.b.h(new iu($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(ewm $$0) {
      if ($$0 == ewm.j) {
         return false;
      } else {
         return $$0 == ewm.i ? false : $$0 != ewm.b;
      }
   }

   public void b(boolean $$0) {
      this.o.b($$0);
   }

   public void c(boolean $$0) {
      this.p = $$0;
   }

   public void d(boolean $$0) {
      this.o.d($$0);
   }
}
