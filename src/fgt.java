public class fgt<T extends bjo & bzs> extends ffl<T> {
   public fgt(fhx $$0) {
      super($$0);
   }

   public static fid c() {
      fif $$0 = ffl.a(fib.a, 0.0F);
      fig $$1 = $$0.a();
      $$1.a("right_arm", fic.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhz.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fic.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhz.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fic.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhz.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fic.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhz.a(2.0F, 12.0F, 0.0F));
      return fid.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = ffl.a.a;
      this.r = ffl.a.a;
      cjl $$4 = $$0.b(bhd.a);
      if ($$4.a(cjo.nG) && $$0.fW()) {
         if ($$0.fm() == bjg.b) {
            this.s = ffl.a.d;
         } else {
            this.r = ffl.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cjl $$6 = $$0.eS();
      if ($$0.fW() && ($$6.b() || !$$6.a(cjo.nG))) {
         float $$7 = asb.a(this.c * (float) Math.PI);
         float $$8 = asb.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fdy.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bjg $$0, elj $$1) {
      float $$2 = $$0 == bjg.b ? 1.0F : -1.0F;
      fhx $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
