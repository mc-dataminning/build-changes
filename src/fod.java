public class fod<T extends bok & cev> extends fmv<T> {
   public fod(fpj $$0) {
      super($$0);
   }

   public static fpp c() {
      fpr $$0 = fmv.a(fpn.a, 0.0F);
      fps $$1 = $$0.a();
      $$1.a("right_arm", fpo.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fpl.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fpo.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fpl.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fpo.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fpl.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fpo.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fpl.a(2.0F, 12.0F, 0.0F));
      return fpp.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fmv.a.a;
      this.r = fmv.a.a;
      cpd $$4 = $$0.b(blv.a);
      if ($$4.a(cpg.ot) && $$0.fY()) {
         if ($$0.fm() == boc.b) {
            this.s = fmv.a.d;
         } else {
            this.r = fmv.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cpd $$6 = $$0.eT();
      if ($$0.fY() && ($$6.b() || !$$6.a(cpg.ot))) {
         float $$7 = awi.a(this.c * (float) Math.PI);
         float $$8 = awi.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         flg.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(boc $$0, esh $$1) {
      float $$2 = $$0 == boc.b ? 1.0F : -1.0F;
      fpj $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
