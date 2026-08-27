public class fsh<T extends bqq & chd> extends fqz<T> {
   public fsh(ftm $$0) {
      super($$0);
   }

   public static fts e() {
      ftu $$0 = fqz.a(ftq.a, 0.0F);
      ftv $$1 = $$0.a();
      a($$1);
      return fts.a($$0, 64, 32);
   }

   protected static void a(ftv $$0) {
      $$0.a("right_arm", ftr.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fto.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", ftr.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fto.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", ftr.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fto.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", ftr.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fto.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fqz.a.a;
      this.r = fqz.a.a;
      crj $$4 = $$0.b(bnz.a);
      if ($$4.a(crm.ot) && $$0.gf()) {
         if ($$0.fr() == bqi.b) {
            this.s = fqz.a.d;
         } else {
            this.r = fqz.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      crj $$6 = $$0.eU();
      if ($$0.gf() && ($$6.d() || !$$6.a(crm.ot))) {
         float $$7 = axk.a(this.c * (float) Math.PI);
         float $$8 = axk.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fpj.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bqi $$0, ewi $$1) {
      float $$2 = $$0 == bqi.b ? 1.0F : -1.0F;
      ftm $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
