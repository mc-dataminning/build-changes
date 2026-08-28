import javax.annotation.Nullable;

public class cnv extends cni {
   private boolean b;
   @Nullable
   private eyo c;
   @Nullable
   private fgc d;

   public cnv(cng $$0) {
      super($$0);
   }

   @Override
   public void a(asb $$0) {
      if (!this.b && this.c != null) {
         iw $$1 = $$0.a(ehp.a.f, eku.a(this.a.m()));
         if (!$$1.a(this.a.dt(), 10.0)) {
            this.a.gr().a(cnw.a);
         }
      } else {
         this.b = false;
         this.i();
      }
   }

   @Override
   public void c() {
      this.b = true;
      this.c = null;
      this.d = null;
   }

   private void i() {
      int $$0 = this.a.u();
      fgc $$1 = this.a.J(1.0F);
      int $$2 = this.a.q(-$$1.d * 40.0, 105.0, -$$1.f * 40.0);
      if (this.a.gs() != null && this.a.gs().e() > 0) {
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
      this.j();
   }

   private void j() {
      if (this.c != null) {
         this.c.a();
         if (!this.c.c()) {
            kb $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.dY().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new fgc((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public fgc f() {
      return this.d;
   }

   @Override
   public cnw<cnv> h() {
      return cnw.e;
   }
}
