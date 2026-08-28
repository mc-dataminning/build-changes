import javax.annotation.Nullable;

public class clo extends cli {
   private static final chg b = chg.a().d();
   @Nullable
   private evh c;
   @Nullable
   private fcu d;

   public clo(clg $$0) {
      super($$0);
   }

   @Override
   public clw<clo> h() {
      return clw.c;
   }

   @Override
   public void c() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void a(arn $$0) {
      double $$1 = this.d == null ? 0.0 : this.d.c(this.a.dA(), this.a.dC(), this.a.dG());
      if ($$1 < 100.0 || $$1 > 22500.0 || this.a.P || this.a.Q) {
         this.b($$0);
      }
   }

   @Nullable
   @Override
   public fcu f() {
      return this.d;
   }

   private void b(arn $$0) {
      if (this.c == null || this.c.c()) {
         int $$1 = this.a.n();
         jj $$2 = $$0.a(eel.a.f, ehq.a(this.a.j()));
         cqi $$3 = $$0.a(b, this.a, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
         int $$5;
         if ($$3 != null) {
            fcu $$4 = new fcu($$3.dA(), 0.0, $$3.dG()).d();
            $$5 = this.a.q(-$$4.d * 40.0, 105.0, -$$4.f * 40.0);
         } else {
            $$5 = this.a.q(40.0, (double)$$2.v(), 0.0);
         }

         evf $$7 = new evf($$2.u(), $$2.v(), $$2.w());
         this.c = this.a.a($$1, $$5, $$7);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.i();
      if (this.c != null && this.c.c()) {
         this.a.t().a(clw.d);
      }
   }

   private void i() {
      if (this.c != null && !this.c.c()) {
         kn $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dY().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new fcu($$1, $$3, $$2);
      }
   }
}
