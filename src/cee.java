import javax.annotation.Nullable;

public class cee extends cea {
   private static final caf b = caf.a().d();
   @Nullable
   private ejd c;
   @Nullable
   private ept d;
   private boolean e;

   public cee(cdy $$0) {
      super($$0);
   }

   @Override
   public ceo<cee> i() {
      return ceo.a;
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
   public ept g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         ib $$0 = this.a.dM().a(dso.a.f, new ib(dvr.a(this.a.r())));
         int $$1 = this.a.gl() == null ? 0 : this.a.gl().e();
         if (this.a.ei().a($$1 + 3) == 0) {
            this.a.gk().a(ceo.c);
            return;
         }

         ciu $$2 = this.a.dM().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
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

   private void a(ciu $$0) {
      this.a.gk().a(ceo.b);
      this.a.gk().b(ceo.b).a($$0);
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

         this.d = new ept($$1, $$3, $$2);
      }
   }

   @Override
   public void a(cdx $$0, ib $$1, bnw $$2, @Nullable ciu $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
