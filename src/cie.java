import javax.annotation.Nullable;

public class cie extends cia {
   private static final ced b = ced.a().d();
   @Nullable
   private epm c;
   @Nullable
   private eww d;
   private boolean e;

   public cie(chy $$0) {
      super($$0);
   }

   @Override
   public cio<cie> i() {
      return cio.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dv(), this.a.dx(), this.a.dB());
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
   public eww g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         jd $$0 = this.a.dQ().a(dyv.a.f, new jd(ebz.a(this.a.s())));
         int $$1 = this.a.gk() == null ? 0 : this.a.gk().e();
         if (this.a.dT().a($$1 + 3) == 0) {
            this.a.gj().a(cio.c);
            return;
         }

         cmv $$2 = this.a.dQ().a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         double $$3;
         if ($$2 != null) {
            $$3 = $$0.b($$2.do()) / 512.0;
         } else {
            $$3 = 64.0;
         }

         if ($$2 != null && (this.a.dT().a((int)($$3 + 2.0)) == 0 || this.a.dT().a($$1 + 2) == 0)) {
            this.a($$2);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$5 = this.a.x();
         int $$6 = $$5;
         if (this.a.dT().a(8) == 0) {
            this.e = !this.e;
            $$6 = $$5 + 6;
         }

         if (this.e) {
            $$6++;
         } else {
            $$6--;
         }

         if (this.a.gk() != null && this.a.gk().e() >= 0) {
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

   private void a(cmv $$0) {
      this.a.gj().a(cio.b);
      this.a.gj().b(cio.b).a($$0);
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         kh $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dT().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new eww($$1, $$3, $$2);
      }
   }

   @Override
   public void a(chx $$0, jd $$1, brj $$2, @Nullable cmv $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }
   }
}
