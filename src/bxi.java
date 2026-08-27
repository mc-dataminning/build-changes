import javax.annotation.Nullable;

public class bxi extends bxe {
   private static final btn b = btn.a().d();
   @Nullable
   private eaw c;
   @Nullable
   private ehi d;
   private boolean e;

   public bxi(bxc $$0) {
      super($$0);
   }

   @Override
   public bxs<bxi> i() {
      return bxs.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dp(), this.a.dr(), this.a.dv());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.P || this.a.Q) {
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
   public ehi g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         gw $$0 = this.a.dK().a(dkn.a.f, new gw(dnq.a(this.a.p())));
         int $$1 = this.a.fY() == null ? 0 : this.a.fY().e();
         if (this.a.ee().a($$1 + 3) == 0) {
            this.a.fX().a(bxs.c);
            return;
         }

         cbp $$2 = this.a.dK().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.di()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.ee().a((int)($$3 + 2.0)) == 0 || this.a.ee().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.t();
         int $$6 = $$5;
         if (this.a.ee().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.fY() != null && this.a.fY().e() >= 0) {
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

   private void a(cbp $$0) {
      this.a.fX().a(bxs.b);
      this.a.fX().b(bxs.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         ib $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.ee().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ehi($$1, $$3, $$2);
      }
   }

   @Override
   public void a(bxb $$0, gw $$1, bhj $$2, @Nullable cbp $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
