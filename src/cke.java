import javax.annotation.Nullable;

public class cke extends cjy {
   private static final cfz b = cfz.a().d();
   @Nullable
   private eto c;
   @Nullable
   private fbb d;

   public cke(cjw $$0) {
      super($$0);
   }

   @Override
   public ckm<cke> h() {
      return ckm.c;
   }

   @Override
   public void c() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void a(ard $$0) {
      double $$1 = this.d == null ? 0.0 : this.d.c(this.a.dA(), this.a.dC(), this.a.dG());
      if ($$1 < 100.0 || $$1 > 22500.0 || this.a.P || this.a.Q) {
         this.b($$0);
      }
   }

   @Nullable
   @Override
   public fbb f() {
      return this.d;
   }

   private void b(ard $$0) {
      if (this.c == null || this.c.c()) {
         int $$1 = this.a.t();
         ji $$2 = $$0.a(ect.a.f, efy.a(this.a.m()));
         coy $$3 = $$0.a(b, this.a, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
         int $$5;
         if ($$3 != null) {
            fbb $$4 = new fbb($$3.dA(), 0.0, $$3.dG()).d();
            $$5 = this.a.q(-$$4.d * 40.0, 105.0, -$$4.f * 40.0);
         } else {
            $$5 = this.a.q(40.0, (double)$$2.v(), 0.0);
         }

         etm $$7 = new etm($$2.u(), $$2.v(), $$2.w());
         this.c = this.a.a($$1, $$5, $$7);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.i();
      if (this.c != null && this.c.c()) {
         this.a.go().a(ckm.d);
      }
   }

   private void i() {
      if (this.c != null && !this.c.c()) {
         km $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dY().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new fbb($$1, $$3, $$2);
      }
   }
}
