import javax.annotation.Nullable;

public class cnd extends cmx {
   private static final cij b = cij.a().d();
   @Nullable
   private eyc c;
   @Nullable
   private ffq d;

   public cnd(cmv $$0) {
      super($$0);
   }

   @Override
   public cnl<cnd> h() {
      return cnl.c;
   }

   @Override
   public void c() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void a(ars $$0) {
      double $$1 = this.d == null ? 0.0 : this.d.c(this.a.dA(), this.a.dC(), this.a.dG());
      if ($$1 < 100.0 || $$1 > 22500.0 || this.a.P || this.a.Q) {
         this.b($$0);
      }
   }

   @Nullable
   @Override
   public ffq f() {
      return this.d;
   }

   private void b(ars $$0) {
      if (this.c == null || this.c.c()) {
         int $$1 = this.a.n();
         iv $$2 = $$0.a(ehd.a.f, eki.a(this.a.j()));
         crx $$3 = $$0.a(b, this.a, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
         int $$5;
         if ($$3 != null) {
            ffq $$4 = new ffq($$3.dA(), 0.0, $$3.dG()).d();
            $$5 = this.a.q(-$$4.d * 40.0, 105.0, -$$4.f * 40.0);
         } else {
            $$5 = this.a.q(40.0, (double)$$2.v(), 0.0);
         }

         eya $$7 = new eya($$2.u(), $$2.v(), $$2.w());
         this.c = this.a.a($$1, $$5, $$7);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.i();
      if (this.c != null && this.c.c()) {
         this.a.t().a(cnl.d);
      }
   }

   private void i() {
      if (this.c != null && !this.c.c()) {
         ka $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dY().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ffq($$1, $$3, $$2);
      }
   }
}
