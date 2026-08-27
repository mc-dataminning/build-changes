public class fjp<T extends bln & cbr> extends fih<T> {
   public fjp(fkt $$0) {
      super($$0);
   }

   public static fkz c() {
      flb $$0 = fih.a(fkx.a, 0.0F);
      flc $$1 = $$0.a();
      $$1.a("right_arm", fky.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fkv.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fky.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fkv.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fky.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fkv.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fky.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fkv.a(2.0F, 12.0F, 0.0F));
      return fkz.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fih.a.a;
      this.r = fih.a.a;
      clo $$4 = $$0.b(bja.a);
      if ($$4.a(clr.or) && $$0.fX()) {
         if ($$0.fn() == blf.b) {
            this.s = fih.a.d;
         } else {
            this.r = fih.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      clo $$6 = $$0.eU();
      if ($$0.fX() && ($$6.b() || !$$6.a(clr.or))) {
         float $$7 = atq.a(this.c * (float) Math.PI);
         float $$8 = atq.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fgu.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(blf $$0, eob $$1) {
      float $$2 = $$0 == blf.b ? 1.0F : -1.0F;
      fkt $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
