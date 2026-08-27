public class flk<T extends bmh & ccn> extends fkc<T> {
   public flk(fmp $$0) {
      super($$0);
   }

   public static fmv c() {
      fmx $$0 = fkc.a(fmt.a, 0.0F);
      fmy $$1 = $$0.a();
      $$1.a("right_arm", fmu.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fmr.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fmu.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fmr.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fmu.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fmr.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fmu.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fmr.a(2.0F, 12.0F, 0.0F));
      return fmv.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fkc.a.a;
      this.r = fkc.a.a;
      cmr $$4 = $$0.b(bju.a);
      if ($$4.a(cmu.or) && $$0.fW()) {
         if ($$0.fm() == blz.b) {
            this.s = fkc.a.d;
         } else {
            this.r = fkc.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cmr $$6 = $$0.eT();
      if ($$0.fW() && ($$6.b() || !$$6.a(cmu.or))) {
         float $$7 = aui.a(this.c * (float) Math.PI);
         float $$8 = aui.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fio.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(blz $$0, ept $$1) {
      float $$2 = $$0 == blz.b ? 1.0F : -1.0F;
      fmp $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
