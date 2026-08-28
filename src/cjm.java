import javax.annotation.Nullable;

public class cjm extends ciz {
   private boolean b;
   @Nullable
   private erd c;
   @Nullable
   private eys d;

   public cjm(cix $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         je $$0 = this.a.dS().a(eak.a.f, edp.a(this.a.q()));
         if (!$$0.a(this.a.dq(), 10.0)) {
            this.a.gm().a(cjn.a);
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
      eys $$1 = this.a.J(1.0F);
      int $$2 = this.a.q(-$$1.d * 40.0, 105.0, -$$1.f * 40.0);
      if (this.a.gn() != null && this.a.gn().e() > 0) {
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
            ki $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.dV().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new eys((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public eys g() {
      return this.d;
   }

   @Override
   public cjn<cjm> i() {
      return cjn.e;
   }
}
