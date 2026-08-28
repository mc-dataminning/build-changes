public class cuh extends ctw {
   private static final akj<Boolean> c = akn.a(cuh.class, akl.k);
   private static final int d = 3600;
   private static final int h = 32000;
   private int i;
   public fex b = fex.c;

   public cuh(bwr<? extends cuh> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean z() {
      return true;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   @Override
   public void h() {
      super.h();
      if (!this.dU().w_()) {
         if (this.i > 0) {
            this.i--;
         }

         if (this.i <= 0) {
            this.b = fex.c;
         }

         this.q(this.i > 0);
      }

      if (this.q() && this.ae.a(4) == 0) {
         this.dU().a(ly.aa, this.dz(), this.dB() + 0.8, this.dF(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double a(arq $$0) {
      return this.bh() ? super.a($$0) * 0.75 : super.a($$0) * 0.5;
   }

   @Override
   protected czg o() {
      return czo.ox;
   }

   @Override
   public czk dH() {
      return new czk(czo.ox);
   }

   @Override
   protected fex a(fex $$0) {
      fex $$1;
      if (this.b.h() > 1.0E-7) {
         this.b = this.k($$0);
         $$1 = $$0.d(0.8, 0.0, 0.8).e(this.b);
         if (this.bh()) {
            $$1 = $$1.c(0.1);
         }
      } else {
         $$1 = $$0.d(0.98, 0.0, 0.98);
      }

      return super.a($$1);
   }

   private fex k(fex $$0) {
      double $$1 = 1.0E-4;
      double $$2 = 0.001;
      return this.b.j() > 1.0E-4 && $$0.j() > 0.001 ? this.b.i($$0).d().c(this.b.g()) : this.b;
   }

   @Override
   public bug a(crj $$0, buf $$1) {
      czk $$2 = $$0.b($$1);
      if ($$2.a(axk.bQ) && this.i + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.i += 3600;
      }

      if (this.i > 0) {
         this.b = this.ds().d($$0.ds()).f();
      }

      return bug.a;
   }

   @Override
   protected void b(tz $$0) {
      super.b($$0);
      $$0.a("PushX", this.b.d);
      $$0.a("PushZ", this.b.f);
      $$0.a("Fuel", (short)this.i);
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      double $$1 = $$0.i("PushX");
      double $$2 = $$0.i("PushZ");
      this.b = new fex($$1, 0.0, $$2);
      this.i = $$0.e("Fuel");
   }

   protected boolean q() {
      return this.al.a(c);
   }

   protected void q(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public eao v() {
      return dmo.cO.m().b(dpx.a, jb.c).b(dpx.b, Boolean.valueOf(this.q()));
   }
}
