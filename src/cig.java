import javax.annotation.Nullable;

public class cig extends cic {
   private static final cef b = cef.a().d();
   @Nullable
   private eps c;
   @Nullable
   private exc d;
   private boolean e;

   public cig(cia $$0) {
      super($$0);
   }

   @Override
   public ciq<cig> i() {
      return ciq.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dt(), this.a.dv(), this.a.dz());
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
   public exc g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         jd $$0 = this.a.dO().a(dyy.a.f, new jd(ecd.a(this.a.s())));
         int $$1 = this.a.gi() == null ? 0 : this.a.gi().e();
         if (this.a.dR().a($$1 + 3) == 0) {
            this.a.gh().a(ciq.c);
            return;
         }

         cmx $$2 = this.a.dO().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.dm()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.dR().a((int)($$3 + 2.0)) == 0 || this.a.dR().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.x();
         int $$6 = $$5;
         if (this.a.dR().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.gi() != null && this.a.gi().e() >= 0) {
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

   private void a(cmx $$0) {
      this.a.gh().a(ciq.b);
      this.a.gh().b(ciq.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         kh $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dR().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new exc($$1, $$3, $$2);
      }
   }

   @Override
   public void a(chz $$0, jd $$1, brk $$2, @Nullable cmx $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
