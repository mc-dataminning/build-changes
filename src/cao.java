import javax.annotation.Nullable;

public class cao extends cak {
   private static final bwt b = bwt.a().d();
   @Nullable
   private eez c;
   @Nullable
   private elm d;
   private boolean e;

   public cao(cai $$0) {
      super($$0);
   }

   @Override
   public cay<cao> i() {
      return cay.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dr(), this.a.dt(), this.a.dx());
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
   public elm g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         hx $$0 = this.a.dM().a(doj.a.f, new hx(drm.a(this.a.u())));
         int $$1 = this.a.gc() == null ? 0 : this.a.gc().e();
         if (this.a.eg().a($$1 + 3) == 0) {
            this.a.gb().a(cay.c);
            return;
         }

         cfb $$2 = this.a.dM().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dk()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.eg().a((int)($$3 + 2.0)) == 0 || this.a.eg().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.A();
         int $$6 = $$5;
         if (this.a.eg().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.gc() != null && this.a.gc().e() >= 0) {
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

   private void a(cfb $$0) {
      this.a.gb().a(cay.b);
      this.a.gb().b(cay.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         jb $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.eg().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new elm($$1, $$3, $$2);
      }
   }

   @Override
   public void a(cah $$0, hx $$1, bkn $$2, @Nullable cfb $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
