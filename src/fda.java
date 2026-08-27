public class fda<T extends bgb & bwg> extends fbs<T> {
   public fda(fee $$0) {
      super($$0);
   }

   public static fek c() {
      fem $$0 = fbs.a(fei.a, 0.0F);
      fen $$1 = $$0.a();
      $$1.a("right_arm", fej.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), feg.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fej.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), feg.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fej.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), feg.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fej.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), feg.a(2.0F, 12.0F, 0.0F));
      return fek.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fbs.a.a;
      this.r = fbs.a.a;
      cfz $$4 = $$0.b(bdw.a);
      if ($$4.a(cgc.nG) && $$0.fS()) {
         if ($$0.fh() == bft.b) {
            this.s = fbs.a.d;
         } else {
            this.r = fbs.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cfz $$6 = $$0.eO();
      if ($$0.fS() && ($$6.b() || !$$6.a(cgc.nG))) {
         float $$7 = apa.a(this.c * (float) Math.PI);
         float $$8 = apa.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         faf.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bft $$0, eij $$1) {
      float $$2 = $$0 == bft.b ? 1.0F : -1.0F;
      fee $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
