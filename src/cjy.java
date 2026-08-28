import javax.annotation.Nullable;

public class cjy extends cju {
   private static final cfv b = cfv.a().d();
   @Nullable
   private esc c;
   @Nullable
   private ezr d;
   private boolean e;

   public cjy(cjs $$0) {
      super($$0);
   }

   @Override
   public cki<cjy> i() {
      return cki.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dD(), this.a.dF(), this.a.dJ());
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
   public ezr g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         jh $$0 = this.a.dY().a(ebj.a.f, new jh(eeo.a(this.a.q())));
         int $$1 = this.a.gt() == null ? 0 : this.a.gt().e();
         if (this.a.eb().a($$1 + 3) == 0) {
            this.a.gs().a(cki.c);
            return;
         }

         cor $$2 = this.a.dY().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dw()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.eb().a((int)($$3 + 2.0)) == 0 || this.a.eb().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.y();
         int $$6 = $$5;
         if (this.a.eb().a(8) == 0) {
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

   private void a(cor $$0) {
      this.a.gs().a(cki.b);
      this.a.gs().b(cki.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         kl $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.eb().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new ezr($$1, $$3, $$2);
      }
   }

   @Override
   public void a(cjr $$0, jh $$1, bsy $$2, @Nullable cor $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
