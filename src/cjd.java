import javax.annotation.Nullable;

public class cjd extends ciz {
   private static final cfa b = cfa.a().d();
   @Nullable
   private erd c;
   @Nullable
   private eys d;
   private boolean e;

   public cjd(cix $$0) {
      super($$0);
   }

   @Override
   public cjn<cjd> i() {
      return cjn.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dx(), this.a.dz(), this.a.dD());
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
   public eys g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         je $$0 = this.a.dS().a(eak.a.f, new je(edp.a(this.a.q())));
         int $$1 = this.a.gn() == null ? 0 : this.a.gn().e();
         if (this.a.dV().a($$1 + 3) == 0) {
            this.a.gm().a(cjn.c);
            return;
         }

         cnu $$2 = this.a.dS().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dq()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.dV().a((int)($$3 + 2.0)) == 0 || this.a.dV().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.y();
         int $$6 = $$5;
         if (this.a.dV().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.gn() != null && this.a.gn().e() >= 0) {
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

   private void a(cnu $$0) {
      this.a.gm().a(cjn.b);
      this.a.gm().b(cjn.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         ki $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dV().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new eys($$1, $$3, $$2);
      }
   }

   @Override
   public void a(ciw $$0, je $$1, bsg $$2, @Nullable cnu $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
