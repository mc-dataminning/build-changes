import javax.annotation.Nullable;

public class chu extends chq {
   private static final cdt b = cdt.a().d();
   @Nullable
   private eox c;
   @Nullable
   private ewh d;
   private boolean e;

   public chu(cho $$0) {
      super($$0);
   }

   @Override
   public cie<chu> i() {
      return cie.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dw(), this.a.dy(), this.a.dC());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.Q || this.a.R) {
         this.j();
      }
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Nullable
   @Override
   public ewh g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         ja $$0 = this.a.dR().a(dyg.a.f, new ja(ebk.a(this.a.s())));
         int $$1 = this.a.gl() == null ? 0 : this.a.gl().e();
         if (this.a.dU().a($$1 + 3) == 0) {
            this.a.gk().a(cie.c);
            return;
         }

         cml $$2 = this.a.dR().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dp()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.dU().a((int)($$3 + 2.0)) == 0 || this.a.dU().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.x();
         int $$6 = $$5;
         if (this.a.dU().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.gl() != null && this.a.gl().e() >= 0) {
            $$6 %= 12;
            if ($$6 < 0) {
               $$6 += 12;
            }
         } else {
            $$6 -= 12;
            $$6 &= 7;
            $$6 += 12;
         }

         this.c = this.a.a($$5, $$6, null);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
   }

   private void a(cml $$0) {
      this.a.gk().a(cie.b);
      this.a.gk().b(cie.b).a($$0);
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

   @Override
   public void a(chn $$0, ja $$1, bra $$2, @Nullable cml $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
