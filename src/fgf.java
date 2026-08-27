public class fgf<T extends biy & bzd> extends fex<T> {
   public fgf(fhj $$0) {
      super($$0);
   }

   public static fhp c() {
      fhr $$0 = fex.a(fhn.a, 0.0F);
      fhs $$1 = $$0.a();
      $$1.a("right_arm", fho.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhl.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fho.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhl.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fho.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhl.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fho.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhl.a(2.0F, 12.0F, 0.0F));
      return fhp.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fex.a.a;
      this.r = fex.a.a;
      ciw $$4 = $$0.b(bgn.a);
      if ($$4.a(ciz.nG) && $$0.fS()) {
         if ($$0.fk() == biq.b) {
            this.s = fex.a.d;
         } else {
            this.r = fex.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      ciw $$6 = $$0.eR();
      if ($$0.fS() && ($$6.b() || !$$6.a(ciz.nG))) {
         float $$7 = aro.a(this.c * (float) Math.PI);
         float $$8 = aro.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fdk.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(biq $$0, elh $$1) {
      float $$2 = $$0 == biq.b ? 1.0F : -1.0F;
      fhj $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
