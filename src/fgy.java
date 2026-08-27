public class fgy<T extends bji & bzm> extends ffq<T> {
   public fgy(fic $$0) {
      super($$0);
   }

   public static fii c() {
      fik $$0 = ffq.a(fig.a, 0.0F);
      fil $$1 = $$0.a();
      $$1.a("right_arm", fih.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fie.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fih.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fie.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fih.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fie.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fih.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fie.a(2.0F, 12.0F, 0.0F));
      return fii.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = ffq.a.a;
      this.r = ffq.a.a;
      cjf $$4 = $$0.b(bgx.a);
      if ($$4.a(cji.nG) && $$0.fV()) {
         if ($$0.fl() == bja.b) {
            this.s = ffq.a.d;
         } else {
            this.r = ffq.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cjf $$6 = $$0.eS();
      if ($$0.fV() && ($$6.b() || !$$6.a(cji.nG))) {
         float $$7 = arx.a(this.c * (float) Math.PI);
         float $$8 = arx.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fed.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bja $$0, elp $$1) {
      float $$2 = $$0 == bja.b ? 1.0F : -1.0F;
      fic $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
