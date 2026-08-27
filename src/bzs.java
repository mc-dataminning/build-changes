import javax.annotation.Nullable;

public class bzs extends bzo {
   private static final bvx b = bvx.a().d();
   @Nullable
   private edm c;
   @Nullable
   private ejz d;
   private boolean e;

   public bzs(bzm $$0) {
      super($$0);
   }

   @Override
   public cac<bzs> i() {
      return cac.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.ds(), this.a.du(), this.a.dy());
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
   public ejz g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         hx $$0 = this.a.dN().a(dmw.a.f, new hx(dpz.a(this.a.u())));
         int $$1 = this.a.gd() == null ? 0 : this.a.gd().e();
         if (this.a.eh().a($$1 + 3) == 0) {
            this.a.gc().a(cac.c);
            return;
         }

         cdz $$2 = this.a.dN().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dl()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.eh().a((int)($$3 + 2.0)) == 0 || this.a.eh().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.A();
         int $$6 = $$5;
         if (this.a.eh().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.gd() != null && this.a.gd().e() >= 0) {
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

   private void a(cdz $$0) {
      this.a.gc().a(cac.b);
      this.a.gc().b(cac.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         ja $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.eh().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ejz($$1, $$3, $$2);
      }
   }

   @Override
   public void a(bzl $$0, hx $$1, bjt $$2, @Nullable cdz $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
