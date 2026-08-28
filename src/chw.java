import javax.annotation.Nullable;

public class chw extends chq {
   private static final cdt b = cdt.a().d();
   @Nullable
   private eox c;
   @Nullable
   private ewh d;

   public chw(cho $$0) {
      super($$0);
   }

   @Override
   public cie<chw> i() {
      return cie.c;
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dw(), this.a.dy(), this.a.dC());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.Q || this.a.R) {
         this.j();
      }
   }

   @Nullable
   @Override
   public ewh g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.x();
         ja $$1 = this.a.dR().a(dyg.a.f, ebk.a(this.a.s()));
         cml $$2 = this.a.dR().a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            ewh $$3 = new ewh($$2.dw(), 0.0, $$2.dC()).d();
            $$4 = this.a.r(-$$3.c * 40.0, 105.0, -$$3.e * 40.0);
         } else {
            $$4 = this.a.r(40.0, (double)$$1.v(), 0.0);
         }

         eov $$6 = new eov($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.gk().a(cie.d);
      }
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         ke $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dU().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ewh($$1, $$3, $$2);
      }
   }
}
