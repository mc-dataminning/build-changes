import javax.annotation.Nullable;

public class cka extends cjw {
   private static final cfx b = cfx.a().d();
   @Nullable
   private etn c;
   @Nullable
   private fba d;
   private boolean e;

   public cka(cju $$0) {
      super($$0);
   }

   @Override
   public ckk<cka> h() {
      return ckk.a;
   }

   @Override
   public void a(arc $$0) {
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
   public fba f() {
      return this.d;
   }

   private void b(arc $$0) {
      if (this.c != null && this.c.c()) {
         ji $$1 = $$0.a(ecs.a.f, efx.a(this.a.m()));
         int $$2 = this.a.gm() == null ? 0 : this.a.gm().e();
         if (this.a.dZ().a($$2 + 3) == 0) {
            this.a.gl().a(ckk.c);
            return;
         }

         cox $$3 = $$0.a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
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

         if (this.a.gm() != null && this.a.gm().e() >= 0) {
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

   private void a(cox $$0) {
      this.a.gl().a(ckk.b);
      this.a.gl().b(ckk.b).a($$0);
   }

   private void i() {
      if (this.c != null && !this.c.c()) {
         km $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dZ().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new fba($$1, $$3, $$2);
      }
   }

   @Override
   public void a(cjt $$0, ji $$1, bta $$2, @Nullable cox $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
