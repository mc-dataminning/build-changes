public class fkt<T extends blx & ccd> extends fjl<T> {
   public fkt(fly $$0) {
      super($$0);
   }

   public static fme c() {
      fmg $$0 = fjl.a(fmc.a, 0.0F);
      fmh $$1 = $$0.a();
      $$1.a("right_arm", fmd.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fma.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fmd.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fma.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fmd.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fma.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fmd.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fma.a(2.0F, 12.0F, 0.0F));
      return fme.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fjl.a.a;
      this.r = fjl.a.a;
      cmh $$4 = $$0.b(bjk.a);
      if ($$4.a(cmk.or) && $$0.fW()) {
         if ($$0.fm() == blp.b) {
            this.s = fjl.a.d;
         } else {
            this.r = fjl.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cmh $$6 = $$0.eT();
      if ($$0.fW() && ($$6.b() || !$$6.a(cmk.or))) {
         float $$7 = aty.a(this.c * (float) Math.PI);
         float $$8 = aty.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fhx.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(blp $$0, epd $$1) {
      float $$2 = $$0 == blp.b ? 1.0F : -1.0F;
      fly $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
