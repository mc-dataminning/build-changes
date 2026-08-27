public class fnw<T extends boi & cer> extends fmo<T> {
   public fnw(fpc $$0) {
      super($$0);
   }

   public static fpi c() {
      fpk $$0 = fmo.a(fpg.a, 0.0F);
      fpl $$1 = $$0.a();
      $$1.a("right_arm", fph.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fpe.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fph.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fpe.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fph.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fpe.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fph.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fpe.a(2.0F, 12.0F, 0.0F));
      return fpi.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fmo.a.a;
      this.r = fmo.a.a;
      coz $$4 = $$0.b(blt.a);
      if ($$4.a(cpc.ot) && $$0.fY()) {
         if ($$0.fm() == boa.b) {
            this.s = fmo.a.d;
         } else {
            this.r = fmo.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      coz $$6 = $$0.eT();
      if ($$0.fY() && ($$6.b() || !$$6.a(cpc.ot))) {
         float $$7 = awh.a(this.c * (float) Math.PI);
         float $$8 = awh.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fkz.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(boa $$0, esa $$1) {
      float $$2 = $$0 == boa.b ? 1.0F : -1.0F;
      fpc $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
