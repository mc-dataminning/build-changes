public class fha<T extends bjk & bzo> extends ffs<T> {
   public fha(fie $$0) {
      super($$0);
   }

   public static fik c() {
      fim $$0 = ffs.a(fii.a, 0.0F);
      fin $$1 = $$0.a();
      $$1.a("right_arm", fij.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fig.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fij.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fig.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fij.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fig.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fij.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fig.a(2.0F, 12.0F, 0.0F));
      return fik.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = ffs.a.a;
      this.r = ffs.a.a;
      cjh $$4 = $$0.b(bgz.a);
      if ($$4.a(cjk.nG) && $$0.fV()) {
         if ($$0.fl() == bjc.b) {
            this.s = ffs.a.d;
         } else {
            this.r = ffs.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cjh $$6 = $$0.eS();
      if ($$0.fV() && ($$6.b() || !$$6.a(cjk.nG))) {
         float $$7 = ary.a(this.c * (float) Math.PI);
         float $$8 = ary.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fef.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bjc $$0, elr $$1) {
      float $$2 = $$0 == bjc.b ? 1.0F : -1.0F;
      fie $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
