public class cfq extends cfr {
   private boolean p;

   public cfq(bwh $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected eum a(int $$0) {
      this.o = new eus();
      this.o.a(true);
      return new eum(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aJ() || this.a.bn() || this.a.bZ();
   }

   @Override
   protected fbx b() {
      return new fbx(this.a.dB(), (double)this.t(), this.a.dH());
   }

   @Override
   public euk a(jh $$0, int $$1) {
      dzz $$2 = this.b.R().a(kj.a($$0.u()), kj.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).l()) {
            jh.a $$3 = $$0.k().c(jm.a);

            while ($$3.v() > this.b.L_() && $$2.a_($$3).l()) {
               $$3.c(jm.a);
            }

            if ($$3.v() > this.b.L_()) {
               return super.a($$3.d(), $$1);
            }

            $$3.q($$0.v() + 1);

            while ($$3.v() <= this.b.am() && $$2.a_($$3).l()) {
               $$3.c(jm.b);
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            jh.a $$4 = $$0.k().c(jm.b);

            while ($$4.v() <= this.b.am() && $$2.a_($$4).e()) {
               $$4.c(jm.b);
            }

            return super.a($$4.j(), $$1);
         }
      }
   }

   @Override
   public euk a(bvj $$0, int $$1) {
      return this.a($$0.dw(), $$1);
   }

   private int t() {
      if (this.a.bj() && this.q()) {
         int $$0 = this.a.dC();
         dxu $$1 = this.b.a_(jh.a(this.a.dB(), (double)$$0, this.a.dH()));
         int $$2 = 0;

         while ($$1.a(dkn.J)) {
            $$1 = this.b.a_(jh.a(this.a.dB(), (double)(++$$0), this.a.dH()));
            if (++$$2 > 16) {
               return this.a.dC();
            }
         }

         return $$0;
      } else {
         return bae.a(this.a.dD() + 0.5);
      }
   }

   @Override
   protected void W_() {
      super.W_();
      if (this.p) {
         if (this.b.h(jh.a(this.a.dB(), this.a.dD() + 0.5, this.a.dH()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eui $$1 = this.c.a($$0);
            if (this.b.h(new jh($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(eun $$0) {
      if ($$0 == eun.j) {
         return false;
      } else {
         return $$0 == eun.i ? false : $$0 != eun.b;
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
