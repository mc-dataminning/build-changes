public class cuk extends ctz {
   private static final akj<Boolean> c = akn.a(cuk.class, akl.k);
   private static final int d = 3600;
   private static final int h = 32000;
   private int i;
   public ffc b = ffc.c;

   public cuk(bwr<? extends cuk> $$0, djm $$1) {
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
            this.b = ffc.c;
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
   protected czj o() {
      return czr.ox;
   }

   @Override
   public czn dH() {
      return new czn(czr.ox);
   }

   @Override
   protected ffc a(ffc $$0) {
      ffc $$1;
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

   private ffc k(ffc $$0) {
      double $$1 = 1.0E-4;
      double $$2 = 0.001;
      return this.b.j() > 1.0E-4 && $$0.j() > 0.001 ? this.b.i($$0).d().c(this.b.g()) : this.b;
   }

   @Override
   public bug a(crm $$0, buf $$1) {
      czn $$2 = $$0.b($$1);
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
      this.b = new ffc($$1, 0.0, $$2);
      this.i = $$0.e("Fuel");
   }

   protected boolean q() {
      return this.al.a(c);
   }

   protected void q(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public eat v() {
      return dmt.cO.m().b(dqc.a, jb.c).b(dqc.b, Boolean.valueOf(this.q()));
   }
}
