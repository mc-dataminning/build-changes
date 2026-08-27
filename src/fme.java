public class fme<T extends bmq & cda> extends fkw<T> {
   public fme(fnj $$0) {
      super($$0);
   }

   public static fnp c() {
      fnr $$0 = fkw.a(fnn.a, 0.0F);
      fns $$1 = $$0.a();
      $$1.a("right_arm", fno.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fnl.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fno.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fnl.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fno.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fnl.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fno.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fnl.a(2.0F, 12.0F, 0.0F));
      return fnp.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fkw.a.a;
      this.r = fkw.a.a;
      cng $$4 = $$0.b(bkb.a);
      if ($$4.a(cnj.ot) && $$0.fX()) {
         if ($$0.fm() == bmi.b) {
            this.s = fkw.a.d;
         } else {
            this.r = fkw.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cng $$6 = $$0.eT();
      if ($$0.fX() && ($$6.b() || !$$6.a(cnj.ot))) {
         float $$7 = aup.a(this.c * (float) Math.PI);
         float $$8 = aup.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fjh.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bmi $$0, eqk $$1) {
      float $$2 = $$0 == bmi.b ? 1.0F : -1.0F;
      fnj $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
