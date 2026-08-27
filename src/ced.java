import javax.annotation.Nullable;

public class ced extends cdz {
   private static final cae b = cae.a().d();
   @Nullable
   private ejc c;
   @Nullable
   private epr d;
   private boolean e;

   public ced(cdx $$0) {
      super($$0);
   }

   @Override
   public cen<ced> i() {
      return cen.a;
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
   public epr g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         ib $$0 = this.a.dM().a(dsm.a.f, new ib(dvp.a(this.a.r())));
         int $$1 = this.a.gl() == null ? 0 : this.a.gl().e();
         if (this.a.ei().a($$1 + 3) == 0) {
            this.a.gk().a(cen.c);
            return;
         }

         cis $$2 = this.a.dM().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dk()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.ei().a((int)($$3 + 2.0)) == 0 || this.a.ei().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.y();
         int $$6 = $$5;
         if (this.a.ei().a(8) == 0) {
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

   private void a(cis $$0) {
      this.a.gk().a(cen.b);
      this.a.gk().b(cen.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         jg $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.ei().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new epr($$1, $$3, $$2);
      }
   }

   @Override
   public void a(cdw $$0, ib $$1, bnv $$2, @Nullable cis $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
