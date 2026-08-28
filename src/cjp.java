import javax.annotation.Nullable;

public class cjp extends cjl {
   private static final cfm b = cfm.a().d();
   @Nullable
   private ers c;
   @Nullable
   private ezh d;
   private boolean e;

   public cjp(cjj $$0) {
      super($$0);
   }

   @Override
   public cjz<cjp> i() {
      return cjz.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dC(), this.a.dE(), this.a.dI());
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
   public ezh g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         jg $$0 = this.a.dX().a(eaz.a.f, new jg(eee.a(this.a.q())));
         int $$1 = this.a.gt() == null ? 0 : this.a.gt().e();
         if (this.a.ea().a($$1 + 3) == 0) {
            this.a.gs().a(cjz.c);
            return;
         }

         coh $$2 = this.a.dX().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dv()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.ea().a((int)($$3 + 2.0)) == 0 || this.a.ea().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.y();
         int $$6 = $$5;
         if (this.a.ea().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.gt() != null && this.a.gt().e() >= 0) {
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

   private void a(coh $$0) {
      this.a.gs().a(cjz.b);
      this.a.gs().b(cjz.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         kk $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.ea().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ezh($$1, $$3, $$2);
      }
   }

   @Override
   public void a(cji $$0, jg $$1, bsp $$2, @Nullable coh $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
