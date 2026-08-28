import javax.annotation.Nullable;

public class chq extends chm {
   private static final cdp b = cdp.a().d();
   @Nullable
   private eop c;
   @Nullable
   private evz d;
   private boolean e;

   public chq(chk $$0) {
      super($$0);
   }

   @Override
   public cia<chq> i() {
      return cia.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.du(), this.a.dw(), this.a.dA());
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
   public evz g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         ja $$0 = this.a.dP().a(dxz.a.f, new ja(ebd.a(this.a.s())));
         int $$1 = this.a.gl() == null ? 0 : this.a.gl().e();
         if (this.a.dS().a($$1 + 3) == 0) {
            this.a.gk().a(cia.c);
            return;
         }

         cmh $$2 = this.a.dP().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dn()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.dS().a((int)($$3 + 2.0)) == 0 || this.a.dS().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.y();
         int $$6 = $$5;
         if (this.a.dS().a(8) == 0) {
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

   private void a(cmh $$0) {
      this.a.gk().a(cia.b);
      this.a.gk().b(cia.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         ke $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dS().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new evz($$1, $$3, $$2);
      }
   }

   @Override
   public void a(chj $$0, ja $$1, bqw $$2, @Nullable cmh $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
