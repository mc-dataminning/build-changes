import javax.annotation.Nullable;

public class cmw extends cmj {
   private boolean b;
   @Nullable
   private exj c;
   @Nullable
   private fex d;

   public cmw(cmh $$0) {
      super($$0);
   }

   @Override
   public void a(arq $$0) {
      if (!this.b && this.c != null) {
         iv $$1 = $$0.a(egn.a.f, ejs.a(this.a.j()));
         if (!$$1.a(this.a.ds(), 10.0)) {
            this.a.t().a(cmx.a);
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
      int $$0 = this.a.n();
      fex $$1 = this.a.J(1.0F);
      int $$2 = this.a.q(-$$1.d * 40.0, 105.0, -$$1.f * 40.0);
      if (this.a.x() != null && this.a.x().e() > 0) {
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
            ka $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.dX().i() * 20.0F);
            } while ($$1 < (double)$$0.v());

            this.d = new fex((double)$$0.u(), $$1, (double)$$0.w());
         }
      }
   }

   @Nullable
   @Override
   public fex f() {
      return this.d;
   }

   @Override
   public cmx<cmw> h() {
      return cmx.e;
   }
}
