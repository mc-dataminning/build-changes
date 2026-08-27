import javax.annotation.Nullable;

public class bxp extends bxj {
   private static final bts b = bts.a().d();
   @Nullable
   private ebb c;
   @Nullable
   private ehn d;

   public bxp(bxh $$0) {
      super($$0);
   }

   @Override
   public bxx<bxp> i() {
      return bxx.c;
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dq(), this.a.ds(), this.a.dw());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.P || this.a.Q) {
         this.j();
      }
   }

   @Nullable
   @Override
   public ehn g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.y();
         gw $$1 = this.a.dL().a(dks.a.f, dnv.a(this.a.s()));
         cbu $$2 = this.a.dL().a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            ehn $$3 = new ehn($$2.dq(), 0.0, $$2.dw()).d();
            $$4 = this.a.r(-$$3.c * 40.0, 105.0, -$$3.e * 40.0);
         } else {
            $$4 = this.a.r(40.0, (double)$$1.v(), 0.0);
         }

         eaz $$6 = new eaz($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.ga().a(bxx.d);
      }
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         ib $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.ef().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ehn($$1, $$3, $$2);
      }
   }
}
