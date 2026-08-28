import javax.annotation.Nullable;

public class ckt extends ckn {
   private static final cgo b = cgo.a().d();
   @Nullable
   private eue c;
   @Nullable
   private fbr d;

   public ckt(ckl $$0) {
      super($$0);
   }

   @Override
   public clb<ckt> h() {
      return clb.c;
   }

   @Override
   public void c() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void a(arx $$0) {
      double $$1 = this.d == null ? 0.0 : this.d.c(this.a.dB(), this.a.dD(), this.a.dH());
      if ($$1 < 100.0 || $$1 > 22500.0 || this.a.P || this.a.Q) {
         this.b($$0);
      }
   }

   @Nullable
   @Override
   public fbr f() {
      return this.d;
   }

   private void b(arx $$0) {
      if (this.c == null || this.c.c()) {
         int $$1 = this.a.t();
         jh $$2 = $$0.a(edj.a.f, ego.a(this.a.m()));
         cpo $$3 = $$0.a(b, this.a, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
         int $$5;
         if ($$3 != null) {
            fbr $$4 = new fbr($$3.dB(), 0.0, $$3.dH()).d();
            $$5 = this.a.q(-$$4.d * 40.0, 105.0, -$$4.f * 40.0);
         } else {
            $$5 = this.a.q(40.0, (double)$$2.v(), 0.0);
         }

         euc $$7 = new euc($$2.u(), $$2.v(), $$2.w());
         this.c = this.a.a($$1, $$5, $$7);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.i();
      if (this.c != null && this.c.c()) {
         this.a.gk().a(clb.d);
      }
   }

   private void i() {
      if (this.c != null && !this.c.c()) {
         kl $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dZ().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new fbr($$1, $$3, $$2);
      }
   }
}
