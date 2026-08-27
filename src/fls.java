public class fls<T extends bmn & cct> extends fkk<T> {
   public fls(fmx $$0) {
      super($$0);
   }

   public static fnd c() {
      fnf $$0 = fkk.a(fnb.a, 0.0F);
      fng $$1 = $$0.a();
      $$1.a("right_arm", fnc.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fmz.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fnc.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fmz.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fnc.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fmz.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fnc.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fmz.a(2.0F, 12.0F, 0.0F));
      return fnd.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fkk.a.a;
      this.r = fkk.a.a;
      cmy $$4 = $$0.b(bka.a);
      if ($$4.a(cnb.or) && $$0.fW()) {
         if ($$0.fm() == bmf.b) {
            this.s = fkk.a.d;
         } else {
            this.r = fkk.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cmy $$6 = $$0.eT();
      if ($$0.fW() && ($$6.b() || !$$6.a(cnb.or))) {
         float $$7 = auo.a(this.c * (float) Math.PI);
         float $$8 = auo.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fiw.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bmf $$0, eqb $$1) {
      float $$2 = $$0 == bmf.b ? 1.0F : -1.0F;
      fmx $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
