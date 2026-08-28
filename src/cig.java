import javax.annotation.Nullable;

public class cig extends cia {
   private static final ced b = ced.a().d();
   @Nullable
   private epm c;
   @Nullable
   private eww d;

   public cig(chy $$0) {
      super($$0);
   }

   @Override
   public cio<cig> i() {
      return cio.c;
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dv(), this.a.dx(), this.a.dB());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.Q || this.a.R) {
         this.j();
      }
   }

   @Nullable
   @Override
   public eww g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.x();
         jd $$1 = this.a.dQ().a(dyv.a.f, ebz.a(this.a.s()));
         cmv $$2 = this.a.dQ().a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            eww $$3 = new eww($$2.dv(), 0.0, $$2.dB()).d();
            $$4 = this.a.q(-$$3.c * 40.0, 105.0, -$$3.e * 40.0);
         } else {
            $$4 = this.a.q(40.0, (double)$$1.v(), 0.0);
         }

         epk $$6 = new epk($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.gj().a(cio.d);
      }
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
}
