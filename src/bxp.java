import javax.annotation.Nullable;

public class bxp extends bxl {
   private static final btu b = btu.a().d();
   @Nullable
   private ebd c;
   @Nullable
   private ehp d;
   private boolean e;

   public bxp(bxj $$0) {
      super($$0);
   }

   @Override
   public bxz<bxp> i() {
      return bxz.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dq(), this.a.ds(), this.a.dw());
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
   public ehp g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         gw $$0 = this.a.dL().a(dku.a.f, new gw(dnx.a(this.a.s())));
         int $$1 = this.a.gb() == null ? 0 : this.a.gb().e();
         if (this.a.ef().a($$1 + 3) == 0) {
            this.a.ga().a(bxz.c);
            return;
         }

         cbw $$2 = this.a.dL().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dj()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.ef().a((int)($$3 + 2.0)) == 0 || this.a.ef().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.y();
         int $$6 = $$5;
         if (this.a.ef().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.gb() != null && this.a.gb().e() >= 0) {
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

   private void a(cbw $$0) {
      this.a.ga().a(bxz.b);
      this.a.ga().b(bxz.b).a($$0);
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

         this.d = new ehp($$1, $$3, $$2);
      }
   }

   @Override
   public void a(bxi $$0, gw $$1, bhq $$2, @Nullable cbw $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
