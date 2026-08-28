import javax.annotation.Nullable;

public class ckr extends ckn {
   private static final cgo b = cgo.a().d();
   @Nullable
   private eue c;
   @Nullable
   private fbr d;
   private boolean e;

   public ckr(ckl $$0) {
      super($$0);
   }

   @Override
   public clb<ckr> h() {
      return clb.a;
   }

   @Override
   public void a(arx $$0) {
      double $$1 = this.d == null ? 0.0 : this.d.c(this.a.dB(), this.a.dD(), this.a.dH());
      if ($$1 < 100.0 || $$1 > 22500.0 || this.a.P || this.a.Q) {
         this.b($$0);
      }
   }

   @Override
   public void c() {
      this.c = null;
      this.d = null;
   }

   @Nullable
   @Override
   public fbr f() {
      return this.d;
   }

   private void b(arx $$0) {
      if (this.c != null && this.c.c()) {
         jh $$1 = $$0.a(edj.a.f, ego.a(this.a.m()));
         int $$2 = this.a.gl() == null ? 0 : this.a.gl().e();
         if (this.a.dZ().a($$2 + 3) == 0) {
            this.a.gk().a(clb.c);
            return;
         }

         cpo $$3 = $$0.a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         double $$4;
         if ($$3 != null) {
            $$4 = $$1.b($$3.du()) / 512.0;
         } else {
            $$4 = 64.0;
         }

         if ($$3 != null && (this.a.dZ().a((int)($$4 + 2.0)) == 0 || this.a.dZ().a($$2 + 2) == 0)) {
            this.a($$3);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$6 = this.a.t();
         int $$7 = $$6;
         if (this.a.dZ().a(8) == 0) {
            this.e = !this.e;
            $$7 = $$6 + 6;
         }

         if (this.e) {
            $$7++;
         } else {
            $$7--;
         }

         if (this.a.gl() != null && this.a.gl().e() >= 0) {
            $$7 %= 12;
            if ($$7 < 0) {
               $$7 += 12;
            }
         } else {
            $$7 -= 12;
            $$7 &= 7;
            $$7 += 12;
         }

         this.c = this.a.a($$6, $$7, null);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.i();
   }

   private void a(cpo $$0) {
      this.a.gk().a(clb.b);
      this.a.gk().b(clb.b).a($$0);
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

   @Override
   public void a(ckk $$0, jh $$1, btr $$2, @Nullable cpo $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
