import javax.annotation.Nullable;

public class cjy extends cjl {
   private boolean b;
   @Nullable
   private ers c;
   @Nullable
   private ezh d;

   public cjy(cjj $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         jg $$0 = this.a.dX().a(eaz.a.f, eee.a(this.a.q()));
         if (!$$0.a(this.a.dv(), 10.0)) {
            this.a.gs().a(cjz.a);
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
      int $$0 = this.a.y();
      ezh $$1 = this.a.J(1.0F);
      int $$2 = this.a.q(-$$1.d * 40.0, 105.0, -$$1.f * 40.0);
      if (this.a.gt() != null && this.a.gt().e() > 0) {
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
            kk $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.ea().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new ezh((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public ezh g() {
      return this.d;
   }

   @Override
   public cjz<cjy> i() {
      return cjz.e;
   }
}
