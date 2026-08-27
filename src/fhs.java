public class fhs<T extends bkl & cap> extends fgk<T> {
   public fhs(fiw $$0) {
      super($$0);
   }

   public static fjc c() {
      fje $$0 = fgk.a(fja.a, 0.0F);
      fjf $$1 = $$0.a();
      $$1.a("right_arm", fjb.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fiy.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fjb.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fiy.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fjb.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fiy.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fjb.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fiy.a(2.0F, 12.0F, 0.0F));
      return fjc.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fgk.a.a;
      this.r = fgk.a.a;
      ckj $$4 = $$0.b(bia.a);
      if ($$4.a(ckm.nG) && $$0.fW()) {
         if ($$0.fm() == bkd.b) {
            this.s = fgk.a.d;
         } else {
            this.r = fgk.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      ckj $$6 = $$0.eS();
      if ($$0.fW() && ($$6.b() || !$$6.a(ckm.nG))) {
         float $$7 = asy.a(this.c * (float) Math.PI);
         float $$8 = asy.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fex.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bkd $$0, emh $$1) {
      float $$2 = $$0 == bkd.b ? 1.0F : -1.0F;
      fiw $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
