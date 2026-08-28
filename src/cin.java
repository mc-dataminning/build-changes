import javax.annotation.Nullable;

public class cin extends cia {
   private boolean b;
   @Nullable
   private epm c;
   @Nullable
   private eww d;

   public cin(chy $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         jd $$0 = this.a.dQ().a(dyv.a.f, ebz.a(this.a.s()));
         if (!$$0.a(this.a.do(), 10.0)) {
            this.a.gj().a(cio.a);
         }
      } else {
         this.b = false;
         this.j();
      }
   }

   @Override
   public void d() {
      this.b = true;
      this.c = null;
      this.d = null;
   }

   private void j() {
      int $$0 = this.a.x();
      eww $$1 = this.a.G(1.0F);
      int $$2 = this.a.q(-$$1.c * 40.0, 105.0, -$$1.e * 40.0);
      if (this.a.gk() != null && this.a.gk().e() > 0) {
         $$2 %= 12;
         if ($$2 < 0) {
            $$2 += 12;
         }
      } else {
         $$2 -= 12;
         $$2 &= 7;
         $$2 += 12;
      }

      this.c = this.a.a($$0, $$2, null);
      this.k();
   }

   private void k() {
      if (this.c != null) {
         this.c.a();
         if (!this.c.c()) {
            kh $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.dT().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new eww((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public eww g() {
      return this.d;
   }

   @Override
   public cio<cin> i() {
      return cio.e;
   }
}
