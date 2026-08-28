public class chd extends che {
   private boolean p;

   public chd(bxw $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected eye a(int $$0) {
      this.o = new eyk();
      return new eye(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aH() || this.a.bl() || this.a.bY();
   }

   @Override
   protected ffq b() {
      return new ffq(this.a.dA(), (double)this.r(), this.a.dG());
   }

   @Override
   public eyc a(iv $$0, int $$1) {
      edl $$2 = this.b.S().a(jy.a($$0.u()), jy.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).l()) {
            iv.a $$3 = $$0.k().c(jb.a);

            while ($$3.v() > this.b.K_() && $$2.a_($$3).l()) {
               $$3.c(jb.a);
            }

            if ($$3.v() > this.b.K_()) {
               return super.a($$3.d(), $$1);
            }

            $$3.q($$0.v() + 1);

            while ($$3.v() <= this.b.ao() && $$2.a_($$3).l()) {
               $$3.c(jb.b);
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            iv.a $$4 = $$0.k().c(jb.b);

            while ($$4.v() <= this.b.ao() && $$2.a_($$4).e()) {
               $$4.c(jb.b);
            }

            return super.a($$4.j(), $$1);
         }
      }
   }

   @Override
   public eyc a(bwt $$0, int $$1) {
      return this.a($$0.dv(), $$1);
   }

   private int r() {
      if (this.a.bi() && this.o()) {
         int $$0 = this.a.dB();
         ebe $$1 = this.b.a_(iv.a(this.a.dA(), (double)$$0, this.a.dG()));
         int $$2 = 0;

         while ($$1.a(dne.J)) {
            $$1 = this.b.a_(iv.a(this.a.dA(), (double)(++$$0), this.a.dG()));
            if (++$$2 > 16) {
               return this.a.dB();
            }
         }

         return $$0;
      } else {
         return azo.a(this.a.dC() + 0.5);
      }
   }

   @Override
   protected void d() {
      super.d();
      if (this.p) {
         if (this.b.h(iv.a(this.a.dA(), this.a.dC() + 0.5, this.a.dG()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            eya $$1 = this.c.a($$0);
            if (this.b.h(new iv($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   protected boolean a(eyf $$0) {
      if ($$0 == eyf.j) {
         return false;
      } else {
         return $$0 == eyf.i ? false : $$0 != eyf.b;
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
